package com.dio;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println(notas.contains(5d));

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();

        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println(soma/notas.size());
        System.out.println(notas.remove(0d));

        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        //ou

        notas.removeIf(next -> next < 7);


        System.out.println(notas);

        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);

        notas.clear();

        System.out.println(notas.isEmpty());

    }
}
