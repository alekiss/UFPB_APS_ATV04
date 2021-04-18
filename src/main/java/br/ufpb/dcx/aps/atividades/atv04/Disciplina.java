package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Disciplina {
    private Curso curso;
    private String codigo;
    private String nome;
    private List<Turma> turmas = new LinkedList<>();

    public Disciplina(Curso curso, String codigo, String nome){
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;

    }

    public Curso getCurso() {

        return curso;
    }

    public String getCodigo() {

        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
    private int CodTurma(){
        int a = 1;
        for( Turma b: turmas){
            a = b.getCodigo();
            a ++;
        }
        return a;
    }
    public Turma criarTurma(){
        Turma c = new Turma(CodTurma(), this);
        turmas.add(c);
        return c;
    }
    public Turma getTurma(int numero){
        for (Turma d : turmas){
            if (numero == d.getCodigo() ){
                return d;
            }
        }
        if (numero <= 0){
            throw new IllegalArgumentException("código inválido:"+numero);
        }
        else {
            throw new RuntimeException("Não existe turma com código:"+numero);
        }
    }
    public Collection<Turma> getTurmas(){
        return turmas;
    }
}
