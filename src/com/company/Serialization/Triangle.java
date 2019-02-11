package com.company.Serialization;

import java.util.Arrays;
import java.util.stream.IntStream;

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
    public void asString() {
        System.out.println("Triangle with a side " + getSidesOfTriangle() + "Has perimeter " + getPerimeter());
    }


}
