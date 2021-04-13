package br.ufpb.dcx.aps.atividades.atv04;

public class Curso {
    private String nome;

    public Curso(String nome){
        this.nome = nome;
    }
    public Curso(){
        this.nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void matricular(Aluno aluno){
        
    }
}
