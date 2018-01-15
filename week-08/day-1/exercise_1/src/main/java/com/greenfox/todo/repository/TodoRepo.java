package com.greenfox.todo.repository;

import com.greenfox.todo.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<ToDo, Integer> {

}
