package com.example.firstproject.services;

import com.example.firstproject.models.Log;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface LogService {

  void save(Log log);

  List<Log> findAll();


  int numberOfLogs();

  List<Log> findLogsWhereDataContains(String input);

  List<Log> findPageOfLogs(int pageSize, int pageNumber);

  List<Log> findByIdAfter(int start);


}
