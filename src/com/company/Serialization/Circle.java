package com.company.Serialization;

public class Circle extends Figure {
    private double radius;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return perimeter = 2 * Math.PI * getRadius() ;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void parametersOfFigure() {
        System.out.println("Circle with radius " + getRadius() + "Has perimeter " + getPerimeter());
    }
}
