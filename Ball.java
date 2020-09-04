package ru.mirea.lab1;

import java.lang.*;
public class Ball {
    private String color;
    private int radius;
    public Ball(String n, int a){
        color = n;
        radius = a;
    }
    public Ball(String n){
        color = n;
        radius = 0;
    }
    public Ball(){
        color = "Pup";
        radius = 0;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius+ "cm in diameter";
    }
    public void intoTheSize(){
        System.out.println(color+" ball is "+radius*2+" cm in diameter");
    }
}