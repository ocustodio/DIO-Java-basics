package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println(intA + " " + intB);
        intA = 2;
        System.out.println(intA + " " + intB);

        MeuObj a = new MeuObj(1);
        MeuObj b = a;

        System.out.println(a + " " + b);
        a.setNum(2);
        System.out.println(a + " " + b);

    }
}
