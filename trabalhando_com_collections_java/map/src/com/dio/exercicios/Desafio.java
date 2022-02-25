package com.dio.exercicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import static javax.swing.UIManager.put;

public class Desafio {

    public static void main(String[] args) {
        Random random = new Random();
        Integer a = 0;
        Map<String, Integer> rolagens = new LinkedHashMap<>();
        for(int i = 0; i < 100; i++) {
            rolagens.put(Integer.toString(i), random.nextInt(6) + 1);
        }

        int soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0, soma5 = 0, soma6 = 0;

        for(Map.Entry<String,Integer> entry: rolagens.entrySet()){
            if (entry.getValue().equals(1)){
                soma1++;
            }if (entry.getValue().equals(2)){
                soma2++;
            }if (entry.getValue().equals(3)){
                soma3++;
            }if (entry.getValue().equals(4)){
                soma4++;
            }if (entry.getValue().equals(5)){
                soma5++;
            }if (entry.getValue().equals(6)){
                soma6++;
            }
        }

        System.out.println("N 1 = " + soma1 + " aparições");
        System.out.println("N 2 = " + soma2 + " aparições");
        System.out.println("N 3 = " + soma3 + " aparições");
        System.out.println("N 4 = " + soma4 + " aparições");
        System.out.println("N 5 = " + soma5 + " aparições");
        System.out.println("N 6 = " + soma6 + " aparições");

        System.out.println(rolagens);
    }
}
