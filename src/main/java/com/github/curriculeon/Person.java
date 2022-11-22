package com.github.curriculeon;

// comparable person
public class Person implements Comparable<Person>, PersonInterface {
    private int age;
    private String firstName;
    private String lastName;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person personToCompareAgainst) {
        int difference = personToCompareAgainst.getFirstName().compareTo(this.getFirstName());
        boolean firstNameIsSame = difference == 0;
        if(firstNameIsSame) {
            difference = personToCompareAgainst.getLastName().compareTo(this.getLastName());
        }
        return difference;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
