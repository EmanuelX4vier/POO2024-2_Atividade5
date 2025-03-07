package Atividade5.Controles;

import Atividade5.CadastroDeAlunos;
import Atividade5.Exceptions.AlunoInexistenteException;
import Atividade5.SistemaCadastraAluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlunoPesquisaControle implements ActionListener {

    private SistemaCadastraAluno sistema;
    private JFrame janelaPrincipal;

    public AlunoPesquisaControle(SistemaCadastraAluno sistema, JFrame janela) {
        this.sistema = sistema;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String matricula = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual a matricula do aluno?");
        try {
            sistema.pesquisaAluno(matricula);
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Aluno encontrado");
            JOptionPane.showMessageDialog(janelaPrincipal, sistema.pesquisaAluno(matricula).toString());
        } catch (AlunoInexistenteException x) {
            x.getMessage();
        }
    }
}
