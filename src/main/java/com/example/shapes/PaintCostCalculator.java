package com.example.shapes;

public class PaintCostCalculator {

    public double calculateCost(Shape shape){
        return 2* shape.area() + 5;
    }
}