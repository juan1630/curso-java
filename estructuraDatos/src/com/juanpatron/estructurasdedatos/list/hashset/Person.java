package com.juanpatron.estructurasdedatos.list.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {


    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
    //equals compara si 2 objetos son iguales

    public static void main(String[] args) {
        Set<Person> personas = new HashSet<>();
        Person person1 = new Person("Maria", "123");
        Person person2 = new Person("Ana", "456");
        Person person3 = new Person("Ana2", "456");
        Person person4 = null;

        //create
        personas.add(person1);
        personas.add(person2);
        personas.add(person3);
        personas.add(person4);


        //list
        for( Person person : personas  ) {
            if(person != null) {
                System.out.println(person.name);
            }

        }

        //delete
        personas.remove(person4);
        System.out.println(personas);

        //update

        personas.add(person2);
        System.out.println(personas);

        System.out.println(personas.contains(person1));

    }
}
