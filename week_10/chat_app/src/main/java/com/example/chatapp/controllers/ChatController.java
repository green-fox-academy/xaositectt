package com.example.chatapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

  @GetMapping("/")
  public String mainPage() {
    return "main";
  }

}
