package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.videos.utils.ImageCut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("user")
@Api(tags = "用户操作")
public class UserController {

    @Autowired
    private UserService userService;

    //    查询所有
    @ApiOperation("查询所有")
    @GetMapping("findAll")
    public List<User> fidAll() {
        return userService.selectList();
    }

    //    根据id查找
    @GetMapping("findById")
    public User findById(Integer id) {
        return userService.selectById(id);
    }

    @ApiOperation("登陆")
    @GetMapping("loginUser")
    public User login(User user,HttpServletRequest request) {
        user = userService.selectEmailAndPassword(user);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("userAccount",user.getEmail());
        }
        return user;
    }

    //    修改用户信息
    @ApiOperation("修改用户")
    @GetMapping("updateUser")
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    //    添加用户
    @ApiOperation("添加用户")
    @GetMapping("insertUser")
    public void insertUser(User user) {
        userService.insertUser(user);
    }

    @ApiOperation("重置密码")
    @GetMapping("resetPassword")
    public String updatePassword(String email, String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("email");
        session.removeAttribute("code");
        User user = userService.selectUserByEmail(email);
        if (user != null) {
            user.setPassword(password);
            userService.updateUser(user);
            session.setAttribute("userAcount", user.getEmail());
        }
        return "redirect:/";
    }

    @RequestMapping("/upLoadImage")
    public String upLoadImage(@RequestParam("image_file") MultipartFile imageFile, String x1, String x2, String y1, String y2, HttpServletRequest request) throws IOException {
        String path = "D:\\server\\apache-tomcat-8.5.31\\webapps\\video\\";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        String filename = imageFile.getOriginalFilename();
        filename = filename.substring(filename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + filename;
        imageFile.transferTo(new File(path, filename));


        int x1Int = (int) Double.parseDouble(x1);
        int x2Int = (int) Double.parseDouble(x2);
        int y1Int = (int) Double.parseDouble(y1);
        int y2Int = (int) Double.parseDouble(y2);
        new ImageCut().cutImage(path + "/" + filename, x1Int, y1Int, x2Int - x1Int, y2Int - y1Int);

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        user.setImgUrl(filename);
        userService.updateUser(user);

        return "redirect:/user/showMyProfile";
    }
}