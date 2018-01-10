package com.bankofsimba.simba.controllers;

import com.bankofsimba.simba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MulAccounts {

  @RequestMapping(value = "/multiple_accounts")
  public String hello(Model model) {
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Simba", 2000, "lion", "good"));
    accountList.add(new BankAccount("Zazu", 1500, "toucan", "good"));
    accountList.add(new BankAccount("Rafiki", 1000, "mandrill", "bad"));
    accountList.add(new BankAccount("Eddy", 313210, "spotted hyena", "bad"));

    model.addAttribute("accountlist", accountList);
    return "multiple_accounts";
  }
}
