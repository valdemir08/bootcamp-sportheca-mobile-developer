package com.dio;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));
        Double somaTemperaturas = 0d;


        for(int i = 0; i<6; i++){
            Double temperatura = Double.parseDouble(new JOptionPane().showInputDialog("Temperatura de " + meses.get(i)));
            temperaturas.add(temperatura);
            somaTemperaturas += temperatura;
        }

        Double mediaSemestral = somaTemperaturas/6;

        System.out.println("Média semestral: " + mediaSemestral);

        for(Double temp:temperaturas) {
            if (temp > mediaSemestral) {
                System.out.println(temp + "° " + meses.get(temperaturas.indexOf(temp)));
            }
        }
    }
}
