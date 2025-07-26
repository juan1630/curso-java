package com.juanpatron.estructurasdedatos.list.equals;

public class ExampleEquals {
    public static void main(String[] args) {
        Integer numberA = 100;
        Integer numberB = 100;

        System.out.println(numberB == numberA); //da true, por el cache de integers -128 a 127 cuando son enteros
        System.out.println(numberB.equals(numberA));

        Integer numberA2 = 128;
        Integer numberB2 = 128;

        System.out.println(numberB2 == numberA2); //false porque solo almacena  hasta 127
        System.out.println(numberB2.equals(numberA2));

    }
}
