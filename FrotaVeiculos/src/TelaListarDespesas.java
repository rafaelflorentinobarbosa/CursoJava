import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaListarDespesas extends JFrame {

    Border border = BorderFactory.createLineBorder(Color.green, 3);

    public TelaListarDespesas() {
        setTitle("Listar Despesas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); // Usando BorderLayout para melhor organização

        // Título
        JLabel labelTitulo = new JLabel("Despesas Cadastradas", SwingConstants.CENTER);
        labelTitulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(labelTitulo, BorderLayout.NORTH);

        // Tabela de despesas
        String[] columnNames = {"Nome", "Valor", "Placa", "Categoria", "Descrição"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        for (Despesa despesa : MenuPrincipal.listaDespesas) {
            Object[] row = {
                despesa.getNome(),
                despesa.getValor(),
                despesa.getPlaca(),
                despesa.getCategoria(),
                despesa.getDescricao()
            };
            tableModel.addRow(row);
        }

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Botão Voltar
        JButton buttonVoltar = new JButton("Voltar");
        buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonVoltar.setBackground(new Color(10, 10, 10));
        buttonVoltar.setForeground(Color.WHITE);
        buttonVoltar.setBorder(border);
        buttonVoltar.setFocusable(false);
        buttonVoltar.addActionListener(this::voltar);
        add(buttonVoltar, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose();
    }
}