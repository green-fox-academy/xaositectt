package com.example.exam2.services;

import com.example.exam2.models.entities.Product;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

  public List<Product> findAllDistinctName();

  public List<Product> findAllDistinctSize();

  public List<Product> findAll();

  public Product findOne(String name, String size);

}
