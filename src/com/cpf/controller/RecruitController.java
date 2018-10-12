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
}
