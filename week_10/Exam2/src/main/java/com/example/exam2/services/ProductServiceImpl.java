package com.example.exam2.services;

import com.example.exam2.models.Product;
import com.example.exam2.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  ProductRepository productRepository;


  @Override
  public List<Product> findAllDistinctName() {
    //return productRepository.findDistinctByItemName("");
    return productRepository.findAllDistinctName();
  }

  @Override
  public List<Product> findAllDistinctSize() {
    return productRepository.findAllDistinctSize();
  }

  @Override
  public List<Product> findAll() {
    return (List<Product>)productRepository.findAll();
  }

  @Override
  public Product findOne(String name, String size) {
    return productRepository.findByItemNameAndSize(name, size);
  }

  @Override
  public List<Product> findByPriceGreaterThan(int price) {
    return productRepository.findByUnitPriceGreaterThan(price);
  }

  @Override
  public List<Product> findByPriceLowerThan(int price) {
    return productRepository.findByUnitPriceLessThan(price);
  }

  @Override
  public List<Product> findByPriceEquals(int price) {
    return productRepository.findByUnitPriceEquals(price);
  }
}
