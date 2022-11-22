package com.github.curriculeon;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class PersonCalendar implements PersonInterface {
    private GregorianCalendar birthDate;
    private String firstName;
    private String lastName;

    public PersonCalendar(GregorianCalendar birthDate, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void yellForHelp() {
        System.out.println("Help!!!");
    }

    @Override
    public int getAge() {
        // convert birthdate to localdate
        LocalDate todayLocalDate = LocalDate.now();
        LocalDate birthLocalDate = this
                .birthDate
                .getTime()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        Period period = Period.between(birthLocalDate, todayLocalDate);
        return period.getYears();
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
}
