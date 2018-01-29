package com.example.trialexam.repositories;

import com.example.trialexam.models.Car;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, String>{

  List<Car> findAllByPlateStartingWith(String input);
  List<Car> findAllByBrand(String input);
  List<Car> findAllByPlateContains(String input);
}
