package com.example.firstproject.repositories;

import com.example.firstproject.models.Log;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Integer> {
  List<Log> findByIdBetween(int start, int end);
  List<Log> findByIdAfter(int start);
  List<Log> findByDataContains();
}
