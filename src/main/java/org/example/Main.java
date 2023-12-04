package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector();
        LibraryService libraryService = injector.getInstance(LibraryService.class);

//        UserService userService = new UserService();
//        BookService bookService = new BookService();
//        LibraryService libraryService = new LibraryService(userService, bookService);

        libraryService.registerUser("John");
        libraryService.registerUser("Mary");
        libraryService.registerUser("Peter");

        System.out.println(libraryService.getAllUsers());

        libraryService.createBook("The Lord of the Rings");
        libraryService.createBook("The Hobbit");
        libraryService.createBook("The Silmarillion");

        System.out.println(libraryService.getAllBooks());

        SnackService snackService = injector.getInstance(SnackService.class);
        snackService.createSnack("Chips");
        snackService.buy("Chips", "John");

    }
}