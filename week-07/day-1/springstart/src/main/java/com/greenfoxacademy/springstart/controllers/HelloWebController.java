package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {
  private AtomicLong counter = new AtomicLong(1);
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot",
      "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};
  String[] colors = {"red", "blue", "green", "black", "orange", "yellow", "purple", "AliceBlue",
      "BlanchedAlmond", "Coral", "DarkGray", "DarkSeaGreen", "DarkSlateGray", "DeepPink",
      "Fuchsia", "Gold", "Indigo", "Lavender", "LightCyan", "LightSalmon" };


  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String content) {
    model.addAttribute("name", content);
    model.addAttribute("times", counter.getAndIncrement());
    model.addAttribute("greeting", hellos[(int)(Math.random()*hellos.length)]);
    model.addAttribute("color", colors[(int)(Math.random()*colors.length)]);
    model.addAttribute("color1", colors[(int)(Math.random()*colors.length)]);
    model.addAttribute("size", (int)(50+Math.random()*450));
    return "greeting";
  }
}

