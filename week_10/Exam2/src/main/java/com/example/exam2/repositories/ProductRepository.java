package com.example.exam2.repositories;

import com.example.exam2.models.entities.Product;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

  @Query(value = "SELECT p FROM Product p GROUP BY p.itemName")
  List<Product> findAllDistinctName();

  @Query(value = "SELECT p FROM Product p GROUP BY p.size")
  List<Product> findAllDistinctSize();


  Product findByItemNameAndSize(String name, String size);

}
