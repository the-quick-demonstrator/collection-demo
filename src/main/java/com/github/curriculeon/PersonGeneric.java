package com.github.curriculeon;

public class PersonGeneric {
    public final PersonProperty<Integer> age;
    public final PersonProperty<String> firstName;
    public final PersonProperty<String> lastName;

    public PersonGeneric(int age, String firstName, String lastName) {
        this.age = new PersonProperty<>(age);
        this.firstName = new PersonProperty<>(firstName);
        this.lastName = new PersonProperty<>(lastName);
    }
}
