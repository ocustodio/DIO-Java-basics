package com.projeto.morecollections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AgendaExercise {
    public static void main(String[] args) {
        AgendaContatos novaAgenda = new AgendaContatos();

        novaAgenda.addContato("Vito", "123");
        novaAgenda.addContato("Mille", "456");
        novaAgenda.addContato("Vito", "132");
        novaAgenda.addContato("Cami", "321");

        novaAgenda.exibirContatos();
        System.out.println(novaAgenda.pesquisarPorNome("Vito"));

        novaAgenda.atualizaNumeroContato("cami", "444");
        novaAgenda.exibirContatos();
    }
}

class Contato {
    private String nome;
    private String numeroTelefone;

    public Contato(String nome, String numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    protected void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNumeroTelefone(), contato.getNumeroTelefone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeroTelefone());
    }

    @Override
    public String toString() {
        return "{" +
                "nome: '" + nome + '\'' +
                ", numeroTelefone: '" + numeroTelefone + '\'' +
                '}';
    }
}

class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, String numeroTelefone) {
        this.contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        this.contatoSet.forEach(System.out::println);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> returnContato = new HashSet<>();
        for(Contato contato: contatoSet) {
            if(contato.getNome().startsWith(nome)) {
                returnContato.add(contato);
            }
        }

        return returnContato;
    }

    public Contato atualizaNumeroContato(String nome, String novoNumero) {
        Contato contatoAtt = null;
        for (Contato contato: contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumeroTelefone(novoNumero);
                contatoAtt = contato;
            }
        }

        return contatoAtt;
    }
}
