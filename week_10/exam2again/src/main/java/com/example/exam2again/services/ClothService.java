package com.example.exam2again.services;

import com.example.exam2again.models.Cloth;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ClothService {

  List<Cloth> findAll();

  List<Cloth> findDistinctTypes();

  List<Cloth> findDistinctSizes();

  Cloth findOne(String name, String size);

}
