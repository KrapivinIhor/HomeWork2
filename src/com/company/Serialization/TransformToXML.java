package com.company.Serialization;

import java.util.List;

public class TransformToXML {

    public static void printAsXML(List<Figure> figures){
        System.out.println("<?xml version=" + "\"" + "1.0" + "\"" +"?>");
        System.out.println("<GROUP>");
        kindOfTheFigureXML(figures);
        System.out.println("</GROUP>");
    }

    public static void kindOfTheFigureXML(List<Figure> figures){
        for (Figure f : figures) {
            if (f instanceof Triangle){
                System.out.println("\t" + "<KIND>" + "Triangle" + "</KIND>" + "\n" +
                                   "\t" + "<SIDE>" + Triangle.getSide() + "</SIDE>" + "\n" +
                                   "\t" + "<PERIMETER>" + Triangle.getPerimeter() + "</PERIMETER>");
            }
            else if (f instanceof Circle){
                System.out.println("\t" + "<KIND>" + "Circle" + "</KIND>" + "\n" +
                                   "\t" + "<RADIUS>" + Circle.getRadius() + "</RADIUS>" + "\n" +
                                   "\t" + "<PERIMETER>" + Circle.getPerimeter() + "</PERIMETER>");
            }
            else if (f instanceof Square){
                System.out.println("\t" + "<KIND>" + "Triangle" + "</KIND>" + "\n" +
                                   "\t" + "<SIDE>" + Square.getSide() + "</SIDE>" + "\n" +
                                   "\t" + "<PERIMETER>" + Square.getPerimeter() + "</PERIMETER>");
            }

        }
    }
}
