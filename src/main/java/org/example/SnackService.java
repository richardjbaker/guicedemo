package org.example;

import com.google.inject.Inject;
import org.checkerframework.checker.index.qual.IndexFor;

import java.util.ArrayList;
import java.util.List;

public class SnackService {

    private List<String> snacks = new ArrayList<>();
    private UserService userService;

    @Inject
    public SnackService(UserService userService) {
        this.userService = userService;
    }

    public void createSnack(String snackName) {
        snacks.add(snackName);
    }

    public void buy(String snackName, String user) {
        if (userService.exists(user)) {
            System.out.printf("%s bought %s%n", user, snackName);
        } else {
            System.out.printf("%s is not registered%n", user);
        }
    }
}
