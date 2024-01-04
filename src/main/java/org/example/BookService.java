package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BookService {

    private final List<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
    }
}
