package com.projeto.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("Teste 1");
        minhaLista.add("Teste 2");
        minhaLista.add("Teste 3");
        minhaLista.add("Teste 4");
        minhaLista.add("Teste 5");
        minhaLista.add("Teste 6");

        System.out.println(minhaLista);

        minhaLista.remove(2);
        minhaLista.add("Teste 99");

        System.out.println(minhaLista);


    }
}
