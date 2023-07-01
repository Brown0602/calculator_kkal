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
        MaintenanceMan maintenanceMan = new MaintenanceMan(age, height, weight);
        DialMan dialMan = new DialMan(age, height, weight);
        SetMan setMan = new SetMan(age, height, weight);
        String sex = floor;

        if (sex.equals("man")) {
            List<String> ratio = new ArrayList<>();
            ratio = Activity.getRatio();
            List<Integer> maintenanceManActivity = new ArrayList<>();
            List<Integer> setManActivity = new ArrayList<>();
            setManActivity = setMan.setMan(age, weight, height);
            maintenanceManActivity = MaintenanceManActivity.maintenanceManActivity(age, weight, height);
            List<Integer> dialManActivity = new ArrayList<>();
            dialManActivity = dialMan.dialMan(age, weight, height);
            //Создание таблицы
            model.addAttribute("ratio", ratio);
            model.addAttribute("sex", sex);
            model.addAttribute("maintenanceManActivity", maintenanceManActivity);
            model.addAttribute("setManActivity", setManActivity);
            model.addAttribute("dialManActivity", dialManActivity);

        } else if (sex.equals("women")) {
            {
                model.addAttribute("sex", sex);
                List<String> ratio = Activity.getRatio();
                model.addAttribute("ratio", ratio);
                List<Integer> maintenanceWomenActivity = MaintenanceWomenActivity.maintenanceWomen(age, weight, height);
                model.addAttribute("maintenanceWomenActivity", maintenanceWomenActivity);
                List<Integer> setWomen = SetWomen.setWomen(age, weight, height);
                model.addAttribute("setWomen", setWomen);
                List<Integer> dialWomen = DialWomen.dialWomen(age, weight, height);
                model.addAttribute("dialWomen", dialWomen);
            }

        }
        return "result";
    }
}


