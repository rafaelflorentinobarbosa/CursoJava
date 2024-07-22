
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;


public class MenuPrincipal extends JFrame {

    static List<Veiculo> listaVeiculos = new ArrayList<>();
    static List<Despesa> listaDespesas = new ArrayList<>();

    public MenuPrincipal() {

        Border border = BorderFactory.createLineBorder(Color.green,3);

        // Configurações do Frame

        setTitle("Gerenciador de Frota");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);

        // Tela dentro da tela

        JPanel panel = new JPanel();
        panel.setSize(783, 560);
        panel.setBorder(border);
        panel.setLayout(null);
        panel.setBackground(Color.red);
        panel.setOpaque(true); 
        panel.setBackground(Color.BLACK);
        panel.setVisible(true);
        

        // Criando e configurando os botões
 
        JButton jButtonCadastrarVeiculos = new JButton("1 - Cadastrar Veiculo");
        jButtonCadastrarVeiculos.setBounds(280, 50, 250, 70); 
        jButtonCadastrarVeiculos.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonCadastrarVeiculos.setBackground(new Color(10, 10, 10));
        jButtonCadastrarVeiculos.setForeground(Color.WHITE);
        jButtonCadastrarVeiculos.setBorder(border);
        jButtonCadastrarVeiculos.setFocusable(false);

        JButton jButtonListarVeiculos = new JButton("2 - Listar Veiculos");
        jButtonListarVeiculos.setBounds(280, 150, 250, 70); 
        jButtonListarVeiculos.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonListarVeiculos.setBackground(new Color(10, 10, 10));
        jButtonListarVeiculos.setForeground(Color.WHITE);
        jButtonListarVeiculos.setBorder(border);
        jButtonListarVeiculos.setFocusable(false);

        JButton jButtonRegistrarDespesas = new JButton("3 - Registrar Despesas");
        jButtonRegistrarDespesas.setBounds(280, 250, 250, 70); 
        jButtonRegistrarDespesas.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonRegistrarDespesas.setBackground(new Color(10, 10, 10));
        jButtonRegistrarDespesas.setForeground(Color.WHITE);
        jButtonRegistrarDespesas.setBorder(border);
        jButtonRegistrarDespesas.setFocusable(false);

        JButton jButtonListarDespesas = new JButton("4 - Listar Despesas");
        jButtonListarDespesas.setBounds(280, 350, 250, 70); 
        jButtonListarDespesas.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonListarDespesas.setBackground(new Color(10, 10, 10));
        jButtonListarDespesas.setForeground(Color.WHITE);
        jButtonListarDespesas.setBorder(border);
        jButtonListarDespesas.setFocusable(false);

        JButton jButtonsair = new JButton("5 - Sair");
        jButtonsair.setBounds(280, 450, 250, 70); 
        jButtonsair.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonsair.setBackground(new Color(10, 10, 10));
        jButtonsair.setForeground(Color.WHITE);
        jButtonsair.setBorder(border);
        jButtonsair.setFocusable(false);

        panel.add(jButtonCadastrarVeiculos);
        panel.add(jButtonListarVeiculos);
        panel.add(jButtonRegistrarDespesas);
        panel.add(jButtonListarDespesas);
        panel.add(jButtonsair);

        add(panel);

        jButtonCadastrarVeiculos.addActionListener(this::cadastrarVeiculo);
        jButtonListarVeiculos.addActionListener(this::listarVeiculo);
        jButtonRegistrarDespesas.addActionListener(this::registrarDespesa);
        jButtonListarDespesas.addActionListener(this::listarDespesa);
        jButtonsair.addActionListener(this::sair);
    }

    public void cadastrarVeiculo(ActionEvent actionEvent) {
        //JOptionPane.showMessageDialog(null," Cadastre um Veículo", "Cadastrar Veículos",JOptionPane.INFORMATION_MESSAGE);
        new TelaCadastrarVeiculo();
        dispose(); 
    
    }

    private void listarVeiculo(ActionEvent actionEvent){
        new TelaListaVeiculos(listaVeiculos);
        dispose(); 
        //JOptionPane.showMessageDialog(null," Lista de Veículos", "Listar Veículos",JOptionPane.WARNING_MESSAGE);
    }

    private void registrarDespesa(ActionEvent actionEvent){
        new TelaLancarDespesa();
        dispose(); 
        //JOptionPane.showMessageDialog(null," Registre uma despesa", "Cadastrar Despesa",JOptionPane.WARNING_MESSAGE);
    }

    private void listarDespesa(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null," Lista das despesas", "Listar Despesas",JOptionPane.WARNING_MESSAGE);
    }

    private void sair(ActionEvent actionEvent){
        dispose(); 
    }

}
