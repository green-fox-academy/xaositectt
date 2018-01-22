package com.example.experiment1.repositories;

import com.example.experiment1.domain.Post;
import com.example.experiment1.domain.Poster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {



}
