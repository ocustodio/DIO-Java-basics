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
            System.out.print(atual.getConteudo() + ", ");
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
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo em pre ordem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(No<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
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

            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }

                    filho.setNoDir(raiz.getNoDir());
                    this.raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoEsq(atual.getNoDir());
                }
            } else {
                for (
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }

                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Conteudo nao encontrado. bloco catch");
        }
    }
}
