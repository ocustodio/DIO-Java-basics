package com.projeto.collections.map;

import java.util.*;

public class firstMapExercise {
    public static void main(String[] args) {
        Map<Integer, Estado> estados = new HashMap<>();

        estados.put(1, new Estado("PE", 9616621));
        estados.put(2, new Estado("AL", 3351543));
        estados.put(3, new Estado("CE", 9187103));
        estados.put(4, new Estado("RN", 3534265));

        if(!estados.values().contains("PB")) {
            estados.put(5, new Estado("PB", 4039277));
        }
        System.out.println(estados);

        for(Estado estado: estados.values()) {
            if(estado.getSigla().equals("RN"))
                estado.setPop(3534165);
        }
        System.out.println(estados);

        for(Estado estado: estados.values()) {
            if(estado.getSigla().equals("PE"))
                System.out.println(estado.getPop());
        }

        for(Map.Entry<Integer, Estado> entry: estados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("--------------------------------------");

        Set<Map.Entry<Integer, Estado>> orderedEstados = new TreeSet<>(new OrdemAlfabetica());
        orderedEstados.addAll(estados.entrySet());
        for(Map.Entry<Integer, Estado> entry: orderedEstados) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("--------------------------------------");

        Set<Map.Entry<Integer, Estado>> numEstados = new TreeSet<>(new OrdemPop());
        numEstados.addAll(orderedEstados);

        Map.Entry<Integer, Estado> min = null;
        for(Map.Entry<Integer, Estado> entry: numEstados) {
            min = entry;
            break;
        }
        System.out.println(min);


        Map.Entry<Integer, Estado> max = null;
        for(Map.Entry<Integer, Estado> entry: numEstados) {
            max = entry;
        }
        System.out.println(max);

        Integer sum = 0;
        for(Map.Entry<Integer, Estado> entry: numEstados) {
            sum += entry.getValue().getPop();
        }

        System.out.println(sum);

        System.out.println(sum / numEstados.size());

        Iterator<Map.Entry<Integer, Estado>> iterator = numEstados.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Estado> next = iterator.next();

            if (next.getValue().getPop() < 4000000) {
                iterator.remove();
            }
        }

        System.out.println(numEstados);
    }
}

class Estado {
    private String sigla;
    private Integer pop;

    public Estado(String sigla, Integer pop) {
        this.sigla = sigla;
        this.pop = pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public String getSigla() {
        return sigla;
    }

    public Integer getPop() {
        return pop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(sigla, estado.sigla) && Objects.equals(pop, estado.pop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla, pop);
    }

    public String toString() {
        return sigla + " - " + pop;
    }
}

class OrdemAlfabetica implements Comparator<Map.Entry<Integer, Estado>> {
    public int compare(Map.Entry<Integer, Estado> first, Map.Entry<Integer, Estado> second) {
        return first.getValue().getSigla().compareTo(second.getValue().getSigla());
    }
}

class OrdemPop implements Comparator<Map.Entry<Integer, Estado>> {
    public int compare(Map.Entry<Integer, Estado> first, Map.Entry<Integer, Estado> second) {
        return first.getValue().getPop().compareTo(second.getValue().getPop());
    }
}