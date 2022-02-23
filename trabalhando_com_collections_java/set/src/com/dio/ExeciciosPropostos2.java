package com.dio;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExeciciosPropostos2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>();
        linguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
        linguagensFavoritas.add(new LinguagemFavorita("Python", 1990, "Pycharm"));
        linguagensFavoritas.add(new LinguagemFavorita("PHP", 1994, "PHPStorm"));


        System.out.println("Ordem de inserção\n");
        System.out.println(linguagensFavoritas);

        System.out.println("Ordem natural\n");
        Set<LinguagemFavorita> ordemNatural = new TreeSet<>(new CompareToOrdemNatural());
        ordemNatural.addAll(linguagensFavoritas);

        System.out.println(ordemNatural);


        Set<LinguagemFavorita> ordemIde = new TreeSet<>(new CompareToIde());
        ordemIde.addAll(linguagensFavoritas);

        System.out.println(ordemIde);

        Set<LinguagemFavorita> ordemAnoNome = new TreeSet<>(new CompareToAnoNome());
        ordemAnoNome.addAll(linguagensFavoritas);

        System.out.println(ordemAnoNome);

        Set<LinguagemFavorita> ordemNomeAnoIde = new TreeSet<>(new CompareToNomeAnoIde());
        ordemNomeAnoIde.addAll(linguagensFavoritas);

        System.out.println(ordemNomeAnoIde);




    }


}
