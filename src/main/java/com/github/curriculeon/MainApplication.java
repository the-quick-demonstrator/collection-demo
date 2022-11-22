package com.github.curriculeon;

import java.util.GregorianCalendar;

public class MainApplication {
    public static void main(String[] args) {
        
    }
    public static void demo1() {
        GregorianCalendar birthdate1 = new GregorianCalendar(1993, 4, 23);
        GregorianCalendar birthdate2 = new GregorianCalendar(1994, 4, 23);
        GregorianCalendar birthdate3 = new GregorianCalendar(1995, 4, 23);

        PersonCalendar person1 = new PersonCalendar(birthdate1, "Leon", "Hunter");
        PersonCalendar person2 = new PersonCalendar(birthdate2, "Leon", "Hunter");
        PersonCalendar person3 = new PersonCalendar(birthdate3, "Leon", "Hunter");

        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");

        PersonCalendar[] calendarPeople = new PersonCalendar[]{
                person1, person2, person3
        };

        PersonDefault[] defaultPeople = new PersonDefault[]{
                person4, person5, person6
        };

        PersonInterface[] people = new PersonInterface[] {
                person1, person2, person3, person4, person5, person6
        };

        Object[] objectArray = new Object[]{
                person1, person2, person3, person4, person5, person6
        };

        for (int i = 0; i < objectArray.length; i++) {
            Object o = objectArray[i];
        }


        for (int i = 0; i < people.length; i++) {
            PersonInterface person = people[i];
            System.out.println("Person index = " + i);
            System.out.println(person.getAge());
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
        }
    }
}
