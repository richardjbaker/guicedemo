package org.example;

import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class UserService {

    private final List<String> users = new ArrayList<>();

    public void addUser(String name) {
        users.add(name);
    }

    public List<String> getUsers() {
        return users;
    }

    public boolean exists(String user) {
        return users.contains(user);
    }
}
