package com.projeto.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros.get(1).hashCode());
        System.out.println(listaCarros.get(0).equals(listaCarros.get(1)));
    }
}
