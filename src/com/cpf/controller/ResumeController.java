package com.cpf.controller;

import com.alibaba.fastjson.JSON;
import com.cpf.entity.Department;
import com.cpf.entity.Position;
import com.cpf.entity.Resume;
import com.cpf.entity.User;
import com.cpf.service.DeptService;
import com.cpf.service.PositionService;
import com.cpf.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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

    @RequestMapping("see_resume")
    public String queryResume(ModelMap modelMap, HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Department> departments = deptService.queryAllDept();
        modelMap.addAttribute("dept",departments);
        Resume resume = resumeService.queryByUserId(user.getId());
        modelMap.addAttribute("resume",resume);
        return "resume";
    }

    @RequestMapping(value="queryPosition",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String queryPosition(int id){
        Department department = deptService.queryById(id);
        List<Position> positions = positionService.queryByDeptId(department.getId());
        String string = JSON.toJSONString(positions);
        return string;
    }

    @RequestMapping("save_resume")
    public String saveResume(){
        System.out.println(1);
        return "";
    }

}
