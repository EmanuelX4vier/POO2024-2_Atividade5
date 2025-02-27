package Atividade5.Exceptions;

public class AlunoInexistenteException extends Exception {
    public AlunoInexistenteException (String msg){
        super(msg);
    }

    public AlunoInexistenteException(){
        super();
    }
}
