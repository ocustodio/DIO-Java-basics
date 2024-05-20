package com.projeto.morecollections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ConjuntoConvidado convidados = new ConjuntoConvidado();
        convidados.adicionarConvidado("Vito", "1");
        convidados.adicionarConvidado("Camille", "2");
        convidados.adicionarConvidado("Vitoria", "3");

        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());
        convidados.removeConvidadoByCod("1");
        convidados.exibirConvidados();

    }
}

class Convidado {
    private String nome;
    private String codConvidado;

    public Convidado(String nome, String codConvidado) {
        this.nome = nome;
        this.codConvidado = codConvidado;
    }

    public String getNome() {
        return nome;
    }

    public String getCodConvidado() {
        return codConvidado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return Objects.equals(getCodConvidado(), convidado.getCodConvidado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodConvidado());
    }

    @Override
    public String toString() {
        return "{" +
                "nome: '" + nome + '\'' +
                ", codConvidado: '" + codConvidado + '\'' +
                '}';
    }
}

class ConjuntoConvidado {
    private Set<Convidado> convidado;

    public ConjuntoConvidado() {
        this.convidado = new HashSet<>();
    }

    public void adicionarConvidado(String name, String codConvite) {
        this.convidado.add(new Convidado(name, codConvite));
    }

    public void removeConvidadoByCod(String codConvite) {
        convidado.removeIf(
                conv -> conv.getCodConvidado().equalsIgnoreCase(codConvite)
        );
    }

    public int contarConvidados() {
        return this.convidado.size();
    }

    public void exibirConvidados() {
       for(Convidado item: convidado) {
           System.out.println(item);
       }
    }
}
