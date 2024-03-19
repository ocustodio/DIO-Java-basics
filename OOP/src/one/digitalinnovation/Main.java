package one.digitalinnovation;

import one.digitalinnovation.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java", "Curso Java");
        cursoJava.setCargaHoraria(76);

        Mentoria mentoria = new Mentoria("OOP", "Aprendendo OOP");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", LocalDate.now(), LocalDate.now().plusDays(365));
        ArrayList<Conteudo> conteudos = new ArrayList<>();
        conteudos.add(cursoJava);
        conteudos.add(mentoria);
        bootcamp.setConteudo(conteudos);

        Dev victor = new Dev("Victor");
        victor.inscrever(cursoJava);
        victor.inscrever(bootcamp);
        System.out.println(victor.getConteudosInscritos());
    }
}
