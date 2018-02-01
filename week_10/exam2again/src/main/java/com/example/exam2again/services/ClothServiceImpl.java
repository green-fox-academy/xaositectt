package com.example.exam2again.services;

import com.example.exam2again.models.Cloth;
import com.example.exam2again.repositories.ClothRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClothServiceImpl implements ClothService {

  @Autowired
  ClothRepository clothRepository;

  @Override
  public List<Cloth> findAll() {
    return (List<Cloth>) clothRepository.findAll();
  }

  @Override
  public List<Cloth> findDistinctTypes() {
    List<Cloth> clothes = (List<Cloth>) clothRepository.findAll();
    List<Cloth> distinctByName = new ArrayList<>();

    for (int i = 0; i < clothes.size(); i++) {

      int nameOccurence = 0;
      for (int j = 0; j < distinctByName.size(); j++) {
        if (clothes.get(i).getItemName().equals(distinctByName.get(j).getItemName())) {
          nameOccurence++;
        }
      }
      if (nameOccurence == 0) {
        distinctByName.add(clothes.get(i));
      }
    }

    return distinctByName;
  }

  @Override
  public List<Cloth> findDistinctSizes() {
    List<Cloth> clothes = (List<Cloth>) clothRepository.findAll();
    List<Cloth> distinctBySize = new ArrayList<>();

    for (int i = 0; i < clothes.size(); i++) {

      int sizeOccurence = 0;
      for (int j = 0; j < distinctBySize.size(); j++) {
        if (clothes.get(i).getSize().equals(distinctBySize.get(j).getSize())) {
          sizeOccurence++;
        }
      }
      if (sizeOccurence == 0) {
        distinctBySize.add(clothes.get(i));
      }
    }
    return distinctBySize;
  }

  @Override
  public Cloth findOne(String name, String size) {
    return clothRepository.findByItemNameAndSize(name, size);
  }
}
