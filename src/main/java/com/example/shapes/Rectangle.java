package com.example.shapes;

public class Rectangle implements Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }
}
