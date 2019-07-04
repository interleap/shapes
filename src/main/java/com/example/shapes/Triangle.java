package com.example.shapes;

public class Triangle implements Shape{

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static Triangle createIsoscelesTriangle(double base, double equalSide){
        return new Triangle(base, equalSide, equalSide);
    }

    public static Triangle createRightAngledTriangle(double base, double height){
        return new Triangle(base, height, Math.sqrt(base * base + height * height));
    }

    private double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

}