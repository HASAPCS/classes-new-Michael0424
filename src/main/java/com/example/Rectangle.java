package com.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        // TODO: Initialize the length and width
    }

    public double area() {
        double area = length * width;
        // TODO: Calculate and return the area of the rectangle
        return area;  // Change this default return statement
    }

    public double perimeter() {
        double perimeter = 2 * (length + width);
        // TODO: Calculate and return the perimeter of the rectangle
        return perimeter;  // Change this default return statement
    }
}
