package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector();
        LibraryService libraryService = injector.getInstance(LibraryService.class);

        libraryService.registerUser("John");
        libraryService.registerUser("Mary");
        libraryService.registerUser("Peter");

        libraryService.createBook("The Lord of the Rings");
        libraryService.createBook("The Hobbit");
        libraryService.createBook("The Silmarillion");

        SnackService snackService = injector.getInstance(SnackService.class);
        snackService.createSnack("Chips");
        snackService.buy("Chips", "John");
    }
}