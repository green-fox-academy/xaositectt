package com.example.connectionmysql.repository;

import com.example.connectionmysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee, Integer> {

}
