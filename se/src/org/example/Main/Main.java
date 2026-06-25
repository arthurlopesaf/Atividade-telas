package org.example.Main; // Use o nome do seu pacote atual

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {

        // 1. Cria a janela principal (o frame)
        JFrame janela = new JFrame("Minha Tela em Swing");
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela

        // 2. Cria um painel para organizar os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout(10, 10));

        // 3. Cria um texto (Label) e um Botão
        JLabel texto = new JLabel("Swing funcionando perfeitamente!", JLabel.CENTER);
        JButton botao = new JButton("Clique Aqui");

        // 4. Diz o que acontece quando você clica no botão
        botao.addActionListener(e -> {
            System.out.println("Botão clicado!");
            botao.setText("Funcionou!");
            texto.setText("Você clicou no botão do Swing!");
        });

        // 5. Coloca o texto e o botão dentro do painel
        painel.add(texto, BorderLayout.CENTER);
        painel.add(botao, BorderLayout.SOUTH);

        // 6. Coloca o painel na janela e manda ela aparecer
        janela.add(painel);
        janela.setVisible(true);
    }
}