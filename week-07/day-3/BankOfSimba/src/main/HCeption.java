package com.bankofsimba.simba.controllers;

import com.bankofsimba.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HCeption {

  @RequestMapping(value = "/hception")
  public String hello(Model model) {
    String hception = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("hception", hception );
    return "hception";
  }
}

