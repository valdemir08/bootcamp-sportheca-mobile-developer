package com.dio;

import java.util.Comparator;

public class CompareToOrdemAlfabetica implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        return string1.compareToIgnoreCase(string2);
    }
}
