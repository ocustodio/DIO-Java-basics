package com.projeto.fila;

public class No {
    private Object object;
    private No refNo;

    public No() {};

    public No(Object object){
        this.object = object;
        this.refNo = null;
    }

    public Object getObject(){
        return object;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public No getRefNo() {
        return refNo;
    };

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
