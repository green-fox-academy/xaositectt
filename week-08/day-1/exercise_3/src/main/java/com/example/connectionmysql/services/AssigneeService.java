package com.example.connectionmysql.services;

import com.example.connectionmysql.models.Assignee;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface AssigneeService {

  List<Assignee> getAllAssignees();

  Assignee getAssignee(int id);

  void modifyAssignee(Assignee assignee);

  void create(Assignee assignee);

  void delete(int id);

}
