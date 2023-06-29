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

        if (floor.equals("man")){
            int maintenanceResultMan = MaintenanceMan.maintenanceMan(age, weight, height);
            model.addAttribute("maintenanceResultMan", maintenanceResultMan);
            model.addAttribute("floor", floor);
        }else {
            int maintenanceResultWomen = MaintenanceWomen.maintenanceWomen(age, weight, height);
            model.addAttribute("maintenanceResultWomen", maintenanceResultWomen);
            model.addAttribute("floor", floor);
        }
        return "Test2";
    }

}
