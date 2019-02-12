package com.company.Serialization;
import java.util.List;

public class TransformToJson {

        public static String transform(Figure figures) {
            String jsonLines = "{";
            jsonLines += transformOfFigure(figures);
            jsonLines += "\n}";
            return jsonLines;
        }

        private static String transformOfFigure(Figure figures) {
            String jsonLinesFigures = " ";
            if (figures instanceof Triangle) {
                jsonLinesFigures += presentationOfTriangleAsJSON((Triangle) figures);
            } else if (figures instanceof Square) {
                jsonLinesFigures += presentationOfSquareAsJSON((Square) figures);
            } else if (figures instanceof Circle) {
                jsonLinesFigures += presentationOfCircleAsJSON((Circle) figures);
            } else if (figures instanceof Group) {
                jsonLinesFigures += presentationOfGroupAsJSON((Group) figures);
            }
            return jsonLinesFigures;
        }

        private static String presentationOfTriangleAsJSON(Triangle triangle) {
            StringBuilder jsonLinesTriangle = new StringBuilder("\t\"Triangle\" : {\n");
            double[] triangleSides = triangle.getSidesOfTriangle();
            for (int i = 0; i < 2; i++) {
                jsonLinesTriangle.append("\t\t\"side_").append(i + 1).append("\"").append(" : ");
                jsonLinesTriangle.append("\"").append(triangleSides[i]).append("\"");
                jsonLinesTriangle.append(",\n");
            }
            jsonLinesTriangle.append("\t\t\"side_3\" : ");
            jsonLinesTriangle.append("\"").append(triangleSides[2]).append("\"");
            jsonLinesTriangle.append("\n\t\t\"perimeter\" : ");
            jsonLinesTriangle.append("\"").append(triangle.getPerimeter()).append("\"");
            jsonLinesTriangle.append("\n\t}");
            return jsonLinesTriangle.toString();
        }

        private static StringBuilder presentationOfSquareAsJSON(Square square) {
            StringBuilder jsonLinesSquare = new StringBuilder("\t\"Square\" : {\n");
            jsonLinesSquare.append("\t\t\"side\" : \"" + square.getSide() + "\"\n");
            jsonLinesSquare.append("\t}");
            return jsonLinesSquare;
        }

        private static StringBuilder presentationOfCircleAsJSON(Circle circle) {
            StringBuilder jsonLinesCircle = new StringBuilder("\t\"Circle\" : {\n");
            jsonLinesCircle.append("\t\t\"radius\" : \"" + circle.getRadius() + "\"\n");
            jsonLinesCircle.append("\t\t\"perimeter\" : \"" + circle.getRadius() + "\"\n");
            jsonLinesCircle.append("\t}");
            return jsonLinesCircle;
        }

        private static String presentationOfGroupAsJSON(Group group) {
            StringBuilder jsonLinesGroup = new StringBuilder();
            jsonLinesGroup.append("\t\"Group\" : {\n");
            List<Figure> figures = group.getFigures();
            for (Figure figure : figures) {
                String[] lines = transformOfFigure(figure).split("\n");
                for (String line : lines) {
                    jsonLinesGroup.append("\t").append(line).append("\n");
                }
                jsonLinesGroup.setCharAt(jsonLinesGroup.length() - 1, ',');
                jsonLinesGroup.append("\n");
            }
            jsonLinesGroup.deleteCharAt(jsonLinesGroup.length() - 2); // Removing last comma
            jsonLinesGroup.append("\t}");
            return jsonLinesGroup.toString();
        }
}
