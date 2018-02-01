package com.example.exam1again.repositories;

import com.example.exam1again.models.Car;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
  List<Car> findByPlateStartsWith(String plateStart);
  List<Car> findAllByCarbrand(String brand);

}
