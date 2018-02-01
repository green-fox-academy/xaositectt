package com.example.exam2again.repositories;


import com.example.exam2again.models.Cloth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothRepository extends CrudRepository<Cloth, Integer>{

  Cloth findByItemNameAndSize(String name, String size);

}
