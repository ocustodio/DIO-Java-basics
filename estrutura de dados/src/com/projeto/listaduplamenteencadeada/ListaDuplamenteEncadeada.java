package com.projeto.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public void add(T elemento) {
        No<T> novoNo = new No<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }

        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        No<T> noAuxiliar = this.getNo(index);
        No<T> novoNo = new No<>(elemento);

        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo == null) {
                primeiroNo.setNoProximo(null);
            }
        } else {
            No<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }
        }

        tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        No<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo= " + noAuxiliar.getConteudo() + "}] --> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += " null";

        return strRetorno;
    }
}