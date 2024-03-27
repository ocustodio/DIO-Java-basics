package com.projeto.listacircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(cauda);
        } else {
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O indice e maior que o tamanho da lista.");
        }

        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(cauda);
        } else if (index == 1) {
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        } else {
            for(int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }

            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }

        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista esta vazia.");

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0;
    }

    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{ conteudo = " + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno += !this.isEmpty() ? "(Retorna ao inicio)" : "[No{}]";

        return strRetorno;
    }
}
