package Atividade5;

import Atividade5.Exceptions.AlunoInexistenteException;
import Atividade5.Exceptions.AlunoJaCadastradoException;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaCadastraAluno implements CadastroDeAlunos, Serializable {

    private Map<String, Aluno> alunos;
    private GravadorDeDados gravador;

    public SistemaCadastraAluno(){
        this.alunos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }


    @Override
    public boolean cadastraAluno(String nome, String matricula){
       if(this.alunos.containsKey(matricula)){
           return false;
       }else{
           Aluno aluno = new Aluno(nome, matricula);
           this.alunos.put(matricula, aluno);
           return true;
       }
    }

    @Override
    public Aluno pesquisaAluno(String matricula) throws AlunoInexistenteException {
        if(this.alunos.containsKey(matricula)){
            return this.alunos.get(matricula);
        }else{
            throw new AlunoInexistenteException("Aluno inexistente");
        }
    }

    @Override
    public void removeAluno(String matricula) throws AlunoInexistenteException {
        this.alunos.remove(matricula);
    }

    public List<Aluno> todosOsAlunos(){
        List<Aluno> todos = new ArrayList<>(this.alunos.values());
        return todos;
    }

    @Override
    public void salvarDados() throws IOException {
        gravador.gravaDados(this.alunos.values());
    }

    @Override
    public void recuperarDados() throws IOException {
        List<Aluno> alunosRecuperados = new ArrayList<>(gravador.recuperaDados());
        for(Aluno a: alunosRecuperados){
            Aluno aluno = new Aluno(a.getNome(), a.getMatricula());
            this.alunos.put(aluno.getMatricula(), aluno);
        }
    }
}
