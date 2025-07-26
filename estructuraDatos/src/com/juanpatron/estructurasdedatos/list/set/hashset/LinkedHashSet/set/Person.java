package com.juanpatron.estructurasdedatos.list.set.hashset.LinkedHashSet.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person  {


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
        com.juanpatron.estructurasdedatos.list.set.hashset.Person person = (com.juanpatron.estructurasdedatos.list.set.hashset.Person) o;
        return Objects.equals(dni, ((Person) o).dni);
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
        Set<com.juanpatron.estructurasdedatos.list.set.hashset.Person> personas = new HashSet<>();
        com.juanpatron.estructurasdedatos.list.set.hashset.Person person1 = new com.juanpatron.estructurasdedatos.list.set.hashset.Person("Maria", "123");
        com.juanpatron.estructurasdedatos.list.set.hashset.Person person2 = new com.juanpatron.estructurasdedatos.list.set.hashset.Person("Ana", "456");
        com.juanpatron.estructurasdedatos.list.set.hashset.Person person3 = new com.juanpatron.estructurasdedatos.list.set.hashset.Person("Ana2", "456");
        com.juanpatron.estructurasdedatos.list.set.hashset.Person person4 = null;

        //create
        personas.add(person1);
        personas.add(person2);
        personas.add(person3);
        personas.add(person4);


        //list
        for( com.juanpatron.estructurasdedatos.list.set.hashset.Person person : personas  ) {
            if(person != null) {
                System.out.println(person);
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
