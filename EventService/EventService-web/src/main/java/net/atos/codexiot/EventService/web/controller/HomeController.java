package net.atos.codexiot.EventService.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
	@RequestMapping("/")
    public String welcomePage(ModelAndView model) {
        return "index";
    }
}