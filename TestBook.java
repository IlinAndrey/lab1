package ru.mirea.lab1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Booratino", 128);
        Book d2 = new Book("Three pigs", 64);
        Book d3 = new Book("Chipollino");
        d3.setPages(224);
        System.out.println(d1);
        d1.intoPages();
        d2.intoPages();
        d3.intoPages();
    }
}
