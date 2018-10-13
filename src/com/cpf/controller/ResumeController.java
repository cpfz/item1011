package com.cpf.controller;

import com.alibaba.fastjson.JSON;
import com.cpf.entity.*;
import com.cpf.service.DeptService;
import com.cpf.service.EmployService;
import com.cpf.service.PositionService;
import com.cpf.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;
    @Autowired
    private DeptService deptService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private EmployService employService;

    @RequestMapping("see_resume")
    public String queryResume(ModelMap modelMap, HttpSession session){
        User user = (User) session.getAttribute("user");
        System.out.println(user);
        List<Department> departments = deptService.queryAllDept();
        modelMap.addAttribute("dept",departments);
        Resume resume = resumeService.queryByUserId(user.getId());
        System.out.println(resume);
        modelMap.addAttribute("resume",resume);
        return "resume";
    }

    @RequestMapping(value="queryPosition",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String queryPosition(String name){
        Department department = deptService.queryByName(name);
        List<Position> positions = positionService.queryByDeptId(department.getId());

        String string = JSON.toJSONString(positions);
        return string;
    }

    @RequestMapping("save_resume")
    public String saveResume(Resume resume){
        resumeService.saveResume(resume);
        return "forward:/query_recruit";
    }

    @RequestMapping("update_resume")
    public String update_resume(Resume resume){
        resumeService.updateResume(resume);
        return "forward:/query_recruit";
    }

    @RequestMapping("input_Resume")
    public String saveEmploy(int userId,ModelMap modelMap){
        Resume resume = resumeService.queryByUserId(userId);
        if (resume==null){
            modelMap.addAttribute("no","你还没有简历，需要先填写");
            return "resume";
        }else{
            Employ employ=new Employ(-1,resume.getName(),new Date(),resume.getDepartmentName(),resume.getPositionName(),"未查看","未面试",userId);
            employService.saveEmploy(employ);
            return "forward:/query_recruit";
        }
    }

    @RequestMapping("manage1")
    public String manage(ModelMap modelMap){
        List<Employ> employs = employService.queryAll();
        List<Employ> list=new ArrayList<>();
        for (Employ employ:employs){
            if (employ.getStatus().equals("未查看")){
                list.add(employ);
            }
        }
        modelMap.addAttribute("employ",list);
        return "manage";
    }

    @RequestMapping("seeResume")
    public String seeResume(int userId,int id,ModelMap modelMap){
        Resume resume = resumeService.queryByUserId(userId);
        Employ employ=new Employ(id,"已查看");
        employService.updateEmployStatus(employ);
        modelMap.addAttribute("re",resume);
        return "seeResume";
    }
}
