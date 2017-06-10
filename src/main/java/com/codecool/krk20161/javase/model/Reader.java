package com.codecool.krk20161.javase.model;

import com.codecool.krk20161.javase.util.BookSearch;

import java.util.ArrayList;
import java.util.List;


public class Reader implements BookSearch {
    
    private String name;
    private ArrayList<Book> read;


    public Reader(String name) {
    }

    public Reader(String name, List<Book> read) {
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getRead() {
        return read;
    }
}
