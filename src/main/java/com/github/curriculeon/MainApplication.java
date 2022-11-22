package com.github.curriculeon;

import java.util.*;

public class MainApplication {
    public static void removingFromList() {
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");
        List<PersonDefault> personList = new LinkedList<>();
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(new PersonDefault(29, null, null));
        personList.remove(3);

        printList(personList);
    }

    public static void reverseAndPrintList(List<PersonDefault> personDefaults) {
        Collections.reverse(personDefaults);
        printList(personDefaults);
    }

    public static void printList(List<PersonDefault> personDefaults) {
        for(PersonDefault personDefault : personDefaults) {
            System.out.println(personDefault);
        }
    }

    public static void addingToList() {
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");
        List<PersonDefault> personList = new ArrayList<>();
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(new PersonDefault(29, null, null));

    }


    public static void removingFromArray() {
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");

        PersonDefault[] defaultPeople = new PersonDefault[]{
                person4, person5, person6
        };

        defaultPeople[2] = null;

        defaultPeople = new PersonDefault[]{
                person4, person5, null
        };

        PersonDefault[] defaultPersonPlusOneMore = new PersonDefault[defaultPeople.length-1];
        for (int i = 0; i < defaultPersonPlusOneMore.length-1; i++) {
            defaultPersonPlusOneMore[i] = defaultPeople[i];
        }
    }


    public static void addingToArray() {
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");

        PersonDefault[] defaultPeople = new PersonDefault[]{
                person4, person5, person6
        };

        PersonDefault[] defaultPersonPlusOneMore = new PersonDefault[defaultPeople.length+1];
        for (int i = 0; i < defaultPersonPlusOneMore.length; i++) {
            defaultPersonPlusOneMore[i] = defaultPeople[i];
        }
        defaultPersonPlusOneMore[3] = new PersonDefault(0, null, null);
    }

    public static void doSomethingToPeopleList(List<PersonDefault> list) {
        list.add(new PersonDefault(5, null, null));
    }

    public static void doSomethingToPeopleArray(PersonDefault[] array) {
        PersonDefault[] defaultPersonPlusOneMore = new PersonDefault[array.length+1];
        for (int i = 0; i < defaultPersonPlusOneMore.length; i++) {
            defaultPersonPlusOneMore[i] = array[i];
        }
        defaultPersonPlusOneMore[array.length+1] = new PersonDefault(1, null, null);
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
