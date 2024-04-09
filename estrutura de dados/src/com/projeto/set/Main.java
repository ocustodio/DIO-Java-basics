package com.projeto.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> setCarros = new HashSet<>();

        setCarros.add(new Carro("Ford"));
        setCarros.add(new Carro("Fiat"));
        setCarros.add(new Carro("Ferrari"));

//        System.out.println(setCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Volkswagen"));
        treeSetCarros.add(new Carro("Mazda"));
        treeSetCarros.add(new Carro("Alpine"));

        System.out.println(treeSetCarros);
    }
}
