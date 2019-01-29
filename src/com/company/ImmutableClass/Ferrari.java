package com.company.ImmutableClass;

public class Ferrari {
    private final int speed;
    private  final String color;
    private final int horsePower;
    private final double pPM;

    public Ferrari(final int speed, final String color, final int horsePower, final double pPM) {
        this.speed = speed;
        this.color = color;
        this.horsePower = horsePower;
        this.pPM = pPM;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getpPM() {
        return pPM;
    }
}
