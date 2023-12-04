package org.example;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PACKAGE;

@RequiredArgsConstructor(access = PACKAGE, onConstructor = @__(@Inject))
public class LibraryService {

    private final UserService userService;
    private final BookService bookService;

//    @Inject
//    public LibraryService(UserService userService, BookService bookService) {
//        this.userService = userService;
//        this.bookService = bookService;
//    }

    public void registerUser(String name) {
        userService.addUser(name);
    }

    public List<String> getAllUsers() {
        return userService.getUsers();
    }

    public void createBook(String name) {
        bookService.addBook(name);
    }

    public List<String> getAllBooks() {
        return bookService.getBooks();
    }
}
