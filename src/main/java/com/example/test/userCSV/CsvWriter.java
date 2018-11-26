package com.example.test.userCSV;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvWriter {
  public void writeCsv(List<OldUser> userList) {
    Writer writer = null;
    String filename = "src/main/resources/userOutput.csv";
    try {
      writer = Files.newBufferedWriter(Paths.get(filename));
    } catch (
        IOException e) {
      e.printStackTrace();
    }
    CSVWriter csvWriter = new CSVWriter(writer, '|', CSVWriter.NO_QUOTE_CHARACTER);

    String insertClause = "I want to write a SQL INSERT statement here";

    for (OldUser user : userList) {
      String sqlStatement = "";

        sqlStatement = insertClause + user.getUsername()
            + "','" + user.getForename()
            + "','" + user.getSurname()
            + "','" + "NoRoles"
            + ");";
        String[] arrayString = {sqlStatement};
        csvWriter.writeNext(arrayString);
      }
      try {
        csvWriter.flush();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
