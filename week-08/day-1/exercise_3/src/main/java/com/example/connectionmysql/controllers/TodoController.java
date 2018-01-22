package com.example.connectionmysql.controllers;


import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.services.AssigneeService;
import com.example.connectionmysql.services.TodoService;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {

//  @Autowired
//  TodoRepo todoRepo;

  @Autowired
  TodoService todoService;

  @Autowired
  AssigneeService assigneeService;

  @GetMapping(value = "/todo")
  public String showdata(Model model,
      @RequestParam(value = "isit", required = false) Boolean isit) {
    List<Todo> todos;

    if (isit == null) {
      todos = todoService.getAllTodos();
      //todos = (List<Todo>) todoRepo.findAll();

    } else if (isit) {
      todos = todoService.getAllTodos().stream()
          .filter(p -> p.getIsdone())
          .collect(Collectors.toList());

//      todos = StreamSupport.stream(todoRepo.findAll().spliterator(), false)
//          .filter(p -> p.getIsdone())
//          .collect(Collectors.toList());

    } else {
      todos = todoService.getAllTodos().stream()
          .filter(p -> !p.getIsdone())
          .collect(Collectors.toList());

//      todos = StreamSupport.stream(todoRepo.findAll().spliterator(), false)
//          .filter(p -> !p.getIsdone())
//          .collect(Collectors.toList());

    }
    //this is needed if the button on at the same page. We create an empty object with this,
    //create the attributes in the form, link the form to an endpoint where the method
    //adds it to the repository, and redirect back to the main view.
    // model.addAttribute("newTodo", new Todo());
    model.addAttribute("todos", todos);
    model.addAttribute("assignees", assigneeService.getAllAssignees());
    return "main";
  }

  @GetMapping(value = "/todo/addd")
  public String addNew(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add_data";
  }

  //I pass the object from the input fields to this @ModelAttribute bullshit. Apparently
  //it needs to be stored in a method like this, object type has to be correct, otherwise
  //the form with the object variables doesn't work.

//  @ModelAttribute(value = "newTodo")
//  public Todo myTodo() {
//    return new Todo();
//  }

  //apparently the object gets passed to this @Modellatribute where the form takes us.
  //Here I can save it to the repo.

  @PostMapping(value = "/todo/addd/add")
  public ModelAndView add(@ModelAttribute Todo todo) {
    todo.setDate(new Date());
    todoService.create(todo);
    return new ModelAndView("redirect:/todo");
  }

  @GetMapping("/todo/delete/{todoid}")
  public ModelAndView delete(@PathVariable Integer todoid) {
    todoService.delete(todoid);
    return new ModelAndView("redirect:/todo");
  }

  @GetMapping("/todo/edit/{todoid}")
  public String editForm(@PathVariable int todoid, Model model) {
    Todo todo = todoService.getTodo(todoid);
    model.addAttribute("newTodo", todo);
    return "edit";
  }

  @PostMapping("/todo/edit/{todoid}")
  public ModelAndView edit(@PathVariable int todoid, @ModelAttribute Todo todo) {
    todo.setId(todoid);
    todo.setDate(new Date());
    todoService.modifyTodo(todo);
    return new ModelAndView("redirect:/todo");
  }


  @GetMapping("/todo/searchm")
  public String search(@RequestParam(value = "mySearch", required = false) String mySearch,
      Model model) {
    List<Todo> todos = todoService.getAllTodos().stream().
        filter(p -> p.getTitle().contains(mySearch))
        .collect(Collectors.toList());
    model.addAttribute("todos", todos);
    return "main";
  }

  @GetMapping("/todo/personal/{todoid}")
  public String personal(@PathVariable Integer todoid, Model model) {
    Todo thisTodo = todoService.getTodo(todoid);
    model.addAttribute("thisTodo", thisTodo);
    return "personal";
  }
}
