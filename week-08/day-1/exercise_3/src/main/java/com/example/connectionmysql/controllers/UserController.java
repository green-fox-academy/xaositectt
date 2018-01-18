package com.example.connectionmysql.controllers;

import com.example.connectionmysql.models.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

@GetMapping("/list")
public String personal() {
  return "list";
}
}
