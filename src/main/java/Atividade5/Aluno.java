package Atividade5;

import java.io.Serializable;

public class Aluno implements Serializable {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
