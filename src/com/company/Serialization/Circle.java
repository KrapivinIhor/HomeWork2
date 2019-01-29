package com.company.Serialization;

public class Circle extends Figure {
    private static double radius;
    private static double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPerimeter() {
        return perimeter = 2 * Math.PI * getRadius() ;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void outLine() {
        System.out.println("Circle with radius " + getRadius() + "Has perimeter " + getPerimeter());
    }
}
