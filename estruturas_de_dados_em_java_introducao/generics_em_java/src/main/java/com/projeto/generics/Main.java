package com.projeto.generics;

public class Main {
    public static void main(String[] args) {
        Generics gen = new Generics();
        gen.imprimeLista(gen.getStrings());
        gen.imprimeListaExtends(gen.getAlunos());

//        gen.imprimeListaSuper(gen.getAlunos());Funciona apenas para classes que Pessoa generaliza
    }
}
