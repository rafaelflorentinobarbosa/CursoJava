import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;


public class TelaCadastrarVeiculo extends JFrame {

    JTextField inputMarca, inputModelo, inputAnoFabricacao, inputAnoModelo, inputMotorizacao, inputCapacidadeTanque, inputCor, inputPlaca, inputRenavam; 
    Border border = BorderFactory.createLineBorder(Color.green,3);
    JComboBox<String> tipoCombustivel;

    public TelaCadastrarVeiculo(){

    // Tela Frame configurações

    setTitle("Cadastrar Veiculo");
    setVisible(true);
    setSize(670, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setLayout(null);

    JLabel textoCadastroVeiculo = new JLabel("Cadastro Veiculo");
    textoCadastroVeiculo.setBounds(300, 10, 250, 70);
    textoCadastroVeiculo.setFont(new Font("SansSerif", Font.BOLD, 16));
    textoCadastroVeiculo.setForeground(Color.BLUE);
    add(textoCadastroVeiculo);

    // Marca

    JLabel textoMarca = new JLabel("Marca: ");
    textoMarca.setBounds(190, 80, 250, 70);
    textoMarca.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoMarca);

    inputMarca = new JTextField("");
    inputMarca.setBounds(250, 100, 250, 35);
    inputMarca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputMarca);
    
    // Modelo

    JLabel textoModelo = new JLabel("Modelo: ");
    textoModelo.setBounds(175, 130, 250, 70);
    textoModelo.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoModelo);

    inputModelo = new JTextField("");
    inputModelo.setBounds(250, 150, 250, 35);
    inputModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputModelo);

    // Ano Fabricação

    JLabel textoAnoFabricacao = new JLabel("Ano Fabricacao: ");
    textoAnoFabricacao.setBounds(105, 180, 250, 70);
    textoAnoFabricacao.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoAnoFabricacao);

    inputAnoFabricacao = new JTextField("");
    inputAnoFabricacao.setBounds(250, 200, 250, 35);
    inputAnoFabricacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputAnoFabricacao);

    // Ano Modelo

    JLabel textoAnoModelo = new JLabel("Ano Modelo: ");
    textoAnoModelo.setBounds(135, 230, 250, 70);
    textoAnoModelo.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoAnoModelo);

    inputAnoModelo = new JTextField("");
    inputAnoModelo.setBounds(250, 250, 250, 35);
    inputAnoModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputAnoModelo);

    // Motorização

    JLabel textoMotorizacao = new JLabel("Motor: ");
    textoMotorizacao.setBounds(190, 280, 250, 70);
    textoMotorizacao.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoMotorizacao);

    inputMotorizacao = new JTextField("");
    inputMotorizacao.setBounds(250, 300, 250, 35);
    inputMotorizacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputMotorizacao);

    // Capacidade Tanque

    JLabel textoCapacidadeTanque = new JLabel("Capacidade Tanque: ");
    textoCapacidadeTanque.setBounds(70, 330, 250, 70);
    textoCapacidadeTanque.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoCapacidadeTanque);

    inputCapacidadeTanque = new JTextField("");
    inputCapacidadeTanque.setBounds(250, 350, 250, 35);
    inputCapacidadeTanque.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputCapacidadeTanque);

    // Cor

    JLabel textoCor = new JLabel("Cor: ");
    textoCor.setBounds(210, 380, 250, 70);
    textoCor.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoCor);

    inputCor = new JTextField("");
    inputCor.setBounds(250, 400, 250, 35);
    inputCor.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputCor);

    // Placa

    JLabel textoPlaca = new JLabel("Placa: ");
    textoPlaca.setBounds(195, 430, 250, 70);
    textoPlaca.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoPlaca);

    inputPlaca = new JTextField("");
    inputPlaca.setBounds(250, 450, 250, 35);
    inputPlaca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputPlaca);

    // Renavam

    JLabel textoRenavam = new JLabel("Renavam: ");
    textoRenavam.setBounds(160, 480, 250, 70);
    textoRenavam.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoRenavam);

    inputRenavam = new JTextField("");
    inputRenavam.setBounds(250, 500, 250, 35);
    inputRenavam.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputRenavam);

    // Tipo Combustível

    JLabel textoCombustivel = new JLabel("Combustível: ");
    textoCombustivel.setBounds(130, 530, 250, 70);
    textoCombustivel.setFont(new Font("SansSerif", Font.BOLD, 18));
    add(textoCombustivel);

    String[] combustiveis = {"Gasolina", "Álcool", "Flex", "Diesel"};
    tipoCombustivel = new JComboBox<>(combustiveis);
    tipoCombustivel.setBounds(250, 550, 250, 35);
    tipoCombustivel.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(tipoCombustivel);    

    // Botão Cadastrar Veiculo

    JButton buttonCadastrarVeiculo = new JButton("Cadastrar");
    buttonCadastrarVeiculo.setBounds(50, 600, 250, 70); 
    buttonCadastrarVeiculo.setFont(new Font("SansSerif", Font.BOLD, 15));
    buttonCadastrarVeiculo.setBackground(new Color(10, 10, 10));
    buttonCadastrarVeiculo.setForeground(Color.WHITE);
    buttonCadastrarVeiculo.setFocusable(false);
    buttonCadastrarVeiculo.setBorder(border);
    add(buttonCadastrarVeiculo);
    

    // Botão Voltar

    JButton buttonVoltar = new JButton("Voltar");
    buttonVoltar.setBounds(350, 600, 250, 70); 
    buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
    buttonVoltar.setBackground(new Color(10, 10, 10));
    buttonVoltar.setForeground(Color.WHITE);
    buttonVoltar.setFocusable(false);
    buttonVoltar.setBorder(border);
    add(buttonVoltar);

    // Redirecionamentos botões
    
    buttonCadastrarVeiculo.addActionListener(this::cadastrar);
    setVisible(true);

    buttonVoltar.addActionListener(this::voltar);
    setVisible(true);

    }

    public void cadastrar(ActionEvent actionEvent) {

        // Verificar se todos os campos foram preenchidos
        if(  
            inputMarca.getText().isEmpty() || inputModelo.getText().isEmpty() || 
            inputAnoFabricacao.getText().isEmpty() || inputAnoModelo.getText().isEmpty() || 
            inputMotorizacao.getText().isEmpty() || inputCapacidadeTanque.getText().isEmpty() ||
            inputCor.getText().isEmpty() || inputPlaca.getText().isEmpty() ||
            inputRenavam.getText().isEmpty()
        ){

            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente", "Informação", 0);
        }else{
       
            if (!inputAnoFabricacao.getText().matches("\\d+") || !inputAnoModelo.getText().matches("\\d+") || !inputMotorizacao.getText().matches("\\d+(\\.\\d+)?") || !inputCapacidadeTanque.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Os campos Ano de Fabricação, Ano do Modelo, Motorização e Capacidade Tanque devem conter apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
                return; 
            }            
            
            Veiculo novoVeiculo = new Veiculo(
                inputMarca.getText(),
                inputModelo.getText(),
                Integer.parseInt(inputAnoFabricacao.getText()), 
                Integer.parseInt(inputAnoModelo.getText()), 
                Double.parseDouble(inputMotorizacao.getText()),
                Double.parseDouble(inputCapacidadeTanque.getText()), 
                tipoCombustivel.getSelectedItem().toString(),
                inputCor.getText(),
                inputPlaca.getText(),
                inputRenavam.getText()
            );

            MenuPrincipal.listaVeiculos.add(novoVeiculo);

            JOptionPane.showMessageDialog(null,novoVeiculo, "Veículo cadastrado com sucesso \nDados Veículo:",JOptionPane.INFORMATION_MESSAGE);
            new MenuPrincipal();
            dispose(); 
        }

    }   

    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose(); 
    }

}
