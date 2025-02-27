package Atividade5;
import Atividade5.Exceptions.AlunoInexistenteException;
import Atividade5.Exceptions.AlunoJaCadastradoException;

import java.io.IOException;
public interface CadastroDeAlunos {

      void cadastraAluno(String nome, String matricula) throws AlunoJaCadastradoException;
      Aluno pesquisaAluno(String matricula) throws AlunoInexistenteException;
      void removeAluno(String nome) throws AlunoInexistenteException;
      void salvarDados() throws IOException;
      void recuperarDados() throws IOException;
}
