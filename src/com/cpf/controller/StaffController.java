package com.cpf.controller;

import com.cpf.entity.*;
import com.cpf.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    private CultivateService cultivateService;

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

    @RequestMapping("personal_staff")
    public String personalStaff(ModelMap modelMap, HttpSession session){
        User user = (User) session.getAttribute("user");
        Staff staff = staffService.queryStaffByUid(user.getId());
        modelMap.addAttribute("staff",staff);
        return "personalStaff";
    }
    @RequestMapping("staff_update")
    public String staffUpdate(Staff staff){
        System.out.println(staff);
        staffService.updateStaffAll(staff);
        return "forward:/personal_staff";
    }

    @RequestMapping("password_update")
    public String passwordUpdate(){
        return "staffUpdatePass";
    }

    @RequestMapping("staff1")
    public String staffInform(HttpSession session,ModelMap modelMap) throws ParseException {
        User user = (User) session.getAttribute("user");
        Staff staff = staffService.queryStaffByUid(user.getId());

        List<Cult> list1=new ArrayList<>();

        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date1=dateFormat.format(date);
        Date parse = dateFormat.parse(date1);

        List<Cult> cults = cultivateService.queryAllCultivate();
        if (cults!=null){
            for (Cult cult:cults){
                Date date2=cult.getDateTime();
                String format = dateFormat.format(date2);
                Date parse1 = dateFormat.parse(format);
                if(parse.getTime()-parse1.getTime()<=0&&cult.getDepartmentName().equals(staff.getDepartmentName())){
                    list1.add(cult);
                }
            }
        }

        modelMap.addAttribute("cultivate",list1);
        return "staff";

    }
}
