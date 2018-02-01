package com.example.trialexam.services;

import com.example.trialexam.models.Car;
import com.example.trialexam.repositories.CarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{

  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> lookUpPlate(String plate) {
    return carRepository.findAllByPlateStartingWith(plate);
  }

  @Override
  public List<Car> lookUpBrand(String brand) {
    return carRepository.findAllByBrand(brand);
  }

  @Override
  public List<Car> findAll() {
    return (List<Car>)carRepository.findAll();
  }

  @Override
  public List<Car> findIfContains(String substring) {
    return (List<Car>)carRepository.findAllByPlateContains(substring);
  }




}
