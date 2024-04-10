package com.projeto.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List oldListNotas1 = new ArrayList<>(); // before JAVA 5
        List<Double> notas1 = new ArrayList<>(); // generics (jdk 5) and diamond operator (jdk 7)
        ArrayList<Double> notas2 = new ArrayList<>(); // not recommended
        List<Double> notas3 = new ArrayList<>(Arrays.asList(7d, 5.3, 4.2, 2.1, 4d, 5.1));
        List<Double> notas4 = Arrays.asList(7d, 5.3, 4.2, 2.1, 4d, 5.1); // cant add or remove elements (abstract list)
        List<Double> notas5 = List.of(7d, 5.3, 4.2, 2.1, 4d, 5.1); // immutable list

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(5.3);
        notas.add(4.2);
        notas.add(2.1);

        System.out.println(notas);
        System.out.println(notas.get(0));
        System.out.println(notas.indexOf(7d));

        notas.add(3, 8d);
        System.out.println(notas);

        notas.set(notas.indexOf(7d), 1.2);
        System.out.println(notas);

        System.out.println(notas.contains(4.1));

        for(int i = 0; i < notas.size(); i++) {
            System.out.print(notas.get(i) + ", ");
        }
    }
}
