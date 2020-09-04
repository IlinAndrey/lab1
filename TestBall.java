package ru.mirea.lab1;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Red", 10);
        Ball d2 = new Ball("Green", 11);
        Ball d3 = new Ball("Black");
        d3.setRadius(9);
        System.out.println(d1);
        d1.intoTheSize();
        d2.intoTheSize();
        d3.intoTheSize();
    }
}
