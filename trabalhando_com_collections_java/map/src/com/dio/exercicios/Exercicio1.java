package com.dio.exercicios;

import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {
        Map<String, Integer> populacaoEstimada = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        populacaoEstimada.put("RN", 3534165);

        if(!populacaoEstimada.containsKey("PB"))
            populacaoEstimada.put("PB", 4039277);

        System.out.println(populacaoEstimada.get("PE"));

        Map<String, Integer> populacaoEstimadaOrdemInformada = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(populacaoEstimadaOrdemInformada);

        Map<String, Integer> populacaoEstimadaOrdemAlfabetica = new TreeMap<>() {{
            Arrays.asList(populacaoEstimada);
        }};

        Integer min = Collections.min(populacaoEstimada.values());
        Integer max = Collections.max(populacaoEstimada.values());
        Integer soma = 0;

        for (Map.Entry<String, Integer> entry:populacaoEstimada.entrySet()){
            if (entry.getValue().equals(min))
                System.out.println("min: " + entry);
            if (entry.getValue().equals(max))
                System.out.println("max: " + entry);

            soma += entry.getValue();
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma/populacaoEstimada.size());

        populacaoEstimada.entrySet().removeIf(entry -> entry.getValue() < 4000000);

        System.out.println(populacaoEstimada);

        populacaoEstimada.clear();

        System.out.println("isVazio? " + populacaoEstimada.isEmpty());

    }
}
