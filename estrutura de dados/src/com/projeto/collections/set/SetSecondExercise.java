package com.projeto.collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSecondExercise {
    public static void main(String[] args) {
        Set<FavoriteLanguage> favoriteLanguages = new HashSet<>();

        favoriteLanguages.add(new FavoriteLanguage(
                "Rust", "2010", "RustRover"
        ));
        favoriteLanguages.add(new FavoriteLanguage(
                "Java", "1995", "IDEA"
        ));
        favoriteLanguages.add(new FavoriteLanguage(
                "Go", "2009", "GoLand"
        ));
        System.out.println(favoriteLanguages);

        TreeSet<FavoriteLanguage> newFavoriteLanguages = new TreeSet<>(favoriteLanguages);
        System.out.println(newFavoriteLanguages);

        TreeSet<FavoriteLanguage> compareToIde = new TreeSet<>(new CompareIde());
        compareToIde.addAll(newFavoriteLanguages);
        System.out.println(compareToIde);

        TreeSet<FavoriteLanguage> compareToDateAndName = new TreeSet<>(new CompareDateName());
        compareToDateAndName.addAll(newFavoriteLanguages);
        System.out.println(compareToDateAndName);

        TreeSet<FavoriteLanguage> compareToNameAndDateAndIde = new TreeSet<>(new CompareNameDateIde());
        compareToNameAndDateAndIde.addAll(newFavoriteLanguages);
        System.out.println(compareToNameAndDateAndIde);

    }
}

class FavoriteLanguage implements Comparable<FavoriteLanguage>{
    private String name;
    private String createdAt;
    private String ide;

    public FavoriteLanguage(String name, String createdAt, String ide) {
        this.name = name;
        this.createdAt = createdAt;
        this. ide = ide;
    }

    public String getName() {
        return name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return name + " - " + createdAt + " - " + ide;
    }

    @Override
    public int compareTo(FavoriteLanguage favoriteLanguage) {
        return this.getName().compareTo(favoriteLanguage.getName());
    }
}

class CompareIde implements Comparator<FavoriteLanguage> {

    @Override
    public int compare(FavoriteLanguage firstLang, FavoriteLanguage secondLang) {
        return firstLang.getIde().compareTo(secondLang.getIde());
    }
}

class CompareDateName implements Comparator<FavoriteLanguage> {

    @Override
    public int compare(FavoriteLanguage firstLang, FavoriteLanguage secondLang) {
        int createdAt = firstLang.getCreatedAt().compareTo(secondLang.getCreatedAt());
        if (createdAt != 0) return createdAt;

        return firstLang.getName().compareTo(secondLang.getName());
    }
}

class CompareNameDateIde implements Comparator<FavoriteLanguage> {

    @Override
    public int compare(FavoriteLanguage firstLang, FavoriteLanguage secondLang) {
        int name = firstLang.getName().compareTo(secondLang.getName());
        if (name != 0) return name;

        int createdAt = firstLang.getCreatedAt().compareTo(secondLang.getCreatedAt());
        if (createdAt != 0) return createdAt;

        return firstLang.getIde().compareTo(secondLang.getIde());
    }
}