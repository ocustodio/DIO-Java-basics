package com.projeto.fila;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if(!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }

            return primeiroNo.getObject();
        }

        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }

            return primeiroNo.getObject();
        }

        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{Objeto = " + noAuxiliar.getObject() + "}] ---> ";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
