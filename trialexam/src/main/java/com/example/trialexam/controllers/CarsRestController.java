package com.example.trialexam.controllers;

import com.example.trialexam.models.Cars;
import com.example.trialexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsRestController {

  @Autowired
  CarService carService;

  @GetMapping(value = "/api/search/{brand}")
  public Object append(@PathVariable String brand) {
    Cars cars = new Cars();
    if (brand == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      cars.setCars(carService.lookUpBrand(brand));
      if (cars.getCars() == null) {
        cars.setResult("not_ok");
      } else { cars.setResult("ok");}
    }
    return cars;
  }

}
