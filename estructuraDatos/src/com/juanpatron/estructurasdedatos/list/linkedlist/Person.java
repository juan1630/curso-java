package com.juanpatron.estructurasdedatos.list.linkedlist;

import java.util.Objects;

public class Person {

    private String name;

    public  Person  (String name) {
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return  true;
        if(o == null  || getClass() != o.getClass() ) return  false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
     }

    public static void main(String[] args) {
        Person persona = new Person("Juan");
        Person persona2 = new Person("Maria");

        System.out.println(persona2.equals(persona));
    }
}
