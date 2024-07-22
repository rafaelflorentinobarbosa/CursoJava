import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class TelaListaVeiculos extends JFrame {


    public TelaListaVeiculos(List<Veiculo> listaVeiculos) {
        setTitle("Lista de Veículos Cadastrados");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
   
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(MenuPrincipal.listaVeiculos.size() + 2, 1));

        // Titulo da Tela

        if(MenuPrincipal.listaVeiculos.isEmpty()){

            JLabel headerLabel = new JLabel("Nenhum Veículos Cadastrado");
            headerLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
            headerLabel.setForeground(Color.BLUE);
            headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(headerLabel);

        }else{
            JLabel headerLabel = new JLabel("Lista de Veículos Cadastrados");
            headerLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
            headerLabel.setForeground(Color.BLUE);
            headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(headerLabel);
        }



        // Lista todos os veiculos cadastrados

        for (Veiculo veiculo : MenuPrincipal.listaVeiculos) {
            JLabel veiculoLabel = new JLabel(veiculo.getMarca() + " " + veiculo.getModelo() + " - Placa: " + veiculo.getPlaca());
            veiculoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
            veiculoLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(veiculoLabel);
        }
        
        // Botão Voltar

        JButton buttonVoltar = new JButton("Voltar");
        buttonVoltar.setBounds(350, 600, 250, 70); 
        buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonVoltar.setBackground(new Color(10, 10, 10));
        buttonVoltar.setForeground(Color.WHITE);
        buttonVoltar.setHorizontalAlignment(SwingConstants.CENTER);
        buttonVoltar.addActionListener(this::voltar); 
        buttonVoltar.setFocusable(false);
        Border border = BorderFactory.createLineBorder(Color.green,3);
        buttonVoltar.setBorder(border);

        // Centraliza a janela na tela
        setLocationRelativeTo(null);

        panel.add(buttonVoltar);
        add(panel);
  
    }


    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose(); 
    }
    

}