package com.projeto.collections.set;

import java.util.*;

public class OrderingSetExamples {
    public static void main(String[] args) {
        Set<Serie> series = new HashSet<>(); // Linked hash list is in order

        series.add(new Serie("game of thrones", "fantasia", 60));
        series.add(new Serie("dark", "drama", 60));
        series.add(new Serie("that 70's show", "comedia", 25));

        System.out.println(series);

        Set<Serie> treeSeries = new TreeSet<>(series);

        System.out.println(treeSeries);

        Set<Serie> treeSeries2 = new TreeSet<>(new CompareGenreTimeEp());

        treeSeries2.addAll(series);

        System.out.println(treeSeries2);

    }
}

class Serie implements Comparable<Serie>{
    private String name;
    private String genre;
    private Integer timeEpisode;

    public Serie(String name, String genre, Integer timeEpisode) {
        this.name = name;
        this.genre = genre;
        this.timeEpisode = timeEpisode;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getTimeEpisode() {
        return timeEpisode;
    }

    @Override
    public String toString() {
        return "{" +
                "name= '" + name + '\'' +
                ", genre= '" + genre + '\'' +
                ", timeEpisode= " + timeEpisode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(name, serie.name) && Objects.equals(genre, serie.genre) && Objects.equals(timeEpisode, serie.timeEpisode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, timeEpisode);
    }

    @Override
    public int compareTo(Serie serie) {
        int timeEp = Integer.compare(this.getTimeEpisode(), serie.getTimeEpisode());
        if (timeEp != 0) return timeEp;

        return this.getGenre().compareTo(serie.getGenre());
    }
}

class CompareGenreTimeEp implements Comparator<Serie> {

    @Override
    public int compare(Serie serie, Serie t1) {
        int name = serie.getName().compareTo(t1.getName());
        if (name != 0) return name;

        int genre = serie.getGenre().compareTo(t1.getGenre());
        if (genre != 0) return genre;

        return Integer.compare(serie.getTimeEpisode(), t1.getTimeEpisode());

    }
}