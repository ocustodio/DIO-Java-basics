package com.projeto.fila;

public class No<T> {
    private T object;
    private No<T> refNo;

    public No() {};

    public No(T object){
        this.object = object;
        this.refNo = null;
    }

    public T getObject(){
        return object;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    public No<T> getRefNo() {
        return refNo;
    };

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
