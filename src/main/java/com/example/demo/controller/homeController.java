package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class homeController {

  @RequestMapping(method = RequestMethod.GET)
  public String home(Model model) {
    model.addAttribute("message", "helspring!");
    return "home";
  }
}
