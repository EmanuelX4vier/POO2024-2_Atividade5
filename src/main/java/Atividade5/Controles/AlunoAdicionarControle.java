package Atividade5.Controles;

import Atividade5.SistemaCadastraAluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlunoAdicionarControle implements ActionListener {

    private SistemaCadastraAluno sistema;
    private JFrame janelaPrincipal;

    public AlunoAdicionarControle(SistemaCadastraAluno sistema, JFrame janela){
        this.sistema = sistema;
        this.janelaPrincipal = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Digite o nome do aluno:");
        String matricula = JOptionPane.showInputDialog(janelaPrincipal, "Digite a matricula do aluno:");
        boolean cadastrou = sistema.cadastraAluno(nome, matricula);
        if(cadastrou){
            JOptionPane.showMessageDialog(janelaPrincipal, "Aluno cadastrado");
        }else{
            JOptionPane.showMessageDialog(janelaPrincipal, "Aluno não cadastrado");
        }
    }
}
