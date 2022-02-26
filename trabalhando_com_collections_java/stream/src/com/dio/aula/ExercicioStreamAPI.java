package com.dio.aula;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioStreamAPI {

    public static void main(String[] args) {
        List<String> numeroAleatorios = Arrays.asList("1", "0","4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todas os elementos dessa lista de String: ");

//        numeroAleatorios.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        });

//        numeroAleatorios.forEach(s -> System.out.println(s));
        numeroAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set");


//        numeroAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        Set<String> collectSet = numeroAleatorios.stream().limit(5).collect(Collectors.toSet());

        System.out.println("lista de string para liksta inteiros");

//        List<Integer> collectList = numeroAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
//
        System.out.println("pegue os números pares e maiores que 2 e coloque em uma lista");

        List<Integer> listPares = numeroAleatorios.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());

        System.out.println(listPares);


        System.out.println("mostre a média das notas");

        numeroAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out :: println);

        System.out.println("Remova os valores ímpares: ");

        List<Integer> numerosAleatoriosInteger = numeroAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(i -> i%2 != 0);



    }



}

