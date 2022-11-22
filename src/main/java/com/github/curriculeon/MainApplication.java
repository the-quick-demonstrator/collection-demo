package com.github.curriculeon;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
        genericPersonDemo();
    }
    public static void genericPersonDemo() {
        PersonGeneric person = new PersonGeneric(29, "Leon", "Hunter");
        person.age.print();
        person.firstName.print();
        person.firstName.set("Something else");
        String lastName = person.lastName.get();
        int age = person.age.get();
        person.age.set(5);
        person.lastName.set("Hello");
        System.out.println(lastName);

    }

    public static void treeSetDemo(){
        // TREE
            // in comparable order
        PersonInterface person1 = new PersonDefault(27, "Corey", "Hunter");
        PersonInterface person2 = new PersonDefault(29, "Alex", "Hunter");
        PersonInterface person3 = new PersonDefault(28, "Bobbie", "Hunter");
        Set<PersonInterface> set = new TreeSet<>(Arrays.asList(person1, person2, person3));
        List<PersonInterface> listToBeReversed = new ArrayList<>(set);
        Collections.reverse(listToBeReversed);
        System.out.println(listToBeReversed);
    }

    public static void hashSetExample() {
        // HASH
            // least-memory-intensive
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");
        List<PersonInterface> unmodifiableList = Arrays.asList(person4, person5, person6);
        List<PersonInterface> arrayList = new ArrayList<>();
        arrayList.add(person4);
        arrayList.add(person5);
        arrayList.add(person6);
        List<PersonInterface> linkedList = new LinkedList<>();
        linkedList.add(person4);
        linkedList.add(person5);
        linkedList.add(person6);
        Set<PersonInterface> combinedSet = new LinkedHashSet<>(unmodifiableList);
        combinedSet.addAll(arrayList);
        combinedSet.addAll(linkedList);
        System.out.println(combinedSet);
        System.out.println(combinedSet.size());
    }

    public static void combiningLists() {
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");
        List<PersonInterface> unmodifiableList = Arrays.asList(person4, person5, person6);
        List<PersonInterface> arrayList = new ArrayList<>();
        arrayList.add(person4);
        arrayList.add(person5);
        arrayList.add(person6);
        List<PersonInterface> linkedList = new LinkedList<>();
        linkedList.add(person4);
        linkedList.add(person5);
        linkedList.add(person6);
        List<PersonInterface> combinedList = new ArrayList<>(unmodifiableList);
        combinedList.addAll(arrayList);
        combinedList.addAll(linkedList);
        System.out.println(combinedList);
        System.out.println(combinedList.size());

    }

    public static void unmodifiableList() {
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");
        List<PersonInterface> persons = Arrays.asList(person4, person5, person6);
        persons.add(new PersonDefault(0, null, null));
    }

    public static void linkedListExample() {
        // LinkedList advantage: Faster insertion and removal from center of list
        // ArrayList advantage: Fast insertion at the end of the list
        // LINKED
            // insertion-order
        PersonDefault person4 = new PersonDefault(29, "Leon", "Hunter");
        PersonDefault person5 = new PersonDefault(28, "Leon", "Hunter");
        PersonDefault person6 = new PersonDefault(27, "Leon", "Hunter");
        List<PersonDefault> personList = new ArrayList<>();
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        System.out.println(personList);
    }
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
