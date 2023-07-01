package com.example.tuaev.calculyator_kkal.countingController;

import com.example.tuaev.calculyator_kkal.counting.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CountingController {

    @RequestMapping(value = "/counting_kkal", method = RequestMethod.GET)
    public String counting_kkal(Model model) {
        return "home";
    }

    @RequestMapping(value = "counting_kkal/result", method = RequestMethod.POST)
    public String counting_kkal_result(@RequestParam int age, @RequestParam int weight, @RequestParam int height, @RequestParam String floor, Model model) {

        String sex = floor;

        if (sex.equals("man")) {
            model.addAttribute("sex", sex);
            List<String> ratio = new ArrayList<>();
            ratio = Activity.getRatio();
            model.addAttribute("ratio", ratio);
            List<Integer> maintenanceManActivity = MaintenanceManActivity.maintenanceManActivity(age, weight, height);
            model.addAttribute("maintenanceManActivity", maintenanceManActivity);
            List<Integer> setManActivity = SetMan.setMan(age, weight, height);
            model.addAttribute("setManActivity", setManActivity);
            List<Integer> dialManActivity = DialMan.dialMan(age, weight, height);
            model.addAttribute("dialManActivity", dialManActivity);
        } else if (sex.equals("women")) {
            {
                model.addAttribute("sex", sex);
                List<String> ratio = Activity.getRatio();
                model.addAttribute("ratio", ratio);
                List<Integer> maintenanceWomenActivity = MaintenanceWomenActivity.maintenanceWomen(age, weight, height);
                model.addAttribute("maintenanceWomenActivity", maintenanceWomenActivity);
                List<Integer> setWomenActivity = SetWomen.setWomen(age, weight, height);
                model.addAttribute("setWomen", setWomenActivity);
                List<Integer> dialWomenActivity = DialWomen.dialWomen(age, weight, height);
                model.addAttribute("dialWomen", dialWomenActivity);
            }
        }
        return "result";
    }
}


