import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;

public class TelaListarDespesas extends JFrame {

    Border border = BorderFactory.createLineBorder(Color.green, 3);
    DefaultTableModel tableModel;
    JComboBox<String> comboBoxCategoria;

    public TelaListarDespesas() {
        setTitle("Listar Despesas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel labelTitulo = new JLabel("Despesas Cadastradas", SwingConstants.CENTER);
        labelTitulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(labelTitulo, BorderLayout.NORTH);

        JPanel panelTop = new JPanel();
        panelTop.setLayout(new FlowLayout());

        comboBoxCategoria = new JComboBox<>(getCategorias());
        comboBoxCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarDespesasPorCategoria();
            }
        });

        panelTop.add(new JLabel("Selecione a Categoria:"));
        panelTop.add(comboBoxCategoria);
        add(panelTop, BorderLayout.NORTH);

        String[] columnNames = {"Nome", "Valor", "Placa", "Categoria", "Descrição"};
        tableModel = new DefaultTableModel(columnNames, 0);

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JButton buttonVoltar = new JButton("Voltar");
        buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonVoltar.setBackground(new Color(10, 10, 10));
        buttonVoltar.setForeground(Color.WHITE);
        buttonVoltar.setBorder(border);
        buttonVoltar.setFocusable(false);
        buttonVoltar.addActionListener(this::voltar);
        add(buttonVoltar, BorderLayout.SOUTH);

        carregarDespesas(MenuPrincipal.listaDespesas);

        setVisible(true);
    }

    private String[] getCategorias() {

        return MenuPrincipal.listaDespesas.stream()
                .map(Despesa::getCategoria)
                .distinct()
                .toArray(String[]::new);
    }

    private void carregarDespesas(List<Despesa> despesas) {

        tableModel.setRowCount(0);
   
        for (Despesa despesa : despesas) {
            Object[] row = {
                    despesa.getNome(),
                    despesa.getValor(),
                    despesa.getPlaca(),
                    despesa.getCategoria(),
                    despesa.getDescricao()
            };
            tableModel.addRow(row);
        }
    }

    private void filtrarDespesasPorCategoria() {
        String categoriaSelecionada = (String) comboBoxCategoria.getSelectedItem();
        List<Despesa> despesasFiltradas = MenuPrincipal.listaDespesas.stream()
                .filter(d -> d.getCategoria().equals(categoriaSelecionada))
                .collect(Collectors.toList());
        carregarDespesas(despesasFiltradas);
    }

    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose();
    }
}
