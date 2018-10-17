package com.cpf.controller;

import com.cpf.entity.Staff;
import com.cpf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16 0016.
 */
@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("staff_admin")
    public String staffAdmin(ModelMap modelMap){
        List<Staff> staffs = staffService.queryAllStaff();
        modelMap.addAttribute("staff",staffs);
        return "staffAdmin";
    }
}
