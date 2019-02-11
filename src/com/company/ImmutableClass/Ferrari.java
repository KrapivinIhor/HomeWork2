package com.company.ImmutableClass;

public final class Ferrari {
    private final int speed;
    private  final String color;
    private final int horsePower;
    private final double petrolPerMiles;

    public Ferrari(final int speed, final String color, final int horsePower, final double pPM) {
        this.speed = speed;
        this.color = color;
        this.horsePower = horsePower;
        this.petrolPerMiles = pPM;
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

    public double getPetrolPerMiles() {
        return petrolPerMiles;
    }
}
