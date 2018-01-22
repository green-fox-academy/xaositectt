package com.example.connectionmysql.controllers;

import com.example.connectionmysql.models.Assignee;
import com.example.connectionmysql.services.AssigneeService;
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
public class AssigneeController {

  @Autowired
  AssigneeService assigneeService;

  @GetMapping("/todo/userlist")
  public String personal(Model model) {
    List<Assignee> assignees = assigneeService.getAllAssignees();
    model.addAttribute("assignees", assignees);
    model.addAttribute("newAssignee", new Assignee());
    return "userlist";
  }

  @PostMapping("/todo/addp")
  public ModelAndView addPersonal(@ModelAttribute Assignee assignee) {
    assigneeService.create(assignee);
    return new ModelAndView("redirect:/todo/userlist");
  }

  @GetMapping("/todo/searcha")
  public String searchA(@RequestParam(value = "mySearch", required = false) String mySearch,
      Model model) {
    List<Assignee> assignees = assigneeService.getAllAssignees().stream().
        filter(p -> p.getName().contains(mySearch))
        .collect(Collectors.toList());
    model.addAttribute("assignees", assignees);
    return "userlist";
  }

  @GetMapping("/todo/deletea/{assigneeId}")
  public ModelAndView delete(@PathVariable int assigneeId) {
    assigneeService.delete(assigneeId);
    return new ModelAndView("redirect:/todo/userlist");
  }

  @GetMapping("/todo/edita/{assigneeId}")
  public String editAssignee(@PathVariable int assigneeId, Model model) {
    Assignee assignee = assigneeService.getAssignee(assigneeId);
    model.addAttribute("newAssigneeEdit", assignee);
    return "edit_assignee";
  }

  @PostMapping("/todo/edita/{assigneeId}")
  public ModelAndView edit(@PathVariable int assigneeId, @ModelAttribute Assignee assignee) {
    assignee.setId(assigneeId);
    assigneeService.modifyAssignee(assignee);
    return new ModelAndView("redirect:/todo/userlist");
  }
}
