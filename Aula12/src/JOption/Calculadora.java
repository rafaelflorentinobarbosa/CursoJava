package JOption;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {

    public static void main(String[] args)  {

        // Criando uma janela JFrame
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(285, 200); // Define o tamanho da janela
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criando um JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 150)); // Define o tamanho preferido do JPanel

        // Texto Primeiro número
        JLabel textoNumero1 = new JLabel("Digite o Primeiro Número:");

        // Input Primeiro número
        JTextField numero1;
        numero1 = new JTextField(20); // 20 é o número de colunas do campo de texto
        
        // Texto Segundo número
        JLabel TextoNumero2 = new JLabel("Digite o Segundo Número:");

        // Input Segundo número
        JTextField numero2;
        numero2 = new JTextField(20); // 20 é o número de colunas do campo de texto     
        
        // Criando botões de operações
        JButton soma = new JButton(" + ");
        JButton subtracao = new JButton(" - ");
        JButton multiplicacao = new JButton(" * ");
        JButton divisao = new JButton(" / ");

        panel.add(textoNumero1); // Inserindo texto1 no jpanel
        panel.add(numero1); // Inserindo input de entrada do numero 1 no jpanel
        panel.add(TextoNumero2);// Inserindo texto2 no jpanel
        panel.add(numero2); // Inserindo input de entrada do numero 2 no jpanel

        // ADD Botões de operações
        panel.add(soma);
        panel.add(subtracao);
        panel.add(multiplicacao);
        panel.add(divisao);


        // Adiciona ActionListener ao botão de Soma
        soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Pega os valores dos JTextFields quando o botão + é clicado
                String valor1 = numero1.getText();
                String valor2 = numero2.getText();
                Double resultado =  Double.parseDouble(valor1) + Double.parseDouble(valor2);

                JOptionPane.showMessageDialog(frame, "\nPrimeiro numero: " + valor1 +"\nSegundo numero: "+ valor2 + "\n O resultado da soma é: "+resultado);
            }
        });

        Double resultadoFinal = 0.0;

        // Adiciona ActionListener ao botão de subtração
        subtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Pega os valores dos JTextFields quando o botão + é clicado
                String valor1 = numero1.getText();
                String valor2 = numero2.getText();
                Double resultado =  Double.parseDouble(valor1) - Double.parseDouble(valor2);                

                JOptionPane.showMessageDialog(frame, "\nPrimeiro numero: " + valor1 +"\nSegundo numero: "+ valor2 + "\n O resultado da Subtração é: "+resultado);
            }
        });

        // Adiciona ActionListener ao botão de subtração
        multiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Pega os valores dos JTextFields quando o botão + é clicado
                String valor1 = numero1.getText();
                String valor2 = numero2.getText();
                Double resultado =  Double.parseDouble(valor1) * Double.parseDouble(valor2);

                JOptionPane.showMessageDialog(frame, "\nPrimeiro numero: " + valor1 +"\nSegundo numero: "+ valor2 + "\n O resultado da Multiplicacao é: "+resultado);
            }
        });

        // Adiciona ActionListener ao botão de Divisão
        divisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Pega os valores dos JTextFields quando o botão + é clicado
                String valor1 = numero1.getText();
                String valor2 = numero2.getText();
                Double resultado =  Double.parseDouble(valor1) / Double.parseDouble(valor2);

                JOptionPane.showMessageDialog(frame, "\nPrimeiro numero: " + valor1 +"\nSegundo numero: "+ valor2 + "\n O resultado da Divisão é: "+resultado);
            }
        });        

        // Titulo resultado
        JLabel TextoResultado = new JLabel("Resultado da Operação: "+ resultadoFinal);
        panel.add(TextoResultado);

        // Adicionando o JPanel à janela JFrame
        frame.add(panel);

        // Tornando a janela visível
        frame.setVisible(true);
    }

}
