package com.cpf.controller;

import com.cpf.entity.User;
import com.cpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public String regist(User user){
        System.out.println(user);
        userService.addUser(user);
        return "cache";
    }
    @RequestMapping("regist")
    public String registUser(){
        return "regist";
    }

    @RequestMapping("verify_name")
    @ResponseBody
    public String verifyName(String name){
        User user = userService.queryByName(name);
        if (user!=null){
            return "1";
        }else {
            return "2";
        }
    }
    @RequestMapping("login")
    public String login(){
        return "forward:/login.jsp";
    }

    @RequestMapping("login_User")
    public String login_User(User user, ModelMap model, HttpSession session){
        User user1 = userService.queryUser(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "forward:/query_recruit";
        }else {
            model.addAttribute("str","√‹¬ÎªÚ’Àªß¥ÌŒÛ");
            return "forward:/login.jsp";
        }
    }
}
