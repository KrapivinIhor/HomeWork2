package com.company.Serialization;
import java.util.List;

public class TransformToJSON {

    public static void printAsJSON(List<Figure> figures){
        System.out.println('{');
        kindOfTheFigureJSON(figures);
        System.out.println('}');
    }

    public static void kindOfTheFigureJSON(List<Figure> figures){
        for (Figure f : figures) {
            if (f instanceof Triangle){
                System.out.println("\t" + "\"" + "shape: " + "\"" + "Triangle" + ',' + "\n"
                                 + "\t" + "\"" + "side: " + "\"" + Triangle.getSide() + "\"" + ',' + "\n"
                                 + "\t" + "\"" + "perimeter: " + "\"" + Triangle.getPerimeter() + "\"");
            }
            else if (f instanceof Circle){
                System.out.println("\t" + "\"" + "shape: " + "\"" + "Circle" + ',' + "\n"
                                 + "\t" + "\"" + "radius: " + "\"" + Circle.getRadius() + "\"" + ',' + "\n"
                                 + "\t" + "\"" + "perimeter: " + "\"" + Circle.getPerimeter() + "\"");
            }
            else if (f instanceof Square){
                System.out.println("\t" + "\"" + "shape: " + "\"" + "Square" + ',' + "\n"
                                 + "\t" + "\"" + "side: " + "\"" + Square.getSide() + "\"" + ',' + "\n"
                                 + "\t" + "\"" + "perimeter: " + "\"" + Square.getPerimeter() + "\"");
            }

        }
    }

}
