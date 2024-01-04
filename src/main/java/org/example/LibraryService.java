package org.example;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;

import static lombok.AccessLevel.PACKAGE;

@RequiredArgsConstructor(access = PACKAGE, onConstructor = @__(@Inject))
public class LibraryService {

    private final UserService userService;
    private final BookService bookService;

    public void registerUser(String name) {
        userService.addUser(name);
    }

    public void createBook(String name) {
        bookService.addBook(name);
    }
}

