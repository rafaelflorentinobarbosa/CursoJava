package JOption;

import javax.swing.JOptionPane;

public class Interface {

    public static void main(String[] args) {
        System.out.println("teste");

        // Por padrão retorna String
        JOptionPane.showInputDialog("Teste");

        // Necessário converter o retorno para int
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        System.out.println("sua idade é: "+x);

        // Exibe mensagem e Ok button
        JOptionPane.showMessageDialog(null, x );

        // Exibe mensagem e pergunta sim ou não buttons
        JOptionPane.showConfirmDialog(null, x, null, 0);

        // Crie uma calculadora com as 4 operações básicas
        
    }

}
