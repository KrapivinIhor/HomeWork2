package com.company.serialization;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Figure> list1 = new ArrayList<>();
        list1.add(new Triangle(new double[]{6.5, 4.9, 15.0}));
        list1.add(new Square(13.3));
        list1.add(new Circle(22.5));
        Figure group1 = new Group(list1);

        List<Figure> list2 = new ArrayList<>();
        list2.add(new Triangle(new double[]{6.3, 8.0, 10.0}));
        list2.add(new Square(33.7));
        list2.add(new Circle(21.8));
        list2.add(group1);
        Figure group2 = new Group(list2);

        List<Figure> list3 = new ArrayList<>();
        list3.add(new Triangle(new double[]{11.5, 12.4, 21.5}));
        list3.add(new Square(10.3));
        list3.add(new Circle(12.25));
        list3.add(group2);
        Figure mainGroup = new Group(list3);

        System.out.println("XML string");
        System.out.println(TransformToXml.transform(mainGroup));
        System.out.println("############################################");
        System.out.println();
        System.out.println("JSON string");
        System.out.println(TransformToJson.transform(mainGroup));
     }
}
