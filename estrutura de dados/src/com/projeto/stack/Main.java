package com.projeto.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Volkswagen"));
        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("Alpine"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());

        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());

    }
}
