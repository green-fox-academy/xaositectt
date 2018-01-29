package com.example.trialexam.controllers;

import com.example.trialexam.models.Car;
import com.example.trialexam.services.CarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {

  @Autowired
  CarService carService;

  @GetMapping(value = "/search")
  public String showdata(Model model,
      @RequestParam(value = "q", required = false) String q,
      @RequestParam(value = "police", required = false) String police,
      @RequestParam(value = "diplomat", required = false) String diplomat) {
    List<Car> cars;
    if (q == null && police == null && diplomat == null) {
      cars = carService.findAll();
    } else if (q != null && police == null && diplomat == null) {
      cars = carService.findIfContains(q);
    } else if (police != null && q == null && diplomat == null) {
      if (police.equals("1")) {
        cars = carService.lookUpPlate("RB");
      } else {
        cars = null;
      }
    } else if (diplomat != null && q == null && police == null) {
      if (diplomat.equals("1")) {
        cars = carService.lookUpPlate("DT");
      } else {
        cars = null;
      }
    } else {
      cars = null;
    }
    model.addAttribute("cars", cars);
    return "main";
  }

  @GetMapping(value = "/search/{brand}")
  public String showdata(@PathVariable String brand, Model model) {
    List<Car> cars = carService.lookUpBrand(brand);
    model.addAttribute("cars", cars);
    return "main";
  }
}

