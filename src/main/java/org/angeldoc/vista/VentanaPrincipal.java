package org.angeldoc.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.angeldoc.control.RegistroDatos;

public class VentanaPrincipal extends JFrame {
    private RegistroDatos registro;
    private JPanel panelPrincipal;
    private CardLayout cardLayout;

    public VentanaPrincipal(RegistroDatos registro) {
        this.registro = registro;
        configurarVentana();
        initComponents();
    }

    private void configurarVentana() {
        setTitle("Sistema de Gestión Musical");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        cardLayout = new CardLayout();
        panelPrincipal = new JPanel(cardLayout);

        // Crear los diferentes paneles
        panelPrincipal.add(crearPanelMenuPrincipal(), "menuPrincipal");
        panelPrincipal.add(new PanelCatalogo(registro), "catalogo");
        panelPrincipal.add(new PanelEstatus(registro), "estatus");

        add(panelPrincipal);
    }

    private JPanel crearPanelMenuPrincipal() {
        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        JButton btnConsola = new JButton("Consola");
        JButton btnVentana = new JButton("Ventana");
        JButton btnSalir = new JButton("Salir");

        // Estilo de los botones
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        btnConsola.setFont(buttonFont);
        btnVentana.setFont(buttonFont);
        btnSalir.setFont(buttonFont);

        btnConsola.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Modo consola seleccionado");
            // Aquí podrías abrir una consola/terminal si lo deseas
        });

        btnVentana.addActionListener(e -> {
            cardLayout.show(panelPrincipal, "catalogo");
        });

        btnSalir.addActionListener(e -> System.exit(0));

        panel.add(btnConsola);
        panel.add(btnVentana);
        panel.add(btnSalir);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroDatos registro = new RegistroDatos();
            // Agregar algunos datos de prueba
            registro.registrarDiscoDePrueba();

            VentanaPrincipal ventana = new VentanaPrincipal(registro);
            ventana.setVisible(true);
        });
    }
}