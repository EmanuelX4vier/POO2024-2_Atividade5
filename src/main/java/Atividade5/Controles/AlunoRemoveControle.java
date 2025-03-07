package Atividade5.Controles;

import Atividade5.Exceptions.AlunoInexistenteException;
import Atividade5.SistemaCadastraAluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlunoRemoveControle implements ActionListener {

    private SistemaCadastraAluno sistema;
    private JFrame janelaPrincipal;

    public AlunoRemoveControle(SistemaCadastraAluno sistema, JFrame janela){
        this.sistema = sistema;
        this.janelaPrincipal = janela;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String matricula = JOptionPane.showInputDialog(janelaPrincipal, "Digite a matricula do aluno que deseja remover");
        try {
            sistema.removeAluno(matricula);
            JOptionPane.showMessageDialog(janelaPrincipal, "Aluno removido com sucesso");
        } catch (AlunoInexistenteException ex) {
            ex.getMessage();
        }
    }
}
