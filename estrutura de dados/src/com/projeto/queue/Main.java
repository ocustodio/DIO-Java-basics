package com.projeto.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> filaCarros = new LinkedList<>();

        filaCarros.add(new Carro("Ford"));
        filaCarros.add(new Carro("Fiat"));
        filaCarros.add(new Carro("Mazda"));
        filaCarros.add(new Carro("Ferrari"));

        System.out.println(filaCarros);

        filaCarros.remove();
        System.out.println(filaCarros);

        System.out.println(filaCarros.peek());
        System.out.println(filaCarros.poll());


    }
}
