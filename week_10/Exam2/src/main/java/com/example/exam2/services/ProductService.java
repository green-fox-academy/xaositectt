package com.example.exam2.services;

import com.example.exam2.models.Product;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

  public List<Product> findAllDistinctName();

  public List<Product> findAllDistinctSize();

  public List<Product> findAll();

  public Product findOne(String name, String size);

  public List<Product> findByPriceGreaterThan(int price);
  public List<Product> findByPriceLowerThan(int price);
  public List<Product> findByPriceEquals(int price);

}
