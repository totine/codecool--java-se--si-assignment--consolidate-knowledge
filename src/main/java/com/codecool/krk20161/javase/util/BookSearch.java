package com.codecool.krk20161.javase.util;

import com.codecool.krk20161.javase.model.Author;
import com.codecool.krk20161.javase.model.Book;

import java.util.List;


public interface BookSearch {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(Author author);

}
