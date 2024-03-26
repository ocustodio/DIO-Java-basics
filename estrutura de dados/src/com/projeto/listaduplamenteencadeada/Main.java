package com.projeto.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("Teste 1");
        minhaLista.add("Teste 2");
        minhaLista.add("Teste 3");
        minhaLista.add("Teste 4");
        minhaLista.add("Teste 5");

        System.out.println(minhaLista);

        minhaLista.remove(0);

        System.out.println(minhaLista);

        minhaLista.add(0, "Teste 99");

        System.out.println(minhaLista);
    }
}
