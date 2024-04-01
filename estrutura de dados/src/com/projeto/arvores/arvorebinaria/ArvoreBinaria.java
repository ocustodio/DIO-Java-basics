package com.projeto.arvores.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    private No<T> inserir(No<T> atual, No<T> novoNo) {
        if(atual == null) {
            return novoNo;
        }

        if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }
}
