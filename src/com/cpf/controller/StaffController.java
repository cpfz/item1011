package com.cpf.controller;

import com.cpf.dao.LeaveDao;
import com.cpf.entity.Department;
import com.cpf.entity.Leave;
import com.cpf.entity.Staff;
import com.cpf.service.DeptService;
import com.cpf.service.LeaveService;
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
    @Autowired
    private LeaveService leaveService;

    @Autowired
    private DeptService deptService;
    @RequestMapping("staff_admin")
    public String staffAdmin(ModelMap modelMap){
        List<Staff> staffs = staffService.queryAllStaff();
        List<Leave> leaves = leaveService.queryAllLeave();
        modelMap.addAttribute("staff",staffs);
        modelMap.addAttribute("leave",leaves);
        return "staffAdmin";
    }

    @RequestMapping("delete_staff")
    public String deleteStaff(int id){
        Staff staff = staffService.queryStaffById(id);
        staffService.deleteStaffById(id);
        Leave leave=new Leave(staff.getId(),staff.getName(),staff.getTal(),staff.getEmail());
        leaveService.saveLeave(leave);
        return "forward:/staff_admin";
    }

    @RequestMapping("show_staff")
    public String showStaff(int id,ModelMap modelMap){
        Staff staff = staffService.queryStaffById(id);
        modelMap.addAttribute("staff",staff);
        return "showStaff";
    }

    @RequestMapping("update_staff")
    public String updateStaff(int id,ModelMap modelMap){
        Staff staff = staffService.queryStaffById(id);
        List<Department> departments = deptService.queryAllDept();
        modelMap.addAttribute("employee",staff);
        modelMap.addAttribute("depart",departments);
        return "updateStaff";
    }

    @RequestMapping("update_sta")
    public String updateStaffDeptPosit(Staff staff){
        System.out.println(staff);
        staffService.updateStaff(staff);
        return "forward:/show_staff";
    }
}
