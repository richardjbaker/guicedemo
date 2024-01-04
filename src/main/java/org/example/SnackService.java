package org.example;

import com.google.inject.Inject;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SnackService {

    @Getter
    private final List<String> snacks = new ArrayList<>();
    private final UserService userService;

    @Inject
    public SnackService(UserService userService) {
        this.userService = userService;
    }

    public void createSnack(String snackName) {
        snacks.add(snackName);
    }

    public void buy(String snackName, String user) {
        if (userService.exists(user)) {
            log.info("{} bought {}", user, snackName);
        } else {
            log.info("{} is not registered", user);
        }
    }
}
