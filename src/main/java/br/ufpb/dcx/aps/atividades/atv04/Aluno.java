package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Objects;

public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        
    }

    public String getMatricula() {

        return matricula;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula.equals(aluno.matricula);
    }
}
