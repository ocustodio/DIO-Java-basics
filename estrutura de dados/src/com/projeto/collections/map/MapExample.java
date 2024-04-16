package com.projeto.collections.map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carros);

        carros.put("gol", 15.2);
        System.out.println(carros.get("gol"));

        System.out.println(carros.containsKey("tucson"));
        System.out.println(carros.containsKey("uno"));

        System.out.println(carros.get("uno"));

        System.out.println(carros.keySet());
        System.out.println(carros.values());

        Double bestConsumer = Collections.max(carros.values());
        System.out.println(bestConsumer);

        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String carHandle = "";

        for(Map.Entry<String, Double> entry : entries) {
           if(entry.getValue().equals(bestConsumer))
               carHandle = entry.getKey();
        }
        System.out.println(carHandle + " " + carros.get(carHandle));

        Double worstConsumer = Collections.min(carros.values());
        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(worstConsumer))
                carHandle = entry.getKey();
        }
        System.out.println(carHandle + " " + carros.get(carHandle));

        Iterator<Double> iterator = carros.values().iterator();

        Double sum = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);

        System.out.println(sum / carros.size());

        Iterator<Double> iterator2 = carros.values().iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();

            if(next == 15.6)
                iterator2.remove();
        }
        System.out.println(carros);

        Map<String, Double> novosCarros = new TreeMap<>(carros);
        System.out.println(novosCarros.keySet());
    }
}