package com.example.trialexam.services;

import com.example.trialexam.models.Car;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CarService {

  List<Car> lookUpPlate(String input);
  List<Car> lookUpBrand(String input);
  List<Car> findAll();
  List<Car> findIfContains(String substring);

}
