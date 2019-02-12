package com.company.Serialization;

public class Square extends Figure {
    private double side;
    private double perimeter;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return perimeter = 4 * side;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void parametersOfFigure() {
        System.out.println("Square with a side " + getSide() + "Has perimeter " + getPerimeter());
    }
}
