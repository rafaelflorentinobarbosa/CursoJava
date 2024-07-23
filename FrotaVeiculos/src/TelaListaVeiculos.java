import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class TelaListaVeiculos extends JFrame {

    Border border = BorderFactory.createLineBorder(Color.green,3);

    public TelaListaVeiculos(List<Veiculo> listaVeiculos) {
      

      setTitle("Veículos Cadastrados");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(600, 200);
      setLayout(new GridLayout(MenuPrincipal.listaVeiculos.size() == 0 ? MenuPrincipal.listaVeiculos.size() + 3 : MenuPrincipal.listaVeiculos.size() + 2, 1)); 
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setVisible(true);

        // Primeira linha: texto "Veículos Cadastrados"
        JLabel labelTitulo = new JLabel("Veículos Cadastrados", SwingConstants.CENTER);
        add(labelTitulo);

        // Segunda linha: nome veiculo, placa e 3 botões  
        if(MenuPrincipal.listaVeiculos.isEmpty()){

            JLabel headerLabel = new JLabel("Nenhum Veículos Cadastrado");
            headerLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
            headerLabel.setForeground(Color.BLUE);
            headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(headerLabel);

        }else{

            for (Veiculo veiculo : MenuPrincipal.listaVeiculos) {

                JPanel panelMeio = new JPanel();
                panelMeio.setLayout(new FlowLayout()); 

                JLabel veiculoLabel = new JLabel(veiculo.getMarca() + " " + veiculo.getModelo() + " - Placa: " + veiculo.getPlaca());
                veiculoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

                JButton buttonDespesas = new JButton("Despesas");
                buttonDespesas.setBackground(new Color(10, 10, 10));
                buttonDespesas.setForeground(Color.WHITE);
                buttonDespesas.setHorizontalAlignment(SwingConstants.CENTER);
                buttonDespesas.addActionListener(this::voltar); 
                buttonDespesas.setFocusable(false);
                buttonDespesas.setBorder(border);

                JButton buttonMedia = new JButton("Consumo");
                buttonMedia.setBackground(new Color(10, 10, 10));
                buttonMedia.setForeground(Color.WHITE);
                buttonMedia.setHorizontalAlignment(SwingConstants.CENTER);
                buttonMedia.addActionListener(this::voltar); 
                buttonMedia.setFocusable(false);
                buttonMedia.setBorder(border);

                JButton buttonAbastecer = new JButton("Abastecer");
                buttonAbastecer.setBackground(new Color(10, 10, 10));
                buttonAbastecer.setForeground(Color.WHITE);
                buttonAbastecer.setHorizontalAlignment(SwingConstants.CENTER);
                buttonAbastecer.addActionListener(this::voltar); 
                buttonAbastecer.setFocusable(false);
                buttonAbastecer.setBorder(border);

                panelMeio.add(veiculoLabel);
                panelMeio.add(buttonDespesas);
                panelMeio.add(buttonMedia);
                panelMeio.add(buttonAbastecer);

                add(panelMeio);
                pack();

                // Define a largura para 600 e mantém a altura ajustada dinamicamente
                Dimension size = getSize();
                size.width = 600;
                setSize(size);        
            }

    }
      // Terceira linha: botão "Voltar"
      JButton buttonVoltar = new JButton("Voltar");
      buttonVoltar.setBounds(350, 600, 250, 70); 
      buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
      buttonVoltar.setBackground(new Color(10, 10, 10));
      buttonVoltar.setForeground(Color.WHITE);
      buttonVoltar.setHorizontalAlignment(SwingConstants.CENTER);
      buttonVoltar.setFocusable(false);
      buttonVoltar.setBorder(border);
      add(buttonVoltar);

      setLocationRelativeTo(null); 
      buttonVoltar.addActionListener(this::voltar);
}

public void voltar(ActionEvent actionEvent) {
    new MenuPrincipal();
    dispose(); 
} 



}