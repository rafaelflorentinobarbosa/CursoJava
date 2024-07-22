
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaLancarDespesa extends JFrame  {

    JTextField inputNomeDespesa, inputValorDespesa, inputPlacaDespesa, inputDescricaoDespesa;

    public TelaLancarDespesa() {

        setTitle("Lançar Despesa");
        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9, 1));


        //  Nome Despesa

        JLabel TextoNomeDespesa = new JLabel("Nome da despesa:");
        TextoNomeDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoNomeDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputNomeDespesa = new JTextField("");
        inputNomeDespesa.setBounds(250, 100, 250, 35);
        inputNomeDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        
        //  Valor Despesa

        JLabel TextoValorDespesa = new JLabel("Valor da despesa:");
        TextoValorDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoValorDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputValorDespesa = new JTextField("");
        inputValorDespesa.setBounds(250, 100, 250, 35);
        inputValorDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        
        //  Paca Veiculo

        JLabel TextoPlacaDespesa = new JLabel("Placa do veiculo:");
        TextoPlacaDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoPlacaDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputPlacaDespesa  = new JTextField("");
        inputPlacaDespesa .setBounds(250, 100, 250, 35);
        inputPlacaDespesa .setFont(new Font("SansSerif", Font.ITALIC, 15));
    
        //  Descrição Despesa

        JLabel TextoDescricaoDespesa = new JLabel("Descrição da despesa:");
        TextoDescricaoDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoDescricaoDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputDescricaoDespesa  = new JTextField("");
        inputDescricaoDespesa .setBounds(250, 100, 250, 35);
        inputDescricaoDespesa .setFont(new Font("SansSerif", Font.ITALIC, 15));

        // Botão Cadastrar

        JButton buttonCadastrarVeiculo = new JButton("Cadastrar");
        buttonCadastrarVeiculo.setBounds(50, 600, 250, 70); 
        buttonCadastrarVeiculo.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonCadastrarVeiculo.setBackground(new Color(10, 10, 10));
        buttonCadastrarVeiculo.setForeground(Color.WHITE);
        buttonCadastrarVeiculo.setFocusable(false);

        
        // Botão Voltar

        JPanel painelBotao = new JPanel();
        JButton jButtonVoltar = new JButton("Voltar");
        jButtonVoltar.setBounds(350, 600, 250, 70); 
        jButtonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonVoltar.setBackground(new Color(10, 10, 10));
        jButtonVoltar.setForeground(Color.WHITE);
        jButtonVoltar.setFocusable(false);
        
        buttonCadastrarVeiculo.addActionListener(this::cadastrarDespesa);
        jButtonVoltar.addActionListener(this::voltar);
        
        painelBotao.add(buttonCadastrarVeiculo);
        painelBotao.add(jButtonVoltar);

        add(TextoNomeDespesa);
        add(inputNomeDespesa);
        add(TextoValorDespesa);
        add(inputValorDespesa);
        add(TextoPlacaDespesa);
        add(inputPlacaDespesa );
        add(TextoDescricaoDespesa);
        add(inputDescricaoDespesa);
        add(painelBotao);

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
