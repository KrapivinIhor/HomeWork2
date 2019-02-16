package com.company.patternbuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here

        final Person person = new Person.PersonBuilder()
                                    .name("Jon")
                                    .age(18)
                                    .height(178.5)
                                    .weight(73.5)
                                    .build();
        System.out.println(person.toString());

    }
}
