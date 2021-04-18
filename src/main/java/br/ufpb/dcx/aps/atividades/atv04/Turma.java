package br.ufpb.dcx.aps.atividades.atv04;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;

    public Turma(int codigo, Disciplina disciplina){
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void addAluno(Aluno aluno){
        disciplina.getCurso().getAlunoMatriculado(aluno.getMatricula());
        alunos.add(aluno);
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }
}
