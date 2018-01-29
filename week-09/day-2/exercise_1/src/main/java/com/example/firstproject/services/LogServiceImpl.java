package com.example.firstproject.services;

import com.example.firstproject.models.Log;
import com.example.firstproject.repositories.LogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

  @Autowired
  LogRepository logRepository;

  @Override
  public void save(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> findAll() {
    List<Log> logList = (List<Log>) logRepository.findAll();
    return logList;
  }

  @Override
  public int numberOfLogs() {
    int count = (int) logRepository.count();
    return count;
  }

  @Override
  public List<Log> findLogsWhereDataContains(String input) {
    return null;
  }

  @Override
  public List<Log> findPageOfLogs(int pageSize, int pageNumber) {

    int maxId = numberOfLogs() - ((pageNumber-1) * pageSize);
    int minId = maxId- pageSize;

    List<Log> results = (List<Log>) (logRepository.findByIdBetween(maxId, minId));
    return results;
  }

  @Override
  public List<Log> findByIdAfter(int start) {
    List<Log> results = (List<Log>) logRepository.findByIdAfter(start);
    return results;
  }

}
