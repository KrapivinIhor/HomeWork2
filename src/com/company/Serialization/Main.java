package com.company.Serialization;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Figure> figures = new ArrayList<>();
        figures.add(new Triangle(5.5));
        figures.add(new Square(3));
        figures.add(new Circle(12));
        
        TransformToJSON.printAsJSON(figures);
        System.out.println("-------------------------");
        TransformToXML.printAsXML(figures);
     }
}
