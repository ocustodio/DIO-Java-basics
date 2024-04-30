package com.projeto.classeanonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};

        // Anonymous class
        gatos.sort(new Comparator<Gato>(){
            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        });

        System.out.println(gatos);

        // Lambda function

//        gatos.sort(Comparator.comparing(new Function<Gato, String>() {
//            @Override
//            public String apply(Gato gato) {
//                return gato.getNome();
//            }
//        }));

        gatos.sort(Comparator.comparing(gato -> gato.getNome()));

        System.out.println(gatos);

    }
}

class Gato {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
