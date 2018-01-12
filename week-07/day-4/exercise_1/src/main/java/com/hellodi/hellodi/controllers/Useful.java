package com.hellodi.hellodi.controllers;

import com.hellodi.hellodi.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Useful {

  @Autowired
  UtilityService u;

  @RequestMapping(value = "/useful")
  public String useful(Model model) {
    return "useful";
  }

  @RequestMapping(value = "/useful/colored")
  public String colored_background(Model model) {
    u.randomColor();
    model.addAttribute("color", u.randomColor());
    return "colored_background";
  }

  @RequestMapping(value = "/useful/email")
  public String emailValidator(@QueryParam("from") int from,) {
    u.randomColor();
    model.addAttribute("color", u.randomColor());
    return "colored_background";
  }
}