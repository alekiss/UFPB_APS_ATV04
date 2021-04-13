package br.ufpb.dcx.aps.atividades.atv04;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private Disciplina disciplina; //precisa declarar aqui?
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(int codigo, Disciplina disciplina){
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

}
