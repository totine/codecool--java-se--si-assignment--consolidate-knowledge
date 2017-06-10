package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.util.BookSearch;

import java.util.List;


public class Catalog implements BookSearch{

    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        return null;
    }
}
