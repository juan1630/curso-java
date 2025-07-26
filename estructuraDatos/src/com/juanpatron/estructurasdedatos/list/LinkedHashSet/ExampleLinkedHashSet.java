package com.juanpatron.estructurasdedatos.list.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();

        //El  hashSet y el LinkedHashSet implementa la misma interfaz que es Set

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50); //No acpeta elementos repetidos
        System.out.println(numbers);

        numbers.remove(30);
        numbers.remove(40);
        System.out.println(numbers);

        //update del has
        numbers.remove(60);
        numbers.add(90);
        System.out.println(numbers);

        System.out.println(numbers.contains(1));
        System.out.println(numbers.contains(30));

    }
}
