package com.dio.aulas;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");

        //carrosPopulares.put("gol", 16.1);//como a chave já existe, o valor será sopbrescrito
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está adicionado: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos");

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry:entries){
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente : " + modeloMaisEficiente + " Consumo " + consumoMaisEficiente);
            }
        }

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a média dos consumos: ");


        Double soma = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Exiba a média dos consumos deste dicionário de carros " + soma/carrosPopulares.size());

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()){
            if(iterator2.next().equals(15.6))
                iterator2.remove();

        }

        System.out.println(carrosPopulares);

        System.out.println("Exiba na ordem em que foram inseridos");


        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);


        System.out.println("Dicionário ordenado pelo modelo");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
}
