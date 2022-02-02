package com.projeto.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    /*evitar casting excessivo
    evitar códigos redundantes
    encontrar erross em tempo de compilação*/

    private ArrayList<Aluno> alunos;
    private ArrayList<String> strings;

    public Generics(){
        alunos = new ArrayList<Aluno>();
        strings = new ArrayList<String>();
        inserirObjetos();
    }

    public void inserirObjetos(){
        alunos.add(new Aluno("Aluno1", "111.111.111-11", "Direito"));
        strings.add("string1");
    }

    /*WILDCARDS
    * Unknow Wildcards (Unbounded)
    */
    public void imprimeLista(ArrayList<?> lista){
        for (Object obj:lista){
            System.out.println(obj);
        }
    }

    /*
     * Bounded Wildcard (Upper Bounded)
     * Nesse caso, serve para todos que são do tipo Pessoa e/ou herdeiros
     */

    public void imprimeListaExtends(ArrayList<? extends Pessoa> lista){
        for (Pessoa p:lista){
            System.out.println(p);
        }
    }

    /*
     * Bounded Wildcard (Lower Bounded)
     * Nesse caso, serve para Pessoa e suas classes pais
     */

    public void imprimeListaSuper(ArrayList<? super Pessoa> lista){
        for (Object pessoa:lista){
            System.out.println(pessoa);
        }
    }


    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }
}
