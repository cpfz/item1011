package com.cpf.controller;

import com.cpf.entity.Recruit;
import com.cpf.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Controller
public class RecruitController {
    @Autowired
    private RecruitService recruitService;

    @RequestMapping("query_recruit")
    public String queryRecruit(ModelMap modelMap){
        List<Recruit> recruits = recruitService.queryRecruit();
        modelMap.addAttribute("recruit",recruits);
        return "recruit";
    }
    @RequestMapping("recruit_admin")
    public String recruitAdmin(ModelMap modelMap){
        List<Recruit> recruits = recruitService.queryRecruit();
        modelMap.addAttribute("recruit",recruits);
        return "recruitAdmin";
    }

    @RequestMapping("delete_recruit")
    public String deleteRecruit(int id){
        recruitService.deleteById(id);
        return "forward:/recruit_admin";
    }

    @RequestMapping("save_recruit")
    public String saveRecruit(){
        return "saveRecruit";
    }

    @RequestMapping("add_recruit")
    public String addRecruit(Recruit recruit){
        recruitService.saveRecruit(recruit);
        return "forward:/recruit_admin";
    }
    @RequestMapping("update_recruit")
    public String updateRecruit(int id,ModelMap modelMap){
        Recruit recruit = recruitService.queryById(id);
        modelMap.addAttribute("recruit",recruit);

        return "updateRecruit";
    }

    @RequestMapping("update")
    public String update(Recruit recruit){
        recruitService.updateRecruit(recruit);
        return "forward:/recruit_admin";
    }
}
