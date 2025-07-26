package com.juanpatron.estructurasdedatos.list.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

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
    }
}
