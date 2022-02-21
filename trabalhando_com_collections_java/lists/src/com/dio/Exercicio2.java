package com.dio;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {

        List<Integer> respostas = new ArrayList<>();
        List<String> perguntas = new ArrayList<>(Arrays.asList("Telefonou para a Vítma?",
                "Esteve no local do crime?","Mora perto da vítima","Devia para a vítima?","Já trabalhou com a vítima?"));

        Integer soma = 0;
        for (int i =0; i<5; i++) {
            respostas.add(JOptionPane.showConfirmDialog(null, perguntas.get(i), "Questionário", JOptionPane.YES_NO_OPTION));
            if (respostas.get(i) == 0)
                soma += 1;
        }
        if (soma == 2)
            System.out.println("Suspeita");
        else if (soma >= 3 && soma <= 4)
            System.out.println("Cúmplice");
        else if (soma == 5)
            System.out.println("Assassina");
        else
            System.out.println("Inocente");
    }
}
