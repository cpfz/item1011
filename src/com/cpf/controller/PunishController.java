package com.cpf.controller;
import com.cpf.entity.Punish;
import com.cpf.entity.Reward;
import com.cpf.entity.Staff;
import com.cpf.entity.User;
import com.cpf.service.PunishService;
import com.cpf.service.RewardService;
import com.cpf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
@Controller
public class PunishController {
    @Autowired
    private PunishService punishService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private RewardService rewardService;

    @RequestMapping("punish_staff")
    public String punishStaff(Punish punish,String dateTime1) throws ParseException {
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(dateTime1);
        punish.setDateTime(parse);
        punishService.savePunish(punish);
        return "forward:/manage1";
    }

    @RequestMapping("reward_punish")
    public String rewardPunish(ModelMap modelMap){
        List<Reward> rewards = rewardService.queryAll();
        List<Punish> punishes = punishService.queryAll();
        modelMap.addAttribute("reward",rewards);
        modelMap.addAttribute("punish",punishes);
        return "rewardPunish";

    }

    @RequestMapping("my_reward_punish")
    public String myRewardPunish(HttpSession session,ModelMap modelMap){
        User user = (User) session.getAttribute("user");
        Staff staff = staffService.queryStaffByUid(user.getId());
        List<Punish> punishes = punishService.queryByStaffName(staff.getName());
        List<Reward> rewards=rewardService.queryByStaffName(staff.getName());
        modelMap.addAttribute("reward",rewards);
        modelMap.addAttribute("punish",punishes);
        return "myRewardPunish";
    }

    @RequestMapping("delete_punish")
    public String deletePunish(int id){
        punishService.deleteById(id);
        return "forward:/reward_punish";
    }

    @RequestMapping("update_punish_staff")
    public String updatePunishStaff(Punish punish){
        punishService.updatePunish(punish);
        return "forward:/reward_punish";
    }

    @RequestMapping("update_punish")
    public String updatePunish(int id,ModelMap modelMap){
        Punish punish = punishService.queryById(id);
        modelMap.addAttribute("punish",punish);
        return "updatePunish";
    }
}
