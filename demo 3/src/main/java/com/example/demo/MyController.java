

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    public MyController() {
    }

    @GetMapping({"/"})
    public String index(Model model) {
        test testObject = new test();
        String result = testObject.getSum();
        model.addAttribute("result", result);
        return "index";
    }

    @GetMapping({"standard1"})
    public String standard1(Model model) {
        test testObject = new test();
        String result = testObject.getSum();
        model.addAttribute("quiz1", result);
        return "standard1";
    }

    @GetMapping({"standard2"})
    public String standard2(Model model) {
        test testObject = new test();
        String result = testObject.getSum();
        model.addAttribute("quiz2", result);
        return "standard2";
    }

    @GetMapping({"standard3"})
    public String standard3(Model model) {
        test testObject = new test();
        String result = testObject.getSum();
        model.addAttribute("quiz3", result);
        return "standard3";
    }

    @GetMapping({"standard4"})
    public String standard4(Model model) {
        test testObject = new test();
        String result = testObject.getSum();
        model.addAttribute("quiz4", result);
        return "standard4";
    }
}
