package com.projeto.collections.set;

import java.util.*;

public class SetFirstExercise {
    public static void main(String[] args) {
        Set<Rainbow> arcoIro = new HashSet<>();

        arcoIro.add(new Rainbow("red"));
        arcoIro.add(new Rainbow("orange"));
        arcoIro.add(new Rainbow("yellow"));
        arcoIro.add(new Rainbow("green"));
        arcoIro.add(new Rainbow("blue"));
        arcoIro.add(new Rainbow("indigo"));
        arcoIro.add(new Rainbow("violet"));

        for (Rainbow color: arcoIro) {
            System.out.println(color.getColor());
        }

        int sum = 0;
        for (Rainbow color: arcoIro) {
            sum++;
        }
        System.out.println(sum);

        TreeSet<Rainbow> newArcoIro = new TreeSet<>(arcoIro);
        System.out.println(newArcoIro);

        NavigableSet<Rainbow> reverseArcoIro = newArcoIro.descendingSet();
        System.out.println(reverseArcoIro);

        Iterator<Rainbow> iterator = newArcoIro.iterator();
        while (iterator.hasNext()) {
            Rainbow next = iterator.next();

            if (next.getColor().toLowerCase().startsWith("v")) {
                System.out.println(next);
            } else {
                iterator.remove();
            }
        }
        System.out.println(newArcoIro);

        newArcoIro.clear();
        System.out.println(newArcoIro);
    }
}

class Rainbow implements Comparable<Rainbow>{
    private final String color;

    public Rainbow(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }

    @Override
    public int compareTo(Rainbow rainbow) {
        return this.getColor().compareTo(rainbow.getColor());
    }
}