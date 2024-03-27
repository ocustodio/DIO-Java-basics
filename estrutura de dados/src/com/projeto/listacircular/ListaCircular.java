package com.projeto.listacircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> calda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.calda = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0;
    }
}
