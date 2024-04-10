package com.projeto.collections.list;

import java.util.*;

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

        System.out.println("");

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

//        Double sum = 0d;
//
//        for(int i = 0; i < notas.size(); i++) {
//            sum += notas.get(i);
//        }
//
//        System.out.print("total: " + sum);

        Iterator<Double> iterator = notas.iterator();

        Double sum = 0d;

        while(iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }

        System.out.println(sum);

        System.out.println(sum / notas.size());

        System.out.println(notas.remove(notas.indexOf(1.2)));
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()) {
            Double next = iterator1.next();

            if (next < 7) iterator1.remove();
        }

        System.out.println(notas);

        notas.clear();

        System.out.println(notas);

        System.out.println(notas.isEmpty());

        List<Double> newNotas = new LinkedList<>();
        newNotas.addAll(notas3);
        System.out.println(newNotas);
        System.out.println(newNotas.get(0));
        System.out.println(newNotas.remove(0));
    }
}