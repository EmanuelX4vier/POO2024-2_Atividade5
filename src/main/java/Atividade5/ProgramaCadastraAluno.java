package Atividade5;

import Atividade5.Controles.AlunoAdicionarControle;
import Atividade5.Controles.AlunoPesquisaControle;
import Atividade5.Controles.AlunoRemoveControle;

import javax.swing.*;
import java.awt.*;

public class ProgramaCadastraAluno extends JFrame {

    JLabel linha1, linha2, linha3;

    ImageIcon img = new ImageIcon("./img/icon1.png");

    ImageIcon addImg = new ImageIcon("./img/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./img/search_person.png");
    ImageIcon removeImg = new ImageIcon("./img/remove_person.png");

    JButton botaoAdicionar, botaoPesquisar, botaoRemover;

    SistemaCadastraAluno sistema = new SistemaCadastraAluno();

    public ProgramaCadastraAluno(){
        setTitle("Prodrama para cadastrar alunos");
        setSize(800,600);
        setLocation(0, 0);
        setResizable(true);
        getContentPane().setBackground(Color.GRAY);
        getContentPane().setLayout(new GridLayout(3, 1));
        linha1 = new JLabel("Meu programa de cadastramento", JLabel.CENTER);
        linha1.setForeground(Color.BLACK);
        linha1.setFont(new Font("Serif",Font.BOLD, 24));
        linha2 = new JLabel(img, JLabel.CENTER);
        linha3 = new JLabel();
        botaoAdicionar = new JButton("Adicionar", addImg);
        botaoAdicionar.addActionListener(new AlunoAdicionarControle(sistema, this));
        botaoPesquisar = new JButton("Pesquisar", pesqImg);
        botaoPesquisar.addActionListener(new AlunoPesquisaControle(sistema, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new AlunoRemoveControle(sistema, this));

        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(linha3);
        getContentPane().add(botaoRemover);
    }

    public static void main(String [] args){
        JFrame janela = new ProgramaCadastraAluno();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
