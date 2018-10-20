package com.cpf.controller;

import com.cpf.entity.Reward;
import com.cpf.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
@Controller
public class RewardController {
    @Autowired
    private RewardService rewardService;

    @RequestMapping("reward_staff")
    public String rewardStaff(Reward reward,String dateTime1) throws ParseException {
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(dateTime1);
        reward.setDateTime(parse);
        rewardService.saveReward(reward);
        return "forward:/manage1";
    }

    @RequestMapping("delete_reward")
    public String deleteReward(int id){
        rewardService.deleteById(id);
        return "forward:/reward_punish";
    }

    @RequestMapping("update_reward")
    public String updateReward(int id, ModelMap modelMap){
        Reward reward = rewardService.queryById(id);
        modelMap.addAttribute("reward",reward);
        return "updateReward";
    }
    @RequestMapping("update_reward_staff")
    public String updateRewardStaff(Reward reward){
        rewardService.updateReward(reward);
        return "forward:/reward_punish";
    }
}
