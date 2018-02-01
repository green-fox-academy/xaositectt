package com.example.exam2again.controllers;

import com.example.exam2again.models.Cloth;
import com.example.exam2again.models.ClothData;
import com.example.exam2again.services.ClothService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClothingController {

  @Autowired
  ClothService clothService;

  @GetMapping(value = "/warehouse")
  public String warehouse(Model model) {
    List<Cloth> clothes = clothService.findAll();
    List<Cloth> distinctTypes = clothService.findDistinctTypes();
    List<Cloth> distinctSizes = clothService.findDistinctSizes();

    model.addAttribute("distinctTypes", distinctTypes);
    model.addAttribute("distinctSizes", distinctSizes);
    model.addAttribute("newclothdata", new ClothData());
    model.addAttribute("clothes", clothes);
    return "main";
  }

  @PostMapping(value = "/warehouse/cart")
  public String cart(Model model, @ModelAttribute ClothData clothData) {

    String clothName = clothData.getName();
    String clothSize = clothData.getSize();
    int clothAmount = clothData.getAmount();

    Cloth selected = clothService.findOne(clothName, clothSize);

    int price = clothAmount*selected.getUnitPrice();

    model.addAttribute("selected", selected);
    model.addAttribute("clothAmount", clothAmount);
    model.addAttribute("totalPrice", price);
    return "cart";
  }
}
