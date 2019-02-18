package com.company.serialization;

import java.util.Arrays;

public class Triangle extends Figure{
    private  double[] sidesOfTriangle;
    private  double perimeter;

    public Triangle(double[] side) {
        this.sidesOfTriangle = side;
    }

    public Triangle(double v, int i, int i1) {
        super();
    }

    public double[] getSidesOfTriangle() {
        return sidesOfTriangle;
    }

    public double getPerimeter() {
        return perimeter = Arrays.stream(sidesOfTriangle).sum();
    }

    @Override
    public void parametersOfFigure() {
        System.out.println("Triangle with a side " + getSidesOfTriangle() + "Has perimeter " + getPerimeter());
    }
}
