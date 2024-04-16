package com.projeto.collections.map;

import com.sun.source.tree.Tree;

import java.util.*;

public class MapOrdering {
    public static void main(String[] args) {
        Map<String, Livro> livrosRandom = new HashMap<>();
        livrosRandom.put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 238));
        livrosRandom.put("Harari, Yuval", new Livro("21 Licoes Para o Seculo 21", 432));
        livrosRandom.put("Duhigg, Charles", new Livro("O Poder Do Habito", 408));

        for(Map.Entry<String, Livro> entry : livrosRandom.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNomeLivro());
        }

        Map<String, Livro> livrosLinked = new LinkedHashMap<>(livrosRandom);
        for(Map.Entry<String, Livro> entry : livrosLinked.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNomeLivro());
        }

        Map<String, Livro> livrosOrdered = new TreeMap<>(livrosRandom);
        for(Map.Entry<String, Livro> entry : livrosOrdered.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNomeLivro());
        }

        Set<Map.Entry<String, Livro>> newLivros = new TreeSet<>(new CompareNomeLivre());
        newLivros.addAll(livrosRandom.entrySet());
        for(Map.Entry<String, Livro> entry : newLivros) {
            System.out.println(entry.getValue().getNomeLivro());
        }

        Set<Map.Entry<String, Livro>> pagsLivros = new TreeSet<>(new ComparePaginas());
        pagsLivros.addAll(livrosRandom.entrySet());
        for(Map.Entry<String, Livro> entry : pagsLivros) {
            System.out.println(entry.getValue().getPaginas());
        }
    }
}

class Livro {

    private String nomeLivro;
    private Integer paginas;

    public Livro(String nomeLivro, Integer paginas) {

        this.nomeLivro = nomeLivro;
        this.paginas = paginas;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return  Objects.equals(nomeLivro, livro.nomeLivro)
                && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeLivro, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class CompareNomeLivre implements Comparator<Map.Entry<String, Livro>> {
    public int compare(Map.Entry<String, Livro> firstLivro, Map.Entry<String, Livro> secondLivro) {
        return firstLivro.getValue().getNomeLivro().compareTo(secondLivro.getValue().getNomeLivro());
    }
}

class ComparePaginas implements Comparator<Map.Entry<String, Livro>> {
    public int compare(Map.Entry<String, Livro> firstLivro, Map.Entry<String, Livro> secondLivro) {
        return firstLivro.getValue().getPaginas().compareTo(secondLivro.getValue().getPaginas());
    }
}