import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;

public class Principal {

    public static void main(String[] args) {

        // Validaçao só no terminal
        String padrao = "##.###-###";
        String cep = "25468743";
        System.out.println(FormataCep(cep, padrao));

        // Validação gráfica Com JOption
        // Criando uma janela JFrame
        JFrame frame = new JFrame("Validador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(285, 230); // Define o tamanho da janela
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criando um JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(285, 230)); // Define o tamanho preferido do JPanel

        // Texto CEP e input 
        JLabel textoCep = new JLabel("Digite o CEP:");
        JTextField inputCep;
        inputCep = new JTextField(20); 

        // Texto CPF e input 
        JLabel textoCpf = new JLabel("Digite o CPF:");
        JTextField inputCpf;
        inputCpf = new JTextField(20);     
        
        // Texto telefone e input 
        JLabel textoTelefone = new JLabel("Digite o Telefone:");
        JTextField inputTelefone;
        inputTelefone = new JTextField(20); 
        
        // Criando botão
        JButton validar = new JButton("Validar");

        // Inserindo elementos no panel
        panel.add(textoCep); 
        panel.add(inputCep);
        panel.add(textoCpf); 
        panel.add(inputCpf);
        panel.add(textoTelefone); 
        panel.add(inputTelefone);
        panel.add(validar);

        // Adicionando o JPanel à janela JFrame
        frame.add(panel);

        // Tornando a janela visível
        frame.setVisible(true);      
        
        // Adiciona ActionListener ao botão de Soma
        validar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Pega os valores dos JTextFields quando o botão + é clicado
                String padraoCep = "##.###-###";
                String cep = FormataCep(inputCep.getText(), padraoCep);

                String padraoCpf = "###.###.###-##";
                String cpf = FormataCpf(inputCpf.getText(),padraoCpf);

                String padraoTelefone = "(##) #####-####";
                String telefone = FormataTelefone(inputTelefone.getText(),padraoTelefone);

                JOptionPane.showMessageDialog(frame, "\nSeu CEP: " + cep +"\nSeu CPF: "+ cpf + "\nSeu Telefone: "+telefone);
            }
        });
    }

    static String FormataCep(String cep, String padrao){
        if(cep.length() < 8 || cep.length() > 8){
            return "Cep Inválido, Necessário 9 numeros";
        }
        if(cep.matches("[0-9]+")){
            MaskFormatter mascara;
            try {
                mascara = new MaskFormatter(padrao);
                mascara.setValueContainsLiteralCharacters(false);
                return mascara.valueToString(cep);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }else{
            return "CEP Só aceita numeros";
        }
    
    }

    static String FormataCpf(String cpf, String padrao){
        if(cpf.length() < 11 || cpf.length() > 11){
            return "CPF Inválido.";
        }
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padrao);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cpf);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
       
    }

    static String FormataTelefone(String telefone, String padrao){
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padrao);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(telefone);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
       
    }
}

