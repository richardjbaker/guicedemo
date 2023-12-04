package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<String> books = new ArrayList<>();
    public void addBook(String bookName) {
        books.add(bookName);
    }

    public List<String> getBooks() {
        return books;
    }
}
