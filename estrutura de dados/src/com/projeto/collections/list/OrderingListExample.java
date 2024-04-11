package com.projeto.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingListExample {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();

        gatos.add(new Gato("Jon", null, "preto"));
        gatos.add(new Gato("Simba", 6, "tigrado"));
        gatos.add(new Gato("Jhon", 12, "laranja"));

        System.out.println(gatos);

        Collections.shuffle(gatos);
        System.out.println(gatos);


        Collections.sort(gatos);
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