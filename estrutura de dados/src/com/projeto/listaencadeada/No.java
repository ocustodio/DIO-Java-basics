package com.projeto.listaencadeada;

public class No<T> {
    private T conteudo;
    private No<T> proximoNo;

    public No () {
        this.proximoNo = null;
    }

    public No (T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public No(T conteudo, No<T> proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado() {
        String str = "No{" +
                "conteudo=" + conteudo +
                '}';

        if (proximoNo != null) {
            str += " -> " + proximoNo.toString();
        } else {
            str += " -> null";
        }

        return str;
    }
}
