package org.example;

import jakarta.inject.Singleton;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Singleton
public class UserService {

    private final List<String> users = new ArrayList<>();

    public void addUser(String name) {
        users.add(name);
    }

    public boolean exists(String user) {
        return users.contains(user);
    }
}
