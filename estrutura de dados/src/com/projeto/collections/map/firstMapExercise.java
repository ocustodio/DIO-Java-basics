package com.projeto.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class firstMapExercise {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        estados.put("RN", 3534165);
        System.out.println(estados);

        if(!estados.containsKey("PB"))
            estados.put("PB", 4039277);

        System.out.println(estados);

        System.out.println(estados.get("PE"));
    }
}

