package com.bankofsimba.simba.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.bankofsimba.simba.models.Character;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Characters {

  List<Character> accountList = new ArrayList<>();


  private List<String> names = new ArrayList<String>(
      Arrays.asList("Nameless One", "Annah", "Dak'kon",
          "Ignus", "Vhailor", "Nordom",
          "Fall-From-Grace", "Transcendent One", "Ravel Puzzlevell"));

  private List<String> portraits = new ArrayList<String>(
      Arrays.asList(
          "https://vignette.wikia.nocookie.net/torment/images/9/91/Portrait_tno.gif",
          "https://vignette.wikia.nocookie.net/torment/images/e/e6/Portrait_nordom.gif",
          "https://vignette.wikia.nocookie.net/torment/images/3/3a/Portrait_morte.gif",
          "https://vignette.wikia.nocookie.net/torment/images/f/f4/Portrait_ignus.gif",
          "https://vignette.wikia.nocookie.net/torment/images/5/5e/Portrait_fall_from_grace.gif",
          "https://vignette.wikia.nocookie.net/torment/images/a/a8/Portrait_dakkon.gif",
          "https://vignette.wikia.nocookie.net/torment/images/6/64/Portrait_annah.gif",
          "https://vignette.wikia.nocookie.net/torment/images/c/cd/Portrait_vhailor.gif",
          "https://vignette.wikia.nocookie.net/torment/images/6/64/Deionarra_portrait.jpg"));

  public Characters() {
    for (int i = 0; i < 4; i++) {
      int a = (int) (Math.random() * names.size());
      ;
      int b = (int) (Math.random() * portraits.size());
      accountList.add(new Character(names.get(a), portraits.get(b)));
      names.remove(a);
      portraits.remove(b);
    }
  }

  @RequestMapping(value = "/multiple_accounts", method = GET)
  public String hello(Model model) {
    model.addAttribute("accountlist", accountList);
    return "multiple_accounts";
  }


  @PostMapping("/multiple_accounts/{accountName}" + "+")
  public ModelAndView fight(@PathVariable String accountName) {

    for (Character account : accountList) {
      if (account.getName().equals(accountName)) {

        account.setExperience(account.getExperience() + 100);
      }
    }
    return new ModelAndView("redirect:/multiple_accounts");
  }

  @PostMapping("/multiple_accounts/{accountName}" + "-")
  public ModelAndView forget(@PathVariable String accountName) {

    for (Character account : accountList) {
      if (account.getName().equals(accountName)) {

        account.setExperience(account.getExperience() - 10);
      }
    }
    return new ModelAndView("redirect:/multiple_accounts");
  }

//  @RequestMapping(value = "/multiple_accounts", method = POST )
//  public String depositAll(Model model) {
//    BindingResult b;
//    b.
//    deposit();
//    model.addAttribute("accountlist", accountList);
//    //return new ModelAndView("redirect:/multiple_accounts");
//    return "multiple_accounts";
//  }

  @PostMapping("/multiple_accounts/*")
  public ModelAndView fightAll() {
    incrAll();
    return new ModelAndView("redirect:/multiple_accounts");
  }

  public void incrAll() {
    for (Character acc : accountList) {
      acc.setExperience(acc.getExperience() + 100);
    }
  }
}

