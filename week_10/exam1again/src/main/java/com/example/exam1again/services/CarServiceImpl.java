package com.example.exam1again.services;

import com.example.exam1again.models.Car;
import com.example.exam1again.repositories.CarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> findAllCars() {
    return (List<Car>) carRepository.findAll();
  }

  @Override
  public List<Car> findPoliceCars(String q) {
    if (q.equals("1")) {
      return carRepository.findByPlateStartsWith("RB");
    } else {
      return null;
    }
  }

  @Override
  public List<Car> findDiplomatCars(String q) {
    if (q.equals("1")) {
      return carRepository.findByPlateStartsWith("DT");
    } else {
      return null;
    }
  }

  @Override
  public List<Car> findCarByPlate(String plate) {
    List<Car> cars = carRepository.findByPlateStartsWith(plate);
    if (cars.size() > 0) {
      return cars;
    } else {
      return null;
    }
  }

  @Override
  public List<Car> findCarByBrand(String brand) {
    List<Car> cars = carRepository.findAllByCarbrand(brand);
    return cars;
  }
}
