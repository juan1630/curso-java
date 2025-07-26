package com.juanpatron.estructurasdedatos.list.linkedlist;

import java.util.LinkedList;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();

        cities.add("México");
        cities.add(("NY"));
        cities.add("Paris");

        ((LinkedList<String>)cities).addFirst("London");
        ((LinkedList<String>)cities).addFirst("Berlin");

        System.out.println("cities = " + cities);
        System.out.println(cities.get(2));
        System.out.println(cities.set(2, "Madrid"));

        ((LinkedList<String>)cities).removeFirst();
        ((LinkedList<String>)cities).removeLast();

        System.out.println(cities);

        String searchCity = "London";
        if(cities.contains(searchCity)) {
            System.out.println("Está en la lista");
        }else {
            System.out.println("No está en la lista");
        }
    }
}
