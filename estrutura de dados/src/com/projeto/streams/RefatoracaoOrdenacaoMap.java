package com.projeto.streams;

import java.util.*;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        Map<Integer, Contato> contatos = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 7777));
        }};

        System.out.println(contatos);
        for (Map.Entry<Integer, Contato> entry: contatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        Map<Integer, Contato> insertContatos = new LinkedHashMap<>(contatos);
        System.out.println(insertContatos);
        for (Map.Entry<Integer, Contato> entry: insertContatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        // Anonymous function

//        Set<Map.Entry<Integer, Contato>> newContatos = new TreeSet<>(
//                new Comparator<Map.Entry<Integer, Contato>>() {
//                    @Override
//                    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
//                        return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
//                    }
//                }
//        );

        // Comparator comparing

//        Set<Map.Entry<Integer, Contato>> newContatos = new TreeSet<>(
//                Comparator.comparing(
//                        new Function<Map.Entry<Integer, Contato>, Integer>() {
//                            @Override
//                            public Integer apply(Map.Entry<Integer, Contato> contato) {
//                                return contato.getValue().getNumero();
//                            }
//                        }
//                )
//        );

        // Using lambda

        Set<Map.Entry<Integer, Contato>> newContatos = new TreeSet<>(
                Comparator.comparing(contatoEntry -> contatoEntry.getValue().getNumero())
        );
        newContatos.addAll(insertContatos.entrySet());

        for (Map.Entry<Integer, Contato> entry: newContatos) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero());
        }

        Set<Map.Entry<Integer, Contato>> newContatos2 = new TreeSet<>(
                new Comparator<Map.Entry<Integer, Contato>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                        return contato1.getValue().getNome().compareTo(contato2.getValue().getNome());
                    }
                }
        );
        newContatos2.addAll(insertContatos.entrySet());

        for (Map.Entry<Integer, Contato> entry: newContatos2) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

    }
}

class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}

//class ComparatorOrdemNum implements Comparator<Map.Entry<Integer, Contato>> {
//    @Override
//    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
//        return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
//    }
//}

//class ComparatorOrdemNome implements Comparator<Map.Entry<Integer,Contato>> {
//    @Override
//    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
//        return contato1.getValue().getNome().compareTo(contato2.getValue().getNome());
//    }
//}