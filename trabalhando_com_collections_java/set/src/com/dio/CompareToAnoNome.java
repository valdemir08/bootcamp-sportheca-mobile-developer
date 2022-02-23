package com.dio;

import java.util.Comparator;

public class CompareToAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int compareAno = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (compareAno != 0)
            return compareAno;
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
