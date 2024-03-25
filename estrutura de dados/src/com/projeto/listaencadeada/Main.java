package com.projeto.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("TESTE 1");
        minhaLista.add("TESTE 2");
        minhaLista.add("TESTE 3");
        minhaLista.add("TESTE 4");

        System.out.println(minhaLista);
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.size());
        System.out.println(minhaLista.remove(2));
        System.out.println(minhaLista);

    }
}
