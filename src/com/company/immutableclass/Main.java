package com.company.immutableclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ferrari ferrari = new Ferrari(355,"Red", 890,32.4);
        System.out.println("Ferrari speed is " + ferrari.getSpeed() + "\n" + "Ferrari color is " + ferrari.getColor() + "\n" +
                           "Ferrari Horse Power is " + ferrari.getHorsePower() + "\n" + "Ferrari patrol per minute is " + ferrari.getPetrolPerMiles() );
    }
}
