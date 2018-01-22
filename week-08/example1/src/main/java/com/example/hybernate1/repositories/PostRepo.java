package com.example.hybernate1.repositories;

import com.example.hybernate1.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

}
