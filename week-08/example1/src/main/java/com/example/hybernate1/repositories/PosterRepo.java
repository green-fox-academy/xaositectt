package com.example.hybernate1.repositories;

import com.example.hybernate1.models.Poster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosterRepo extends CrudRepository<Poster, Integer> {

}
