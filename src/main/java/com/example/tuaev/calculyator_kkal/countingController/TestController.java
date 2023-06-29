package com.example.tuaev.calculyator_kkal.countingController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model){
        return "Test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestParam int age, @RequestParam String pol,  Model model){
        String polres = "";
        if (pol.equals("man")) {
            polres = "111";
        }else {
            polres = "222";
        }
        model.addAttribute("result", age);
        model.addAttribute("pol", polres);
        return "Test2";
    }
}
