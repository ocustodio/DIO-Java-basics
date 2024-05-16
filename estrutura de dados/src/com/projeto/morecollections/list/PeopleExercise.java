package com.projeto.morecollections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleExercise {
    public static void main(String[] args) {
        OrdenacaoPessoa newList = new OrdenacaoPessoa();

        newList.addPessoa("vito", 25, 1.84);
        newList.addPessoa("vito1", 23, 1.43);
        newList.addPessoa("vito2", 14, 1.65);
        newList.addPessoa("vito3", 54, 1.95);
        newList.addPessoa("vito4", 34, 1.23);

        System.out.println(newList.getPessoaList());
        System.out.println(newList.orderByAge());
        System.out.println(newList.orderByHeight());

    }
}

class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", altura: " + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.idade, pessoa.idade);
    }
}

class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> orderByAge() {
        List<Pessoa> orderByAgeList = new ArrayList<>(pessoaList);

        if(!this.pessoaList.isEmpty()) {
            Collections.sort(orderByAgeList);
        }

        return orderByAgeList;
    }

    public List<Pessoa> orderByHeight() {
        List<Pessoa> orderByHeightList = new ArrayList<>(pessoaList);
        orderByHeightList.sort(new OrderByHeight());

        return orderByHeightList;
    }

    public List<Pessoa> getPessoaList() {
        return new ArrayList<>(pessoaList);
    }
}

class OrderByHeight implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}