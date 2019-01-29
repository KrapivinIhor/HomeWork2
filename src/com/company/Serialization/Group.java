package com.company.Serialization;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {


    private List<Figure> figureList;

    public Group(List<Figure> figureList) {
        this.figureList = new ArrayList<>(figureList);
    }

    public List<Figure> getFigureList() {
        return figureList;
    }

    @Override
    public void outLine() {
        System.out.println("Figure array consist of: ");
        for (Figure figure : figureList) {
            System.out.println(figure.toString());
        }
    }
}
