package com.cpf.controller;

import com.cpf.entity.Cult;
import com.cpf.entity.Department;
import com.cpf.entity.Staff;
import com.cpf.entity.User;
import com.cpf.service.CultivateService;
import com.cpf.service.DeptService;
import com.cpf.service.StaffService;
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
 * Created by Administrator on 2018/10/17 0017.
 */
@Controller
public class CultivateController {
    @Autowired
    private CultivateService cultivateService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private DeptService deptService;

    @RequestMapping("cultivate_admin")
    public String cultivateAdmin(ModelMap modelMap){
        List<Cult> cults = cultivateService.queryAllCultivate();
        modelMap.addAttribute("cult", cults);
        return "cultivateAdmin";
    }
    @RequestMapping("update_cult")
    public String updateCult(int id,ModelMap modelMap){
        List<Department> departments = deptService.queryAllDept();
        Cult cult = cultivateService.queryById(id);
        modelMap.addAttribute("cult",cult);
        modelMap.addAttribute("department",departments);
        return "updateCult";
    }

    @RequestMapping("alter_cult")
    public String alterCult(Cult cult, String time) throws ParseException {
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(time);
        cult.setDateTime(parse);
        System.out.println(cult);
        cultivateService.updateCult(cult);
        return "forward:/cultivate_admin";
    }
    @RequestMapping("delete_cult")
    public String deleteCult(int id){
        cultivateService.deleteCultById(id);
        return "forward:/cultivate_admin";
    }

    @RequestMapping("add_cult")
    public String addCult(ModelMap modelMap){
        List<Department> departments = deptService.queryAllDept();
        modelMap.addAttribute("department",departments);
        return "saveCult";
    }
    @RequestMapping("save_cult")
    public String saveCult(Cult cult, String time) throws ParseException {
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(time);
        cult.setDateTime(parse);
        cultivateService.saveCult(cult);
        return "forward:/cultivate_admin";
    }

    @RequestMapping("cult_inform")
    public String cultInform(HttpSession session,ModelMap model) throws ParseException {
        User user= (User) session.getAttribute("user");
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

        model.addAttribute("cult",list1);
        return "cultInform";
    }
}
