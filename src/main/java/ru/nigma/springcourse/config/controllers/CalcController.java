package ru.nigma.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class CalcController {

    @GetMapping("/calculator")
    public String getCalc(@RequestParam(value = "a", required = false) int a,
                          @RequestParam(value = "b", required = false) int b,
                          @RequestParam(value = "action", required = false) String action,
                          Model model) {
        double result = 0 ;

        switch (action){
            case ("multiplication"):
               result = a * b;
                break;
            case ("addition") :
                result = a + b;
                break;
            case ("subtraction") :
                result = a - b;
                break;
            case ("division") :
                result = (double) a / b;
                break;
        }
        System.out.println(result);
        model.addAttribute("result", a + " " + action + " " + b + " = " + result);
        return "calc/calculator";
    }
}
