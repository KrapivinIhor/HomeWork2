package com.company.Serialization;

public class Square extends Figure {
    private static double side;
    private static double perimeter;

    public Square(double side) {
        this.side = side;
    }

    public static double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static double getPerimeter() {
        return perimeter = 4 * side;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void outLine() {
        System.out.println("Square with a side " + getSide() + "Has perimeter " + getPerimeter());
    }
}
