package com.cpf.controller;

import com.cpf.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
@Controller
public class EmployController {
    @Autowired
    private EmployService employService;
    @RequestMapping("deleteEmploy")
    public String deleteEmploy(int id){
        employService.deleteEmployById(id);
        return "forward:/to_employ";
    }
}
