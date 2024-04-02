package com.projeto.arvores.arvorebinaria;

import com.projeto.arvores.arvorebinaria.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> novaArvore = new ArvoreBinaria<Obj>();

        novaArvore.inserir(new Obj(13));
        novaArvore.inserir(new Obj(10));
        novaArvore.inserir(new Obj(2));
        novaArvore.inserir(new Obj(12));
        novaArvore.inserir(new Obj(25));
        novaArvore.inserir(new Obj(20));
        novaArvore.inserir(new Obj(31));
        novaArvore.inserir(new Obj(29));
        novaArvore.inserir(new Obj(32));

        novaArvore.exibirEmOrdem();
        novaArvore.exibirPosOrdem();
        novaArvore.exibirPreOrdem();
    }
}
