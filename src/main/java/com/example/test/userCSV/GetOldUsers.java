package com.example.test.userCSV;

import java.util.Arrays;
import java.util.List;

public class GetOldUsers {

    public List<OldUser> getAllusers() {
      OldUser u1 = new OldUser();
      u1.setForename("Mike");
      u1.setSurname("Brecker");
      u1.setUsername("michaelb@test.com");

      OldUser u2 = new OldUser();
      u2.setForename("Sarah");
      u2.setSurname("Vaughan");
      u2.setUsername("sarahsinger@test.com");

      List<OldUser> allUsers = Arrays.asList(u1,u2);

      return allUsers;
    }
}
