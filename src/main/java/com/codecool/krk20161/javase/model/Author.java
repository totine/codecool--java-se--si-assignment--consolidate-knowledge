package com.codecool.krk20161.javase.model;

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

    public String getName() {
        return name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
