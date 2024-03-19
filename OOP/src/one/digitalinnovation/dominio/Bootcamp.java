package one.digitalinnovation.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bootcamp {
    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private ArrayList<Dev> devs;
    private ArrayList<Conteudo> conteudo;

    public Bootcamp(String nome, LocalDate inicio, LocalDate fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }

    public void setDevs(ArrayList<Dev> devs) {
        this.devs = devs;
    }

    public void setConteudo(ArrayList<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public ArrayList<Dev> getDevs() {
        return devs;
    }

    public ArrayList<Conteudo> getConteudo() {
        return conteudo;
    }
}
