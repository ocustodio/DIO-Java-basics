package com.projeto.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("nome", "Victor");
        aluno.put("idade", "25");
        aluno.put("turma", "1100");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> alunos = new ArrayList<>();

        alunos.add(aluno);

        System.out.println(alunos);
    }
}
