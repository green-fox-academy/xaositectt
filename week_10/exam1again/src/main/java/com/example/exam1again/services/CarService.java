package com.example.exam1again.services;


import com.example.exam1again.models.Car;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CarService {

  public List<Car> findAllCars();

  public List<Car> findPoliceCars(String q);
  public List<Car> findDiplomatCars(String q);
  public List<Car> findCarByPlate(String plate);
  public List<Car> findCarByBrand(String brand);


}
