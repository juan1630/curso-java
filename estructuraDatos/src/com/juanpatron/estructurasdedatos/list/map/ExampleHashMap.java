package com.juanpatron.estructurasdedatos.list.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop" , 1000);
        productPrices.put("IPhone" , 20000);
        productPrices.put("Tablet", 1500);

        System.out.println("productPrices = " + productPrices);
        System.out.println(productPrices.get("Laptop"));
        productPrices.remove("IPhone");
        productPrices.put("Tablet", 2500);
    }
}
