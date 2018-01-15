package com.greenfox.todo.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.greenfox.todo.models.ToDo;
import com.greenfox.todo.repository.TodoRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  TodoRepo todoRepo;

  @GetMapping(value = {"/todo", "/"})
  public String list(Model model) {
    List<ToDo> todos = new ArrayList<>();
    todoRepo.findAll().forEach(todos::add);
    return "main";
  }
}
