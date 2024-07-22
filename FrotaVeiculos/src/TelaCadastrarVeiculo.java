import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.util.ArrayList;
//import java.util.List;

public class TelaCadastrarVeiculo extends JFrame {

    JTextField inputMarca, inputModelo, inputAnoFabricacao, inputAnoModelo, inputMotorizacao, inputCapacidadeTanque, inputCor, inputPlaca, inputRenavam; 
    
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
    textoCadastroVeiculo.setBounds(300, 30, 250, 70);
    textoCadastroVeiculo.setFont(new Font("SansSerif", Font.BOLD, 16));
    textoCadastroVeiculo.setForeground(Color.BLUE);
    add(textoCadastroVeiculo);

    // Marca

    JLabel textoMarca = new JLabel("Marca: ");
    textoMarca.setBounds(190, 80, 250, 70);
    textoMarca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoMarca);

    inputMarca = new JTextField("");
    inputMarca.setBounds(250, 100, 250, 35);
    inputMarca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputMarca);
    
    // Modelo

    JLabel textoModelo = new JLabel("Modelo: ");
    textoModelo.setBounds(185, 130, 250, 70);
    textoModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoModelo);

    inputModelo = new JTextField("");
    inputModelo.setBounds(250, 150, 250, 35);
    inputModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputModelo);

    // Ano Fabricação

    JLabel textoAnoFabricacao = new JLabel("Ano Fabricacao: ");
    textoAnoFabricacao.setBounds(130, 180, 250, 70);
    textoAnoFabricacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoAnoFabricacao);

    inputAnoFabricacao = new JTextField("");
    inputAnoFabricacao.setBounds(250, 200, 250, 35);
    inputAnoFabricacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputAnoFabricacao);

    // Ano Modelo

    JLabel textoAnoModelo = new JLabel("Ano Modelo: ");
    textoAnoModelo.setBounds(150, 230, 250, 70);
    textoAnoModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoAnoModelo);

    inputAnoModelo = new JTextField("");
    inputAnoModelo.setBounds(250, 250, 250, 35);
    inputAnoModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputAnoModelo);

    // Motorização

    JLabel textoMotorizacao = new JLabel("Motor: ");
    textoMotorizacao.setBounds(190, 280, 250, 70);
    textoMotorizacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoMotorizacao);

    inputMotorizacao = new JTextField("");
    inputMotorizacao.setBounds(250, 300, 250, 35);
    inputMotorizacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputMotorizacao);

    // Capacidade Tanque

    JLabel textoCapacidadeTanque = new JLabel("Capacidade Tanque: ");
    textoCapacidadeTanque.setBounds(100, 330, 250, 70);
    textoCapacidadeTanque.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoCapacidadeTanque);

    inputCapacidadeTanque = new JTextField("");
    inputCapacidadeTanque.setBounds(250, 350, 250, 35);
    inputCapacidadeTanque.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputCapacidadeTanque);

    // Cor

    JLabel textoCor = new JLabel("Cor: ");
    textoCor.setBounds(200, 380, 250, 70);
    textoCor.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoCor);

    inputCor = new JTextField("");
    inputCor.setBounds(250, 400, 250, 35);
    inputCor.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputCor);

    // Placa

    JLabel textoPlaca = new JLabel("Placa: ");
    textoPlaca.setBounds(190, 430, 250, 70);
    textoPlaca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoPlaca);

    inputPlaca = new JTextField("");
    inputPlaca.setBounds(250, 450, 250, 35);
    inputPlaca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputPlaca);

    // Renavam

    JLabel textoRenavam = new JLabel("Renavam: ");
    textoRenavam.setBounds(160, 480, 250, 70);
    textoRenavam.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoRenavam);

    inputRenavam = new JTextField("");
    inputRenavam.setBounds(250, 500, 250, 35);
    inputRenavam.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputRenavam);

    // Botão Cadastrar Veiculo

    JButton buttonCadastrarVeiculo = new JButton("Cadastrar");
    buttonCadastrarVeiculo.setBounds(50, 600, 250, 70); 
    buttonCadastrarVeiculo.setFont(new Font("SansSerif", Font.BOLD, 15));
    buttonCadastrarVeiculo.setBackground(new Color(10, 10, 10));
    buttonCadastrarVeiculo.setForeground(Color.WHITE);
    buttonCadastrarVeiculo.setFocusable(false);
    add(buttonCadastrarVeiculo);
    

    // Botão Voltar

    JButton buttonVoltar = new JButton("Voltar");
    buttonVoltar.setBounds(350, 600, 250, 70); 
    buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
    buttonVoltar.setBackground(new Color(10, 10, 10));
    buttonVoltar.setForeground(Color.WHITE);
    buttonVoltar.setFocusable(false);
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
            // Verificar se entrou números nos inputs int
            if (!inputAnoFabricacao.getText().matches("\\d+") || !inputAnoModelo.getText().matches("\\d+") || !inputCapacidadeTanque.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Os campos Ano de Fabricação, Ano do Modelo e Capacidade Tanque devem conter apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
                return; 
            }            

            // Cria um novo objeto Veiculo com os valores dos campos de entrada
            
            Veiculo novoVeiculo = new Veiculo(
                inputMarca.getText(),
                inputModelo.getText(),
                Integer.parseInt(inputAnoFabricacao.getText()), 
                Integer.parseInt(inputAnoModelo.getText()), 
                inputMotorizacao.getText(),
                Double.parseDouble(inputCapacidadeTanque.getText()), 
                inputCor.getText(),
                inputPlaca.getText(),
                inputRenavam.getText()
            );


            // Adiciona o novo veículo à lista de veículos
            MenuPrincipal.listaVeiculos.add(novoVeiculo);

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(null,novoVeiculo, "Veículo cadastrado com sucesso \nDados Veículo:",JOptionPane.INFORMATION_MESSAGE);
            //new TelaListaVeiculos( MenuPrincipal.listaVeiculos);
            new MenuPrincipal();
            dispose(); 
        }

    }   

    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose(); 
    }

}
