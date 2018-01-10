package com.bankofsimba.simba.controllers;

import com.bankofsimba.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Show {

  @RequestMapping(value = "/show")
  public String hello(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion", "good");
    model.addAttribute("simba", simba);
    model.addAttribute("balance", String.format("%.2f", simba.getBalance()));
    return "simba";
  }
}




