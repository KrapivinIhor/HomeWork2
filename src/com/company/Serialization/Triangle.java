package com.company.Serialization;

public class Triangle extends Figure{
    private static double side;
    private static double perimeter;

    public Triangle(double side) {
        this.side = side;
    }

    public static double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static double getPerimeter() {
        return perimeter = 3 * getSide();
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void outLine() {
        System.out.println("Triangle with a side " + getSide() + "Has perimeter " + getPerimeter());
    }


}
