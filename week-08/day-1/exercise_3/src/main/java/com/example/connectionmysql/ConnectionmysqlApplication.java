package com.example.connectionmysql;

import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {

  @Autowired
  TodoRepo todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(ConnectionmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

    todoRepo.save(new Todo("bullshit", false, false));
    todoRepo.save(new Todo("bullcrap", false, false));
    todoRepo.save(new Todo("horseshit", false, false));
    todoRepo.save(new Todo("horseshit", false, true));
    todoRepo.save(new Todo("horseshit", false, true));
    todoRepo.save(new Todo("horseshit", false, true));

	}
}
