package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.util.BookSearch;

import java.util.ArrayList;
import java.util.List;


public class Catalog implements BookSearch{
    
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        return null;
    }

    public ArrayList<Book> getBooks() {
        return (ArrayList<Book>) books;
    }

    public void add(Book book) {
    }

    public void remove(Book bookToRemove) {
    }
}
