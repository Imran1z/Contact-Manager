package com.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControllers {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name", "Imran");
        model.addAttribute("last", "Ahmad");
        return "home";
    }
}
