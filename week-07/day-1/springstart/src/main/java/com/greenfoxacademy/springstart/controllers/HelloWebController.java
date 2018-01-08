package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {
  private AtomicLong counter = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String content) {
    model.addAttribute("name", content);
    model.addAttribute("times", counter.getAndIncrement());
    return "greeting";
  }
}

