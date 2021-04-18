package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Curso {
    private String nome;
    private Map<String, Disciplina> disciplinaMap = new HashMap<String, Disciplina>();
    private Map<String, Aluno> alunosMatriculados = new HashMap<String, Aluno>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso() {
        this.nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina criarDisciplina(String codigo, String nome){
        Disciplina e = new Disciplina(this, codigo, nome);
        disciplinaMap.put(codigo, e);
        return e;
    }
    public Disciplina getDisciplina(String codigo){
        if (disciplinaMap.containsKey(codigo)){
            return disciplinaMap.get(codigo);
        }
        else {
            throw new RuntimeException("Não existe disciplina com código:"+codigo);
        }
    }
    public void matricular(Aluno aluno){
        if (aluno == null){
            throw new IllegalArgumentException("aluno inválido:null");
        }
        if(alunosMatriculados.containsKey(aluno.getMatricula())){
            throw new RuntimeException("aluno já matriculado:"+aluno.getMatricula());
        }
        Aluno f = new Aluno(aluno.getMatricula(), aluno.getNome());
        alunosMatriculados.put(aluno.getMatricula(), f);
    }
    public Collection<Aluno> getAlunosMatriculados(){
        return alunosMatriculados.values();
    }
    public Aluno getAlunoMatriculado(String matricula){
        if (alunosMatriculados.containsKey(matricula)){
            return alunosMatriculados.get(matricula);
        }
        else {
            throw new RuntimeException("Aluno não está matriculado no curso:"+getNome());
        }
    }
    public boolean alunoMatriculado(String matricula){
        if (alunosMatriculados.containsKey(matricula)){
            return true;
        }
        return false;
    }
}
