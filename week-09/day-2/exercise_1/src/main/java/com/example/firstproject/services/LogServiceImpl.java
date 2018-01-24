package com.example.firstproject.services;

import com.example.firstproject.models.Log;
import com.example.firstproject.repositories.LogRepository;
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
}
