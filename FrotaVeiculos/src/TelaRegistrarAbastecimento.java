import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.Border;

class TelaRegistrarAbastecimento extends JFrame {
    JTextField inputValorAbastecido, inputQuantidadeCombustivel, inputQuilometragem;
    Border border = BorderFactory.createLineBorder(Color.green,3);
    Veiculo veiculo;

    public TelaRegistrarAbastecimento(Veiculo veiculo) {
        this.veiculo = veiculo;

        // Tela Frame configurações
        setTitle("Registrar Abastecimento: "+veiculo.getMarca()+" "+veiculo.getModelo());
        setVisible(true);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Valor Abastecido
        JLabel textoValorAbastecido = new JLabel("Valor Abastecido: ");
        textoValorAbastecido.setBounds(50, 30, 150, 35);
        textoValorAbastecido.setFont(new Font("SansSerif", Font.ITALIC, 15));
        add(textoValorAbastecido);

        inputValorAbastecido = new JTextField("");
        inputValorAbastecido.setBounds(200, 30, 200, 35);
        inputValorAbastecido.setFont(new Font("SansSerif", Font.ITALIC, 15));
        add(inputValorAbastecido);

        // Quantidade de Combustível
        JLabel textoQuantidadeCombustivel = new JLabel("Litros: ");
        textoQuantidadeCombustivel.setBounds(50, 80, 150, 35);
        textoQuantidadeCombustivel.setFont(new Font("SansSerif", Font.ITALIC, 15));
        add(textoQuantidadeCombustivel);

        inputQuantidadeCombustivel = new JTextField("");
        inputQuantidadeCombustivel.setBounds(200, 80, 200, 35);
        inputQuantidadeCombustivel.setFont(new Font("SansSerif", Font.ITALIC, 15));
        add(inputQuantidadeCombustivel);

        // Quilometragem
        JLabel textoQuilometragem = new JLabel("Quilometragem: ");
        textoQuilometragem.setBounds(50, 130, 150, 35);
        textoQuilometragem.setFont(new Font("SansSerif", Font.ITALIC, 15));
        add(textoQuilometragem);

        inputQuilometragem = new JTextField("");
        inputQuilometragem.setBounds(200, 130, 200, 35);
        inputQuilometragem.setFont(new Font("SansSerif", Font.ITALIC, 15));
        add(inputQuilometragem);

        // Botão Registrar Abastecimento
        JButton buttonRegistrarAbastecimento = new JButton("Registrar");
        buttonRegistrarAbastecimento.setBounds(50, 200, 150, 50);
        buttonRegistrarAbastecimento.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonRegistrarAbastecimento.setBackground(new Color(10, 10, 10));
        buttonRegistrarAbastecimento.setForeground(Color.WHITE);
        buttonRegistrarAbastecimento.setFocusable(false);
        buttonRegistrarAbastecimento.setBorder(border);
        buttonRegistrarAbastecimento.addActionListener(this::Abastecer);
        add(buttonRegistrarAbastecimento);

        // Botão Voltar
        JButton buttonVoltar = new JButton("Voltar");
        buttonVoltar.setBounds(250, 200, 150, 50);
        buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonVoltar.setBackground(new Color(10, 10, 10));
        buttonVoltar.setForeground(Color.WHITE);
        buttonVoltar.setFocusable(false);
        buttonVoltar.setBorder(border);
        buttonVoltar.addActionListener(this::voltar);
        add(buttonVoltar);
    }

    public void Abastecer(ActionEvent actionEvent) {
        // Verificar se todos os campos foram preenchidos
        if(inputValorAbastecido.getText().isEmpty() || 
           inputQuantidadeCombustivel.getText().isEmpty() || 
           inputQuilometragem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }else{
            // Registrar abastecimento

            veiculo.registrarAbastecimento(
                Double.parseDouble(inputValorAbastecido.getText()),
                Double.parseDouble(inputQuantidadeCombustivel.getText()),
                Double.parseDouble(inputQuilometragem.getText())
            );

            JOptionPane.showMessageDialog(null, "Abastecimento registrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            new TelaListaVeiculos(MenuPrincipal.listaVeiculos);
            dispose();
        }

    }

    public void voltar(ActionEvent actionEvent) {
        new TelaListaVeiculos(MenuPrincipal.listaVeiculos);
        dispose(); 
    } 
}