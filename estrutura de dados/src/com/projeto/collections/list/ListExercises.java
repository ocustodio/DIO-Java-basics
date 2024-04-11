package com.projeto.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercises {
    public static void main(String[] args) {
        List<mesTemp> mesTemps = new ArrayList<>();

        mesTemps.add(new mesTemp("Janeiro", 39.4));
        mesTemps.add(new mesTemp("Fevereiro", 37.8));
        mesTemps.add(new mesTemp("Marco", 35.2));
        mesTemps.add(new mesTemp("Abril", 36.9));
        mesTemps.add(new mesTemp("Maio", 34.1));
        mesTemps.add(new mesTemp("Junho", 29.5));

        System.out.println(mesTemps);

        Double sum = 0d;
        for(int i = 0; i < mesTemps.size(); i++) {
            sum += mesTemps.get(i).getTemp();
        }

        System.out.println(sum / mesTemps.size());

        for(int i = 0; i < mesTemps.size(); i++) {
            if (mesTemps.get(i).getTemp() > sum / mesTemps.size())
                System.out.println(mesTemps.get(i));
        }
    }
}

class mesTemp {
    private final String mes;
    private Double temp;

    public mesTemp(String mes, Double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public String getMes() {
        return mes;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "{" +
                "mes= '" + mes + '\'' +
                ", temp= " + temp +
                '}';
    }
}
