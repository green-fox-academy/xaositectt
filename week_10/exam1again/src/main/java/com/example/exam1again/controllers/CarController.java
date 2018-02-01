package com.example.exam1again.controllers;

import com.example.exam1again.models.Car;
import com.example.exam1again.services.CarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

  @Autowired
  CarService carService;

  @GetMapping(value = "/cars")
  public String mainPage(@RequestParam(value = "q", required = false) String q,
      @RequestParam(value = "police", required = false) String police,
      @RequestParam(value = "diplomat", required = false) String diplomat,
      Model model) {
    List<Car> cars;
    if (q == null && police == null && diplomat == null) {
        cars = carService.findAllCars();
      } else if (q != null && police == null && diplomat == null) {
        cars = carService.findCarByPlate(q);
      } else if (q == null && police != null && diplomat == null) {
        cars = carService.findPoliceCars(police);
      } else if (q == null && police == null && diplomat != null) {
        cars = carService.findDiplomatCars(diplomat);
      } else {
        cars = null;
    }
    model.addAttribute("cars", cars);
    return "main";
  }

  @GetMapping(value = "/cars/{brand}")
  public String mainPageBrandSearch(@PathVariable String brand, Model model) {
    List<Car> cars = carService.findCarByBrand(brand);
    model.addAttribute("cars", cars);
    return "main";
  }
}
