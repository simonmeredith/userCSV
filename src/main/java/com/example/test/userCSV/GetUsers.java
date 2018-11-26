package com.example.test.userCSV;

import java.util.List;

public class GetUsers {

  public void getUsers() {

    GetOldUsers getOldUsers = new GetOldUsers();

    List<OldUser> allusers = getOldUsers.getAllusers();
    CsvWriter csvWriter = new CsvWriter();
    csvWriter.writeCsv(allusers);
  }
}
