package com.example.firstproject.services;

import com.example.firstproject.models.Log;
import org.springframework.stereotype.Service;

@Service
public interface LogService {

  void save(Log log);

}
