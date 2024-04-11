package com.projeto.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderingListExample {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();

        gatos.add(new Gato("Jon", 18, "preto"));
        gatos.add(new Gato("Simba", 6, "tigrado"));
        gatos.add(new Gato("Jon", 12, "laranja"));

        System.out.println(gatos);

        Collections.shuffle(gatos);
        System.out.println(gatos);


        Collections.sort(gatos);
        System.out.println(gatos);

//        Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato>{
    private final String name;
    private Integer age;
    private final String color;

    public Gato(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", color= '" + color + '\'' +
                '}';
    }


    @Override
    public int compareTo(Gato gato) {
        return this.getName().compareTo(gato.getName());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        if (gato1.getAge() < gato2.getAge()) return -1;
        if (gato1.getAge() > gato2.getAge()) return 1;

        return 0;
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getColor().compareTo(gato2.getColor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        int name = gato1.getName().compareTo(gato2.getName());
        if (name != 0) return name;

        int color = gato1.getColor().compareTo(gato2.getColor());
        if (color != 0) return color;

        return gato1.getAge().compareTo(gato2.getAge());
    }
}