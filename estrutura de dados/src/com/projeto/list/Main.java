package com.projeto.list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Ferrari"));
        listaCarro.add(new Carro("Fiat"));
        listaCarro.add(new Carro("Facetti"));

        System.out.println(listaCarro);

        System.out.println(listaCarro.get(0));
        System.out.println(listaCarro.indexOf(new Carro("Fiat")));

        listaCarro.remove(2);
        System.out.println(listaCarro);
    }
}
