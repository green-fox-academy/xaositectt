package com.example.connectionmysql.services;

import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.models.User;
import com.example.connectionmysql.repository.TodoRepo;
import com.example.connectionmysql.repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

  @Autowired
  UserRepo userRepository;

  @Override
  public List<User> getAllUsers() {
    List<User> users;
    users = (List<User>) userRepository.findAll();
    return users;
  }

  @Override
  public User getUser(int id) {
    User user;
    user = userRepository.findOne(id);
    return user;

  }

  @Override
  public void modifyUser(User user) {
    userRepository.save(user);
  }

  @Override
  public void create(User user) {
    userRepository.save(user);
  }

  @Override
  public void delete(int id) {
    userRepository.delete(id);
  }
}
