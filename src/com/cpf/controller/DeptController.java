package com.cpf.controller;

import com.cpf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/15 0015.
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("dept_admin")
    public String deptAdmin(){
        return "deptAdmin";
    }
}
