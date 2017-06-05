package com.codecool.krk20161.javase.model;

/**
 * Created by joanna on 05.06.17.
 */
public class Author {
    private String name;
    String biography;

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }
}
