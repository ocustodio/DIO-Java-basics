package com.projeto.morecollections.generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    // Generics examples with Lists
        // Without generics
        List listWithoutGenerics = new ArrayList();
        listWithoutGenerics.add("first element");
        listWithoutGenerics.add(10);

        for (Object element : listWithoutGenerics) {
            String str = element.toString(); // casting
            System.out.println(str);
        }

        // With generics
        List<String> listWithGenerics = new ArrayList<>();
        listWithGenerics.add("first element");
        listWithGenerics.add("second element");

        listWithGenerics.forEach(System.out::println); // without stream()

        // Generics examples with Sets
        // Without generics
        Set setWithoutGenerics = new HashSet();
        setWithoutGenerics.add("second element");
        setWithoutGenerics.add(20);

        for (Object element: setWithoutGenerics) {
            String str = element.toString();
            System.out.println(element);
        }

        // With generics

        Set<String> setWithGenerics = new HashSet<>();
        setWithGenerics.add("third element");
        setWithGenerics.add("fourth element");

        setWithGenerics.forEach(System.out::println);

        // Generics examples with Maps
        // Without generics
        Map mapWithoutGenerics = new HashMap();
        mapWithoutGenerics.put(1, "first element");
        mapWithoutGenerics.put("2", 2);

        for (Object object: mapWithoutGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) object;
            Integer k = Integer.parseInt(entry.getKey().toString());
            Object v = entry.getValue();
            System.out.println(k + " " + v);
        }

        // With generics
        Map<Integer, String> mapWithGenerics = new HashMap<>();
        mapWithGenerics.put(4, "fourth element");
        mapWithGenerics.put(5, "fifth element");

        for(Map.Entry<Integer, String> entry: mapWithGenerics.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " " + v);
        }
    }
}

// Class with generics
class Box<T> {
    private T tipo;

    public void setTipo(T tipo) {
        this.tipo = tipo;
    }

    public T getTipo() {
        return tipo;
    }
}



