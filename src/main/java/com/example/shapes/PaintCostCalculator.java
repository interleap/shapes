package com.example.shapes;

public class PaintCostCalculator {

    public double calculateCost(Rectangle rectangle){
        return 2* rectangle.area() + 5;
    }

    public double calculateCost(Triangle triangle){
        return 2* triangle.area() + 5;
    }
    
}