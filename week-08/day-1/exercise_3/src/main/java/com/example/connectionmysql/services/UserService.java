package com.example.connectionmysql.services;

import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.models.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

  List<User> getAllUsers();

  User getUser(int id);

  void modifyUser(User user);

  void create(User user);

  void delete(int id);

}
