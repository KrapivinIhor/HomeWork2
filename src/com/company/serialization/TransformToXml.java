package com.company.serialization;

import java.util.List;

public class TransformToXml {

        public static String transform(Figure figure) {
            String xmlLines = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
            xmlLines += transformOfFigure(figure);
            return xmlLines;
        }

        private static String transformOfFigure(Figure figures) {
            String xmlLines = "";
            if (figures instanceof Triangle) {
                xmlLines += transformOfTriangleAsXML((Triangle) figures);
            } else if (figures instanceof Square) {
                xmlLines += transformOfSquareAsXML((Square) figures);
            } else if (figures instanceof Circle) {
                xmlLines += transformOfCircleAsXML((Circle) figures);
            } else if (figures instanceof Group) {
                xmlLines += transformOfGroupAsXML((Group) figures);
            }
            return xmlLines;
        }
        private static String transformOfTriangleAsXML(Triangle triangle) {
            String xmlLinesTriangle = "<Triangle>\n";
            double[] triangleSides = triangle.getSidesOfTriangle();
            for (int index = 0; index < 3; index++) {
                xmlLinesTriangle += "\t<side_" + index + ">";
                xmlLinesTriangle += triangleSides[index];
                xmlLinesTriangle += "</side_" + index + ">\n";
            }
            xmlLinesTriangle += "\t<perimeter>" + triangle.getPerimeter() + "</perimeter>\n";
            xmlLinesTriangle += "</Triangle>\n";
            return xmlLinesTriangle;
        }

        private static String transformOfSquareAsXML(Square square) {
            String xmlLinesSquare = "<Square>\n";
            xmlLinesSquare += "\t<side>" + square.getSide() + "</side>\n";
            xmlLinesSquare += "\t<perimeter>" + square.getPerimeter() + "</perimeter>\n";
            xmlLinesSquare += "</Square>\n";
            return xmlLinesSquare;
        }

        private static String transformOfCircleAsXML(Circle circle) {
            String xmlLinesCircle = "<Circle>\n";
            xmlLinesCircle += "\t<radius>" + circle.getRadius() + "</radius>\n";
            xmlLinesCircle += "\t<perimeter>" + circle.getPerimeter() + "</perimeter>\n";
            xmlLinesCircle += "</Circle>\n";
            return xmlLinesCircle;
        }

        private static String transformOfGroupAsXML(Group group) {
            StringBuilder xmlStrBuilderGroup = new StringBuilder();
            xmlStrBuilderGroup.append("<Group>\n\t<shapes>\n");
            List<Figure> shapes = group.getFigures();
            for (Figure figure : shapes) {
                String[] lines = transformOfFigure(figure).split("\n");
                for (String line : lines) {
                    xmlStrBuilderGroup.append("\t\t").append(line).append("\n");
                }
            }
            xmlStrBuilderGroup.append("\t</shapes>\n</Group>\n");
            return xmlStrBuilderGroup.toString();

        }
    }
