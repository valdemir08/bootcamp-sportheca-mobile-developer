package com.dio;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        Set<Serie> series = new HashSet<>(){{
            add(new Serie("Got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that ´70s show", "comédia", 25));
        }};

        for(Serie serie:series){
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n");

        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("Got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that ´70s show", "comédia", 25));
        }};

        for(Serie serie:series2){
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n");

        Set<Serie> series3 = new TreeSet<>(series);

        for(Serie serie:series3){
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n");


        Set<Serie> series4 = new TreeSet<>(new CompareToNomeGeneroEpisodio());

        series4.addAll(series);

        for(Serie serie:series4){
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n");


    }
}
