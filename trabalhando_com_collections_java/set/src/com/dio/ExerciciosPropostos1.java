package com.dio;

import java.util.*;

public class ExerciciosPropostos1 {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto contendo as cores dop arco-íris e:\n");

        Set<String> cores1 = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        System.out.println("A. Exiba todas as cores uma abaixo da outra\n");
        for(String cor:cores1)
            System.out.println(cor);

        System.out.println("\nB. A quantidade de cores que o arco-íris tem\n");
        System.out.println(cores1.size());

        System.out.println("\nExiba as cores em ordem alfabética\n");

        Set<String> cores2 = new TreeSet<>(new CompareToOrdemAlfabetica());
        cores2.addAll(cores1);

        System.out.println(cores2);


        System.out.println("\nExiba as cores na ordem inversda que da foi informada\n");

        Set<String>cores3 = new LinkedHashSet<>();
        cores3.addAll(cores1);

        System.out.println(cores3 + "\n");

        List<String> coresList = new ArrayList<>(cores3);

        Collections.reverse(coresList);
        System.out.println(coresList);


        System.out.println("\nExiba as cores que comçam com letra V\n");
        for(String cor:cores1)
            if (cor.startsWith("V"))
                System.out.println(cor);


        System.out.println("\nRemova todas as cores que não começam com a letra V\n");
        cores1.removeIf(cor -> !cor.startsWith("V"));
        System.out.println(cores1);

        cores1.clear();

        System.out.println(cores1.isEmpty());
    }
}
