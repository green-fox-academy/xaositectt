package com.example.exam2.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
public class Product {

  @Id
  int id;

  @Column(name = "item_name")
  private String itemName;

  private String manufacturer;

  private String category;

  private String size;

  @Column(name = "unit_price")
  private int unitPrice;

  private boolean in_store;

  public Product(int id, String itemName, String manufacturer, String category,
      String size, int unitPrice) {
    this.id = id;
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.unitPrice = unitPrice;
  }

  public Product() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

}
