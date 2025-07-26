package com.juanpatron.estructurasdedatos.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Juan");
        students.add("Carlos");
        students.add("Katia");

        System.out.println("students = " + students);

        System.out.println(students.get(0));
        System.out.println(students.remove(1));
        System.out.println("students = " + students);

        students.set(0, "Anais");
        students.set(1, "Memo");

        students.add(2, "Vic");

        System.out.println("students = " + students);


    }
}
