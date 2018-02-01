package com.example.exam2.controllers;

import com.example.exam2.models.ProductData;
import com.example.exam2.models.Product;
import com.example.exam2.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

  @Autowired
  ProductService productService;

  @GetMapping(value = "/shoppingplanner")
  public String getAllDistinct(Model model) {
    List<Product> products = productService.findAll();
    List<Product> productNames = productService.findAllDistinctName();
    List<Product> productSizes = productService.findAllDistinctSize();
    model.addAttribute("newProductData", new ProductData());
    model.addAttribute("products", products);
    model.addAttribute("productNames", productNames);
    model.addAttribute("productSizes", productSizes);
    return "main";
  }

  @PostMapping(value = "/shoppingplanner/result")
  public String getOne(@ModelAttribute ProductData productData, Model model) {

    Product product = productService.findOne(productData.getName(), productData.getSize());

    int price = productData.getQuantity()*product.getUnitPrice();
    //error handling if there is no such article!!
    model.addAttribute("quantity", productData.getQuantity());
    model.addAttribute("totalPrice", price);
    model.addAttribute("price", product.getUnitPrice());
    model.addAttribute("product", product);
    return "result";
  }
}

