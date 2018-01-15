package com.example.connectionmysql.controllers;

import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.repository.TodoRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoRepo todoRepo;

  @GetMapping(value = {"/todo", "/"})
  public String list(Model model, @RequestParam(value = "isit", required = false) Boolean isit) {
    List<Todo> todos = new ArrayList<>();
    if (isit == null) {
      todoRepo.findAll().forEach(todos::add);


    } else if (isit) {
      todos = StreamSupport.stream(todoRepo.findAll().spliterator(), false)
          .filter(p -> p.isIsdone())
          .collect(Collectors.toList());

    } else {
      todos = StreamSupport.stream(todoRepo.findAll().spliterator(), false)
          .filter(p -> !p.isIsdone())
          .collect(Collectors.toList());
    }

    model.addAttribute("todos", todos);
    return "main";
  }
}
