package com.projeto.arvores.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        this.raiz = inserir(this.raiz, novoNo);
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

    public void exibirEmOrdem() {
        System.out.println("\n Exibindo em ordem");
        exibirEmOrdem(this.raiz);
    }

    private void exibirEmOrdem(No<T> atual) {
        if (atual != null) {
            exibirEmOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirEmOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo em pos ordem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(No<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo em pre ordem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(No<T> atual) {
        if (atual != null) {
            System.out.println(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudo) {
        try {
            No<T> atual = this.raiz;
            No<T> pai = null;
            No<T> filho = null;
            No<T> temp = null;

            if (atual == null) {
                System.out.println("Conteudo nao encontrado. bloco try");
            }

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;

                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Conteudo nao encontrado. bloco catch");
        }
    }
}
