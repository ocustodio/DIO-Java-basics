package com.projeto.morecollections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Palavras {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.addPalavra("a");
        palavrasUnicas.addPalavra("b");
        palavrasUnicas.addPalavra("c");
        palavrasUnicas.addPalavra("d");

        System.out.println(palavrasUnicas.verifyPalavra("a"));
        System.out.println(palavrasUnicas.verifyPalavra("f"));

        palavrasUnicas.exibirPalavra();
        palavrasUnicas.removePalavra("c");
        palavrasUnicas.exibirPalavra();
    }
}

class PalavrasUnicas {
    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PalavrasUnicas that)) return false;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }

    @Override
    public String toString() {
        return "{" +
                "palavra: '" + palavra + '\'' +
                '}';
    }
}

class ConjuntoPalavrasUnicas {
    private Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void addPalavra(String palavraUnica) {
        this.palavrasUnicasSet.add(new PalavrasUnicas(palavraUnica));
    }

    public void removePalavra(String palavraUnica) {
        this.palavrasUnicasSet.removeIf(
                palavra -> palavra.getPalavra().equalsIgnoreCase(palavraUnica)
        );
    }

    public boolean verifyPalavra(String palavraUnica) {
        boolean containsPalavra = false;

        for (PalavrasUnicas palavra: palavrasUnicasSet) {
            if(palavra.getPalavra().equalsIgnoreCase(palavraUnica)) {
                containsPalavra = true;
                break;
            }
        }

        return containsPalavra;
    }

    public void exibirPalavra() {
        this.palavrasUnicasSet.forEach(System.out::println);
    }
}