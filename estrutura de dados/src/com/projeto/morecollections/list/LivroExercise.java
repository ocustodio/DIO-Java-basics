package com.projeto.morecollections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivroExercise {
    public static void main(String[] args) {
        CatalogoDeLivros novoCatalogo = new CatalogoDeLivros();

        novoCatalogo.addLivro(new Livro("Teste", "Autor Teste", "1953"));
        novoCatalogo.addLivro(new Livro("Teste1", "Autor Teste", "1999"));
        novoCatalogo.addLivro(new Livro("Teste2", "Autor Teste1", "1989"));
        novoCatalogo.addLivro(new Livro("Teste3", "Autor Teste2", "2024"));

        System.out.println(novoCatalogo.pesquisaPorAuto("autor teste"));
        System.out.println(novoCatalogo.pesquisaIntervaloAno(1988, 2000));
        System.out.println(novoCatalogo.pesquisaPorTitulo("teste5"));
    }
}

class Livro {
    private String titulo;
    private String autor;
    private String anoDePublicacao;

    public Livro(String titulo, String autor, String anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo: '" + titulo + '\'' +
                ", autor: '" + autor + '\'' +
                ", anoDePublicacao: '" + anoDePublicacao + '\'' +
                '}';
    }
}

class CatalogoDeLivros {
    private List<Livro> catalogoLivro;

    public CatalogoDeLivros() {
        this.catalogoLivro = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        this.catalogoLivro.add(livro);
    }

    public List<Livro> pesquisaPorAuto(String autor) {
        List<Livro> returnList = new ArrayList<>();

        if(!this.catalogoLivro.isEmpty()) {
            List<Livro> findAutor = new ArrayList<>(catalogoLivro); // immutability

            for(Livro livro: findAutor) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    returnList.add(livro);
                }
            }
        }

        return returnList;
    }

    public List<Livro> pesquisaIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> returnList = new ArrayList<>();

        if (!this.catalogoLivro.isEmpty()) {
//            List<Livro> findByYearInterval = new ArrayList<>(catalogoLivro); // immutability

            for (Livro livro : new ArrayList<>(catalogoLivro)) {
                int yearConditional = Integer.parseInt(livro.getAnoDePublicacao());

                if (yearConditional >= anoInicial && yearConditional <= anoFinal) {
                    returnList.add(livro);
                }
            }
        }

        return returnList;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro bookTitle = null;

        if(!this.catalogoLivro.isEmpty()) {
//            List<Livro> findByTitle = new ArrayList<>(catalogoLivro);

            for(Livro livro: new ArrayList<>(catalogoLivro)) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    bookTitle = livro;
                    break;
                }
            }
        }

        return bookTitle;
    }

    public List<Livro> getCatalogoLivro() {
        return new ArrayList<>(catalogoLivro);
    }
}
