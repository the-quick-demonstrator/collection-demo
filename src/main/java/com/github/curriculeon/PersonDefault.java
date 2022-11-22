package com.github.curriculeon;

public class PersonDefault implements PersonInterface {
    private int age;
    private String firstName;
    private String lastName;

    public PersonDefault(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

}
