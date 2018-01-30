package com.example.exam2.controllers;


import com.example.exam2.models.OutputProductList;
import com.example.exam2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

  @Autowired
  ProductService productService;

  @GetMapping(value = "/shoppingplanner/query")
  public OutputProductList productRestController(@RequestParam(value = "price", required = false) String price,
      @RequestParam(value = "type", required = false) String type) {
    OutputProductList productList = new OutputProductList();
    if (price != null || type != null) {
      if (type.equals("higher")) {
        productList.setResult("ok");
        productList.setClothes(productService.findByPriceGreaterThan(Integer.valueOf(price)));
      } else if (type.equals("lower")) {
        productList.setResult("ok");
        productList.setClothes(productService.findByPriceLowerThan(Integer.valueOf(price)));
      } else if (type.equals("equal")) {
        productList.setResult("ok");
        productList.setClothes(productService.findByPriceEquals(Integer.valueOf(price)));
      } else {
        productList.setResult("not ok");
        productList.setClothes(null);
      }
    } else {
      productList.setResult("not ok");
      productList.setClothes(null);
    }
    return productList;
  }

}
