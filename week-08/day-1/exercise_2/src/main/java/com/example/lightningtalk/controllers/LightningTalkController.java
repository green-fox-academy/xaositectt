package com.example.lightningtalk.controllers;

import com.example.lightningtalk.models.LightningTalk;
import com.example.lightningtalk.services.LightningTalkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LightningTalkController {

  @Autowired
  LightningTalkService lightningTalkService;

  @GetMapping("/talks")
  public String showTalks(Model model) {
    LightningTalkService talkService;
    List<LightningTalk> talks = lightningTalkService.getAllTalks();
    model.addAttribute("talks", talks);
    model.addAttribute("newTalk", new LightningTalk());
    return "list";
  }

  @PostMapping("/talks/create")
  public ModelAndView createNewTalk(@ModelAttribute LightningTalk talk) {
    lightningTalkService.create(talk);
//    ModelAndView m = new ModelAndView();
//    m.setViewName("talks");
//    m.addObject("talk", talk);
    return new ModelAndView("redirect:/talks");
  }
}
