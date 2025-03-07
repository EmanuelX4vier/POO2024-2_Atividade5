package Atividade5;

import Atividade5.Controles.AlunoAdicionarControle;
import Atividade5.Controles.AlunoPesquisaControle;
import Atividade5.Controles.AlunoRemoveControle;

import javax.swing.*;
import java.awt.*;

public class ProgramaCadastraAlunoComMenu extends JFrame {

        JLabel linha1, linha2, linha3;

        ImageIcon img = new ImageIcon("./img/icon1.png");

        SistemaCadastraAluno sistema = new SistemaCadastraAluno();

        JMenuBar barraDeMenu = new JMenuBar();

        public ProgramaCadastraAlunoComMenu(){
            setTitle("Programa para cadastrar alunos");
            setSize(800,600);
            setLocation(150, 150);
            setResizable(true);
            setBackground(Color.GRAY);

            linha1 = new JLabel("Meu programa de cadastramento", JLabel.CENTER);
            linha1.setForeground(Color.BLACK);
            linha1.setFont(new Font("Serif",Font.BOLD, 24));
            linha2 = new JLabel(img, JLabel.CENTER);
            linha3 = new JLabel();

            setLayout(new GridLayout(3, 1));

            add(linha1);
            add(linha2);
            add(linha3);

            JMenu menuCadastrar = new JMenu("Cadastrar");
            JMenuItem menuCadastrarAluno = new JMenuItem("Cadastrar aluno");
            menuCadastrar.add(menuCadastrarAluno);

            JMenu menuPesquisar = new JMenu("Pesquisar");
            JMenuItem menuPesquisarAluno = new JMenuItem("Pesquisar aluno");
            menuPesquisar.add(menuPesquisarAluno);

            JMenu menuRemover = new JMenu("Remover");
            JMenuItem menuRemoverAluno = new JMenuItem("Remover aluno");
            menuRemover.add(menuRemoverAluno);

            menuCadastrarAluno.addActionListener(new AlunoAdicionarControle(sistema, this));
            menuPesquisarAluno.addActionListener(new AlunoPesquisaControle(sistema, this));
            menuRemoverAluno.addActionListener(new AlunoRemoveControle(sistema, this));

            barraDeMenu.add(menuCadastrarAluno);
            barraDeMenu.add(menuPesquisarAluno);
            barraDeMenu.add(menuRemoverAluno);
            setJMenuBar(barraDeMenu);
        }

        public static void main(String [] args){
            JFrame janela = new ProgramaCadastraAlunoComMenu();
            janela.setVisible(true);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
}


