package com.bankofsimba.simba.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.bankofsimba.simba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MulAccounts {

  List<BankAccount> accountList = new ArrayList<>();

  public MulAccounts() {
    accountList.add(new BankAccount("Simba", 2000, "lion", "good"));
    accountList.add(new BankAccount("Zazu", 1500, "toucan", "good"));
    accountList.add(new BankAccount("Rafiki", 1000, "mandrill", "bad"));
    accountList.add(new BankAccount("Eddy", 313210, "spotted hyena", "bad"));
  }

  @RequestMapping(value = "/multiple_accounts", method = GET)
  public String hello(Model model) {
    model.addAttribute("accountlist", accountList);
    return "multiple_accounts";
  }

  @RequestMapping(value = "/multiple_accounts", method = POST )
  public String depositAll(Model model) {
    BindingResult b;
    b.
    deposit();
    model.addAttribute("accountlist", accountList);
    //return new ModelAndView("redirect:/multiple_accounts");
    return "multiple_accounts";
  }

//  @RequestMapping(value = "/multiple_accounts/a")
//  public String addAccount(Model model) {
//    accountList.add(bankAccount);
//    model.addAttribute("accountlist", accountlist);
//    return "multiple_accounts";
//  }

  public void deposit() {
    for (BankAccount acc : accountList) {
      int amount = 0;
      amount = acc.getName().equals("Simba") ? 100 : 10;
      acc.setBalance(acc.getBalance()+amount);
    }
  }
}

