package com.example.demka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CongratsController {

    @GetMapping("/congrats")
    public String congrats(@RequestParam(name="name", required=false, defaultValue="horochii chelovek") String name, Model model) {
        model.addAttribute("name", name);
        return "congrats";
    }

}