package org.angeldoc.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import org.angeldoc.control.RegistroDatos;
import org.angeldoc.model.producto.Disco;

public class PanelCatalogo extends JPanel {
    private RegistroDatos registro;
    private JTable tablaDiscos;

    public PanelCatalogo(RegistroDatos registro) {
        this.registro = registro;
        configurarPanel();
        initComponents();
    }

    private void configurarPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    private void initComponents() {
        // Título
        JLabel titulo = new JLabel("Catálogo de Discos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        add(titulo, BorderLayout.NORTH);

        // Tabla de discos
        String[] columnNames = {"ID", "Título", "Precio", "Existencia", "Descuento"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Disco disco : registro.getDiscos()) {
            Object[] rowData = {
                    disco.getId(),
                    disco.getTitulo(),
                    String.format("$%.2f", disco.getPrecio()),
                    disco.getExistencia(),
                    String.format("%.2f%%", disco.getDescuento())
            };
            model.addRow(rowData);
        }

        tablaDiscos = new JTable(model);
        tablaDiscos.setFont(new Font("Arial", Font.PLAIN, 14));
        tablaDiscos.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(tablaDiscos);
        add(scrollPane, BorderLayout.CENTER);

        // Botón de regreso
        JButton btnRegresar = new JButton("Regresar al Menú Principal");
        btnRegresar.addActionListener(e -> {
            CardLayout cardLayout = (CardLayout) getParent().getLayout();
            cardLayout.show(getParent(), "menuPrincipal");
        });
        add(btnRegresar, BorderLayout.SOUTH);
    }
}