package com.projeto.arvores.arvorebinaria;

public class No<T extends  Comparable<T>>{
    private T conteudo;
    private No<T> noEsq;
    private No<T> noDir;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public No<T> getNoDir() {
        return noDir;
    }

    public No<T> getNoEsq() {
        return noEsq;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setNoDir(No<T> noDir) {
        this.noDir = noDir;
    }

    public void setNoEsq(No<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
