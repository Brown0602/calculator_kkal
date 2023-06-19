package com.example.tuaev.calculyator_kkal.countingController;

import com.example.tuaev.calculyator_kkal.counting.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CountingController {

    @RequestMapping(value = "/counting_kkal", method = RequestMethod.GET)
    public String counting_kkal(Model model) {
        return "home";
    }

    @RequestMapping(value = "counting_kkal/result", method = RequestMethod.POST)
    public String counting_kkal_result(@RequestParam int age, @RequestParam int weight, @RequestParam int height, Model model) {
        MaintenanceManAndWomen maintenanceManAndWomen = new MaintenanceManAndWomen(age, weight, height);
        MaintenanceManAndWomenActivity maintenanceManAndWomenActivity = new MaintenanceManAndWomenActivity(age, weight, height);
        SetMan setMan = new SetMan(age, weight, height);
        DialMan dialMan = new DialMan(age, weight, height);
        SetWomen setWomen = new SetWomen(age, weight, height);
        DialWomen dialWomen = new DialWomen(age, weight, height);
        int resultManMaintenance = maintenanceManAndWomen.maintenanceMan(age, weight, height);
        List<Integer> listMan = maintenanceManAndWomenActivity.maintenanceMan(age, weight, height);
        int resultManSetMaintenance = resultManMaintenance;
        int resultManDialMaintenance = resultManMaintenance;
        listMan.add(0, resultManMaintenance);
        List<Integer> listManSet = setMan.setMan(age, weight, height);
        listManSet.add(0, resultManSetMaintenance *= 1.1);
        List<Integer> listManDial = dialMan.dialMan(age, weight, height);
        listManDial.add(0, resultManDialMaintenance *= 0.9);
        model.addAttribute("resultManMaintenanceActivity", listMan);
        model.addAttribute("resultManSetActivity", listManSet);
        model.addAttribute("resultManDialActivity", listManDial);
        //Базовый обмен
        int resultWomenMaintenance = maintenanceManAndWomen.maintenanceWomen(age, weight, height);
        int resultWomenSetMaintenance = resultWomenMaintenance;
        int resultWomenDialMaintenance = resultWomenMaintenance;
        //Поддержание веса
        List<Integer> listWomen = maintenanceManAndWomenActivity.maintenanceWomen(age, weight, height);
        listWomen.add(0, resultWomenMaintenance);
        //Набор веса
        List<Integer> listWomenSet = setWomen.setWomen(age, weight, height);
        listWomenSet.add(0, resultWomenSetMaintenance *= 1.1);
        //Сброс веса
        List<Integer> listWomenDial = dialWomen.dialWomen(age, weight, height);
        listWomenDial.add(0, resultWomenDialMaintenance *= 0.9);
        //Вывод результата
        model.addAttribute("resultWomenMaintenanceActivity", listWomen);
        model.addAttribute("resultWomenSetActivity", listWomenSet);
        model.addAttribute("resultWomenDialActivity", listWomenDial);

        //Активность
        List<String> ratio = new ArrayList<String>();
        ratio.add("Базовый обмен");
        ratio.add("Нет физических нагрузок и сидячая работа");
        ratio.add("Легкие физические нагрузки 1–3 раза в неделю");
        ratio.add("Силовые нагрузки средней интенсивностью 3–5 раз в неделю");
        ratio.add("Силовые тренировки 6–7 раз в неделю");
        ratio.add("Физическая работа, силовые тренировки 2 раза в день");
        model.addAttribute("ratio", ratio);

        return "result";
    }

}
