package com.company.Serialization;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {
    private List<Figure> figures;

    public Group(List<Figure> figures) {
        this.figures = new ArrayList<>(figures);
    }

    public List<Figure> getFigures() {
        return figures;
    }

    @Override
    public void asString() {
        System.out.println("Group with elements:");
        for (Figure figure : figures) {
            System.out.print("\t");
            figure.asString();
            System.out.println();
        }
    }
}
