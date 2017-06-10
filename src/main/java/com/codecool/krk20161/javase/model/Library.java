package com.codecool.krk20161.javase.model;


public class Library {
    
    private Catalog catalog;

    public Library() {
        catalog = new Catalog();
    }
    
    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
