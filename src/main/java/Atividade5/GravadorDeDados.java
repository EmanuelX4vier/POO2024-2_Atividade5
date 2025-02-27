package Atividade5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadorDeDados implements Serializable {

    private String listaAlunos;

    public GravadorDeDados(){
        this.listaAlunos = "listaAlunos.dat";
    }

    public void gravaDados(Collection<Aluno> alunos) throws IOException {
        ArrayList<Aluno> alunosArrayList= new ArrayList<>();
        alunosArrayList.addAll(alunos);
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(listaAlunos))){
            out.writeObject(alunosArrayList);
        }
    }

    public Collection<Aluno> recuperaDados() throws IOException{
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.listaAlunos))) {
            Collection<Aluno> alunosAchados = (ArrayList<Aluno>) in.readObject();
            return alunosAchados;
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException(e);
        }
    }
}
