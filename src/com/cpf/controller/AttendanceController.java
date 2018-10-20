package com.cpf.controller;

import com.alibaba.fastjson.JSON;
import com.cpf.entity.*;
import com.cpf.service.AttendanceService;
import com.cpf.service.CultivateService;
import com.cpf.service.PunishService;
import com.cpf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/19 0019.
 */
@Controller
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private PunishService punishService;
    @RequestMapping("my_attendance")
    public String myAttendance(HttpSession session,ModelMap modelMap){
        User user = (User) session.getAttribute("user");
        Staff staff = staffService.queryStaffByUid(user.getId());
        List<Attendance> attendances = attendanceService.queryBySId(staff.getId());
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        String format = dateFormat.format(date);
        List<Attendance> attendances1 = attendanceService.queryByOfficeTime(format);
        modelMap.addAttribute("attend",attendances);
        modelMap.addAttribute("attendance",attendances1);
        return "myAttendance";
    }

    @RequestMapping("clock_in")
    public String clockIn(HttpSession session,ModelMap modelMap){
        User user = (User) session.getAttribute("user");
        Staff staff = staffService.queryStaffByUid(user.getId());
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(date);
        List<Attendance> attendances1 = attendanceService.queryByOfficeTime(format);

        if (attendances1.size()==0){
            attendanceService.saveAttendance(new Attendance(0,staff.getName(),date,null,staff.getId()));
            modelMap.addAttribute("str","打卡成功");
        }else {
            modelMap.addAttribute("str","你已经打过上班卡了");

        }
        List<Attendance> attendances = attendanceService.queryBySId(staff.getId());
        modelMap.addAttribute("attend",attendances);
        List<Attendance> attendances3 = attendanceService.queryByOfficeTime(format);
        modelMap.addAttribute("attendance",attendances3);
        return "myAttendance";
    }

    @RequestMapping("clock_out")
    public String clockOut(HttpSession session,ModelMap modelMap) throws ParseException {
        User user = (User) session.getAttribute("user");

        Staff staff = staffService.queryStaffByUid(user.getId());

        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(date);
        List<Attendance> attendances = attendanceService.queryByOfficeTime(format);

        if (attendances.size()!=0){
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm");
            for (Attendance attendance:attendances){
                if (attendance.getClosingTime()==null){
                    String format1 = dateFormat1.format(attendance.getOfficeTime());
                    Date parse = dateFormat1.parse("09:00");
                    Date parse1 = dateFormat1.parse(format1);
                    if (parse1.getTime()-parse.getTime()>=10800000){
                        punishService.savePunish(new Punish(0,"旷工",200,date,staff.getName()));
                    }else if (parse1.getTime()-parse.getTime()<10800000&&parse1.getTime()-parse.getTime()>=0){
                        String s = dateFormat1.format(date);
                        Date parse3=dateFormat1.parse("18:00");
                        Date parse2 = dateFormat1.parse(s);
                        if (parse3.getTime()-parse2.getTime()>=10800000){
                            punishService.savePunish(new Punish(0,"旷工",200,date,staff.getName()));
                        }else if(parse3.getTime()-parse2.getTime()<10800000&&parse3.getTime()-parse2.getTime()>=0){
                            punishService.savePunish(new Punish(0,"迟到",50,date,staff.getName()));
                            punishService.savePunish(new Punish(0,"早退",50,date,staff.getName()));
                        }else {
                            punishService.savePunish(new Punish(0,"迟到",50,date,staff.getName()));
                        }
                    }else {
                        String s = dateFormat1.format(date);
                        Date parse3=dateFormat1.parse("18:00");
                        Date parse2 = dateFormat1.parse(s);
                        if (parse2.getTime()-parse3.getTime()>=10800000){
                            punishService.savePunish(new Punish(0,"旷工",200,date,staff.getName()));
                        }else if(parse2.getTime()-parse3.getTime()<10800000&&parse2.getTime()-parse3.getTime()>0){
                            punishService.savePunish(new Punish(0,"早退",50,date,staff.getName()));
                        }
                    }
                    attendanceService.updateAttendClosingTime(new Attendance(attendance.getId(),attendance.getsName(),null,date,attendance.getsId()));
                    modelMap.addAttribute("str1","打卡成功");
                }else {
                    modelMap.addAttribute("str1","你已打过卡了");
                }
            }
        }else {
            modelMap.addAttribute("str1","你上班还未打卡，不能打下班卡");
        }
        List<Attendance> attendances4 = attendanceService.queryBySId(staff.getId());
        modelMap.addAttribute("attend",attendances4);
        List<Attendance> attendances3 = attendanceService.queryByOfficeTime(format);
        modelMap.addAttribute("attendance",attendances3);
        return "myAttendance";
    }

    @RequestMapping(value="see_attend",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String seeAttend(String year,String month){
        String date=year+"-"+month;
        List<Attendance> attendances = attendanceService.queryByOfficeTime(date);
        String string = JSON.toJSONString(attendances);
        System.out.println(string);
        return string;
    }

    @RequestMapping("staff_attend")
    public String staffAttend(int id,ModelMap modelMap){
        List<Attendance> attendances = attendanceService.queryBySId(id);
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        String format = dateFormat.format(date);
        List<Attendance> attendances1 = attendanceService.queryByOfficeTime(format);
        modelMap.addAttribute("attend",attendances);
        modelMap.addAttribute("attendance",attendances1);
        return "staffAttend";
    }
}
