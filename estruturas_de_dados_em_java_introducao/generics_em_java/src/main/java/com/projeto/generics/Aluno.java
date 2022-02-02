package com.projeto.generics;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, String cpf, String curso) {
        super(nome, cpf);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                "} " + super.toString();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
