package com.example.exam2.services;

import com.example.exam2.models.entities.Product;
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
}
