package com.projeto.collections.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7.1, 2.3, 4.5, 1.1, 0d, 4.3, 8d, 5.9));

        System.out.println(notas);

        System.out.println(notas.contains(2.3));

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        Double sum = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }

        System.out.println(sum);
        System.out.println(sum / notas.size());

        notas.remove(0d);
        System.out.println(notas);

//        while(iterator1.hasNext()) {
//            Double next = iterator1.next();
//            if (next < 7) iterator1.remove();
//        }

        notas.removeIf(next -> next < 7);

        System.out.println(notas);

        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);

        notas.clear();
        System.out.println(notas.isEmpty());
    }
}
