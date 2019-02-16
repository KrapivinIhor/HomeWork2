package com.company.serialization;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {
    private List<Figure> figures;
    private List<Group> groups;

    public Group(List<Figure> figures) {
        this.figures = new ArrayList<>(figures);
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public List<Group> getGroups(){ return groups;}

    @Override
    public void parametersOfFigure() {
        System.out.println("Group with elements:");
        for (Figure figure : figures) {
            System.out.print("\t");
            figure.parametersOfFigure();
            System.out.println();
        }
    }
}
