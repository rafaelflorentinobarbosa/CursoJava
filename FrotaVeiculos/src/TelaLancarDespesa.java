
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaLancarDespesa extends JFrame  {

       JTextField inputNomeDespesa, inputValorDespesa, inputPlacaDespesa;
    JTextArea inputDescricaoDespesa;
    JComboBox<String> comboBoxCategoria;
    Border border = BorderFactory.createLineBorder(Color.green, 3);

    public TelaLancarDespesa() {

        setTitle("Lançar Despesa");
        setSize(680, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);  // Usando layout nulo para posicionamento absoluto
        setVisible(true);

        // Nome Despesa
        JLabel TextoNomeDespesa = new JLabel("Nome da despesa:");
        TextoNomeDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoNomeDespesa.setBounds(50, 50, 200, 30);  // Definindo posição e tamanho
        add(TextoNomeDespesa);

        inputNomeDespesa = new JTextField("");
        inputNomeDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        inputNomeDespesa.setBounds(300, 50, 250, 35);  // Definindo posição e tamanho
        add(inputNomeDespesa);

        // Valor Despesa
        JLabel TextoValorDespesa = new JLabel("Valor da despesa:");
        TextoValorDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoValorDespesa.setBounds(50, 100, 200, 30);  // Definindo posição e tamanho
        add(TextoValorDespesa);

        inputValorDespesa = new JTextField("");
        inputValorDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        inputValorDespesa.setBounds(300, 100, 250, 35);  // Definindo posição e tamanho
        add(inputValorDespesa);

        // Placa Veículo
        JLabel TextoPlacaDespesa = new JLabel("Placa do veículo:");
        TextoPlacaDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoPlacaDespesa.setBounds(50, 150, 200, 30);  // Definindo posição e tamanho
        add(TextoPlacaDespesa);

        inputPlacaDespesa = new JTextField("");
        inputPlacaDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        inputPlacaDespesa.setBounds(300, 150, 250, 35);  // Definindo posição e tamanho
        add(inputPlacaDespesa);

        // Categoria
        JLabel TextoCategoriaDespesa = new JLabel("Categoria:");
        TextoCategoriaDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoCategoriaDespesa.setBounds(50, 200, 200, 30);  // Definindo posição e tamanho
        add(TextoCategoriaDespesa);

        comboBoxCategoria = new JComboBox<>(new String[]{"Manutenção", "Imposto", "Multa", "Outros"});
        comboBoxCategoria.setFont(new Font("SansSerif", Font.PLAIN, 15));
        comboBoxCategoria.setBounds(300, 200, 250, 35);  // Definindo posição e tamanho
        add(comboBoxCategoria);

        // Descrição Despesa
        JLabel TextoDescricaoDespesa = new JLabel("Descrição da despesa:");
        TextoDescricaoDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoDescricaoDespesa.setBounds(50, 250, 250, 30);  // Definindo posição e tamanho
        add(TextoDescricaoDespesa);

        inputDescricaoDespesa = new JTextArea("");
        inputDescricaoDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        inputDescricaoDespesa.setLineWrap(true);
        inputDescricaoDespesa.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(inputDescricaoDespesa);
        scrollPane.setBounds(300, 250, 250, 100);  // Definindo posição e tamanho
        add(scrollPane);

        // Botão Cadastrar
        JButton buttonCadastrarVeiculo = new JButton("Cadastrar");
        buttonCadastrarVeiculo.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonCadastrarVeiculo.setBackground(new Color(10, 10, 10));
        buttonCadastrarVeiculo.setForeground(Color.WHITE);
        buttonCadastrarVeiculo.setBorder(border);
        buttonCadastrarVeiculo.setFocusable(false);
        buttonCadastrarVeiculo.setBounds(150, 400, 150, 40);  // Definindo posição e tamanho
        buttonCadastrarVeiculo.addActionListener(this::cadastrarDespesa);
        add(buttonCadastrarVeiculo);

        // Botão Voltar
        JButton jButtonVoltar = new JButton("Voltar");
        jButtonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonVoltar.setBackground(new Color(10, 10, 10));
        jButtonVoltar.setForeground(Color.WHITE);
        jButtonVoltar.setBorder(border);
        jButtonVoltar.setFocusable(false);
        jButtonVoltar.setBounds(350, 400, 150, 40);  // Definindo posição e tamanho
        jButtonVoltar.addActionListener(this::voltar);
        add(jButtonVoltar);
    }

        public void cadastrarDespesa(ActionEvent actionEvent) {

        if(  
            inputNomeDespesa.getText().isEmpty() || inputValorDespesa.getText().isEmpty() || 
            inputPlacaDespesa.getText().isEmpty() || inputDescricaoDespesa.getText().isEmpty() 
        ){
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente", "Informação", 0);
        }else{
            
            if (!inputValorDespesa.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Os campos Valor deve conter apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
                return; 
            }            
            
            Despesa novaDespesa = new Despesa(
                inputNomeDespesa.getText(),
                Float.parseFloat(inputValorDespesa.getText()), 
                inputPlacaDespesa.getText(),
                comboBoxCategoria.getSelectedItem().toString(),
                inputDescricaoDespesa.getText()
            );
            MenuPrincipal.listaDespesas.add(novaDespesa);

            JOptionPane.showMessageDialog(null,novaDespesa, "Despesa cadastrada com sucesso \nDados Despesa:",JOptionPane.INFORMATION_MESSAGE);
            new MenuPrincipal();
            dispose(); 
        }

    }   
    
    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose(); 
    }


}
