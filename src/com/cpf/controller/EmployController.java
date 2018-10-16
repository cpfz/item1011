package com.cpf.controller;

import com.cpf.entity.Employ;
import com.cpf.entity.User;
import com.cpf.service.EmployService;
import com.cpf.service.UserService;
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
 * Created by Administrator on 2018/10/13 0013.
 */
@Controller
public class EmployController {
    @Autowired
    private EmployService employService;
    @Autowired
    private UserService userService;

    @RequestMapping("deleteEmploy")
    public String deleteEmploy(int id){
        employService.deleteEmployById(id);
        return "forward:/to_employ";
    }

    @RequestMapping("send_Interview")
    public String sendInterview(int id, String interviewTime){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date utilDate = sdf.parse(interviewTime);
            Employ employ=new Employ(id,utilDate);
            employService.updateEmployInterviewTime(employ);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "forward:/to_employ";
    }

    @RequestMapping("feed_back")
    public String feedBack(ModelMap modelMap, HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Employ> list = employService.queryByUserId(user.getId());
        List<Employ> list1=new ArrayList<>();
        for (Employ employ:list){
            if (employ.getInterviewTime()!=null&&employ.getInterview().equals("未面试")){
                list1.add(employ);
            }
        }
        modelMap.addAttribute("emp",list1);
        return "feedback";
    }


    @RequestMapping("accept_interview")
    public String acceptInterview(int id,ModelMap modelMap){
        Employ employ=new Employ(id,"接受",0);
        employService.updateEmployInterviewY(employ);
        modelMap.addAttribute("str1","操作成功");
        return "forward:/feed_back";
    }

    @RequestMapping("refuse_interview")
    public String refuseInterview(int id,ModelMap modelMap){
        Employ employ=new Employ(id,"拒绝",0);
        employService.updateEmployInterviewY(employ);
        modelMap.addAttribute("str1","操作成功");
        return "forward:/feed_back";
    }

    @RequestMapping("hire")
    public String hire(int id,int uId){
        Employ employ=new Employ(id,"已面试","录用",0);
        employService.updateEmployHire(employ);
        User user=new User(uId,"","",1);
        userService.updateGenre(user);
        return "manage";
    }

    @RequestMapping("no_hire")
    public String noHire(int id,int uId){
        Employ employ=new Employ(id,"已面试","不录用",0);
        employService.updateEmployHire(employ);
        return "manage";
    }
}
