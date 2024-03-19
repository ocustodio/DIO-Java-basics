package one.digitalinnovation.dominio;

import java.util.ArrayList;

public class Dev {
    private String primeiroNome;
    private ArrayList<Conteudo> conteudosInscritos = new ArrayList<>();
    private ArrayList<Conteudo> conteudosConcluidos = new ArrayList<>();

    public Dev(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void inscrever(Conteudo conteudo) {
        if(conteudosInscritos.contains(conteudo)) {
            System.err.println("Voce ja esta inscrito no curso");
        } else {
            conteudosInscritos.add(conteudo);
        }
    }

    public void inscrever(Bootcamp bootcamp) {
    }

    public void setConteudosConcluidos(ArrayList<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void setConteudosInscritos(ArrayList<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public ArrayList<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public ArrayList<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
}
