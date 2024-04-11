package com.projeto.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercises2 {
    public static void main(String[] args) {
        int count = 0;

        List<Boolean> respostas = new ArrayList<>();

        respostas.add(true);
        respostas.add(false);
        respostas.add(false);
        respostas.add(false);
        respostas.add(false);

        for(int i = 0; i < respostas.size(); i++) {
            if(respostas.get(i)) count++;
        }

        if(count == 2) System.out.println("Suspeito");
        if(count >= 3 && count <= 4) System.out.println("Cumplicie");
        if(count == 5) System.out.println("Assassina");
        if(count < 2) System.out.println("Inocente");
    }
}