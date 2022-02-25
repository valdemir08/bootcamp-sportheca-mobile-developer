package com.dio.aulas;

import java.util.*;

public class ExemploOrdenacao {

    public static void main(String[] args) {
        System.out.println("Ordem aleatória");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        }};

        for (Map.Entry<String, Livro> livro:meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("\n Ordem de inserção\n");

        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        }};

        for (Map.Entry<String, Livro> livro:meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("\n Ordem de alfabética autores\n");

        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);

        for (Map.Entry<String, Livro> livro:meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("Ordem alfabética dos livros");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());


        for (Map.Entry<String, Livro> livro:meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

    }
}
