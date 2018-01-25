package com.example.firstproject.services;

import com.example.firstproject.models.Log;
import com.example.firstproject.repositories.LogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements  LogService{

  @Autowired
  LogRepository logRepository;

  @Override
  public void save(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> findAll() {
    List<Log> logList =(List<Log>)logRepository.findAll();
    return logList;
  }

  @Override
  public int numberOfLogs() {
    int count = (int)logRepository.count();
    return count;
  }


}
