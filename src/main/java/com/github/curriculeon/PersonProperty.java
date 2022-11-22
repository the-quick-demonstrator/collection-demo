package com.github.curriculeon;

public class PersonProperty<AnyType> {
    private AnyType property;

    public PersonProperty(AnyType property) {
        this.property = property;
    }

    public AnyType get() {
        return this.property;
    }


    public void set(AnyType anyType) {
        this.property = anyType;
    }

    public void print() {
        System.out.println(get());
    }
}


