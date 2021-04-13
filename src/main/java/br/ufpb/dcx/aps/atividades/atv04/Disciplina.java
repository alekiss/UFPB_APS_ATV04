package br.ufpb.dcx.aps.atividades.atv04;

public class Disciplina {
    private Curso curso;
    private String codigo;
    private String nome;

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
}
