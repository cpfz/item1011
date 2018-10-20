package com.cpf.controller;
import com.cpf.entity.Employ;
import com.cpf.entity.User;
import com.cpf.service.CultivateService;
import com.cpf.service.EmployService;
import com.cpf.service.StaffService;
import com.cpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmployService employService;
    @Autowired
    private CultivateService cultivateService;
    @Autowired
    private StaffService staffService;

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
    public String login_User(User user, ModelMap model, HttpSession session) throws ParseException {
        User user1 = userService.queryUser(user);
        List<Employ> list=new ArrayList<>();
        if (user1!=null&&user1.getGenre()==2){
            List<Employ> employs = employService.queryByUserId(user1.getId());
            for (Employ employ:employs){
                if (employ.getInterviewTime()!=null&&employ.getInterview().equals("未面试")&&employ.getInterviewY()==null){
                    list.add(employ);
                }
            }
            model.addAttribute("list",list);
            session.setAttribute("user",user1);
            return "tourist";
        }else if(user1!=null&&user1.getGenre()==0){
            session.setAttribute("user",user1);
            return "forward:/manage1";
        }else if (user1!=null&&user1.getGenre()==1){
            session.setAttribute("user",user1);
/*            Staff staff = staffService.queryStaffByUid(user1.getId());

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
                    if(parse.getTime()-parse1.getTime()<0&&cult.getDepartmentName().equals(staff.getDepartmentName())){
                        list1.add(cult);
                    }
                }
            }

            model.addAttribute("cultivate",list1);
            return "staff";*/
            return "forward:/staff1";
        } else{
            model.addAttribute("str","密码或账户错误");
            return "forward:/login.jsp";
        }
    }

    @RequestMapping("update_pass")
    public String updatePass(){
        return "alterPass";
    }

    @RequestMapping("update_password")
    public String updatePassword(User user){
        userService.updatePass(user);
        return "forward:/login.jsp";
    }

    @RequestMapping("to_employ")
    public String employAdmin(ModelMap modelMap){
        List<Employ> employs=new ArrayList<>();
        List<Employ> list = employService.queryAll();
        for(Employ employ:list){
            if (employ.getStatus().equals("未查看")){
                employs.add(employ);
            }
        }
        modelMap.addAttribute("em",employs);
        return "employAdmin";
    }

    @RequestMapping("interview_admin")
    public String interviewAdmin(ModelMap modelMap) throws ParseException {
        List<Employ> list = employService.queryAll();
        List<Employ> list1=new ArrayList<>();
        System.out.println(list);

        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date1=dateFormat.format(date);
        Date parse = dateFormat.parse(date1);

        for(Employ employ:list){
            if (employ.getInterviewTime()!=null&&employ.getInterviewY()!=null) {
                Date date2 = employ.getInterviewTime();
                String format = dateFormat.format(date2);
                Date parse1 = dateFormat.parse(format);
                if(employ.getInterview().equals("未面试")&&employ.getInterviewY().equals("接受")&&parse.getTime()-parse1.getTime()==0){
                    list1.add(employ);
                }
            }
        }
        modelMap.addAttribute("employ",list1);
        return "interviewAdmin";
    }
}
