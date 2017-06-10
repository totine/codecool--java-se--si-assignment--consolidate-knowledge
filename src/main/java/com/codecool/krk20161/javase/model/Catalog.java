package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;
import com.codecool.krk20161.javase.util.BookSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Catalog implements BookSearch{
    
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return books.stream().filter(x -> x.getTitle().equals(title)).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        return null;
    }

    public ArrayList<Book> getBooks() {
        return (ArrayList<Book>) books;
    }

    public void add(Book book) throws AlreadyInCatalogException {
        if (books.stream().anyMatch(x -> x.getTitle().equals(book.getTitle())))
            throw new AlreadyInCatalogException();
        books.add(book);
    }

    public void remove(Book bookToRemove) {
    }
}
