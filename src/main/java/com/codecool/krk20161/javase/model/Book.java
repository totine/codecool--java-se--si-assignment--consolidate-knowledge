package com.codecool.krk20161.javase.model;

/**
 * Created by joanna on 05.06.17.
 */
public class Book {

    private String title;
    private Author author;
    private String summary;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, Author author, String summary) {
        this.title = title;
        this.author = author;
        this.summary = summary;
    }
}
