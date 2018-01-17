package com.example.connectionmysql.repository;

import com.example.connectionmysql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Integer> {

List<Todo> findAllByTitleContains(String title);

}