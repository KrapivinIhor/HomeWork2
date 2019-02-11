package com.company.PatternBuilder;

public class Person {
    private final String name;
    private final int age;
    private final double weight;
    private final double height;

    public Person(final PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
        this.weight = personBuilder.getWeight();
        this.height = personBuilder.getHeight();
    }

    @Override
    public String toString() {
        return "Person " +
                "name = '" + name + '\'' + "\n" + "\t" +
                " age = " + age + "\n" + "\t" +
                " weight = " + weight + "\n" + "\t" +
                " height = " + height;
    }
}

class PersonBuilder {
    private String name;
    private int age;
    private double weight;
    private double height;

   private PersonBuilder name(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age){
        this.age = age;
        return this;
    }

    public PersonBuilder weight(double weight){
        this.weight = weight;
        return this;
    }

    public PersonBuilder height(double heigt){
        this.height = heigt;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Person build(){
        return new Person(this);
    }
}
