package com.projeto.morecollections.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaTarefa novaLista = new ListaTarefa();

        novaLista.addTarefa("Tarefa 1");
        novaLista.addTarefa("Tarefa 2");
        novaLista.addTarefa("Tarefa 3");
        novaLista.addTarefa("Tarefa 4");
        novaLista.addTarefa("Tarefa 1");

        System.out.println(novaLista.getSize());

        System.out.println(novaLista.getTarefaList());

        novaLista.removeTarefa("tarefa 1");

        System.out.println(novaLista.getSize());

        System.out.println(novaLista.getTarefaList());
    }
}

class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> removingTarefas = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                removingTarefas.add(t);
            }
        }

        tarefaList.removeAll(removingTarefas);
    }

    public int getSize() {
        return this.tarefaList.size();
    }

    public void returnDesc() {
        System.out.println(this.tarefaList);
    }

    public List<Tarefa> getTarefaList() {
        return new ArrayList<>(this.tarefaList);
    }
}