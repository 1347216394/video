package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Speaker;
import com.qf.service.SpeakerService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("speaker")
public class SpeakerController {
    @Autowired
    private SpeakerService speakerService;
    @GetMapping("findAll")
    public List<Speaker> findAll(){
        return speakerService.selectList(null);
    }

    @GetMapping("selectById")
    public Speaker selectById(Integer id){
        return speakerService.selectById(id);
    }

    @GetMapping("findPage")
    public PageInfo findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "3") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Speaker> list = speakerService.selectList(null);
        PageInfo<Speaker> speakerPageInfo = new PageInfo<>(list);
        return speakerPageInfo;
    }

    @DeleteMapping("deleteById")
    public String deleteById(Integer id){
        speakerService.deleteById(id);
        return "success";
    }

    @DeleteMapping("deleteByIds")
    public String deleteByIds(String[] ids){
        speakerService.deleteByIds(ids);
        return "success";
    }

    @PutMapping("insert")
    public String insert(Speaker speaker){
        speakerService.insert(speaker);
        return "success";
    }

    @PostMapping("updateById")
    public String updateById(Speaker speaker){
        System.out.println(speaker);
        speakerService.updateById(speaker);
        return "success";
    }


}
