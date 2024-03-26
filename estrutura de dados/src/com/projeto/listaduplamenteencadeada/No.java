package com.projeto.listaduplamenteencadeada;

public class No<T> {
    private T conteudo;
    private No<T> noProximo;
    private No<T> noPrevio;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setNoPrevio(No<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public No<T> getNoPrevio() {
        return noPrevio;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
