package com.example.test.userCSV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class UserCsvApplication {

  public static void main(String... args) {
    GetUsers getUsers = new GetUsers();
    getUsers.getUsers();
  }
}

