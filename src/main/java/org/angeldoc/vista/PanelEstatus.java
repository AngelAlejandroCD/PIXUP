package org.angeldoc.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.angeldoc.control.RegistroDatos;

public class PanelEstatus extends JPanel {
    private RegistroDatos registro;

    public PanelEstatus(RegistroDatos registro) {
        this.registro = registro;
        configurarPanel();
        initComponents();
    }

    private void configurarPanel() {
        setLayout(new GridLayout(4, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
    }

    private void initComponents() {
        JLabel titulo = new JLabel("Menú de Estatus", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        add(titulo);

        JButton btnAlta = new JButton("Alta");
        JButton btnBaja = new JButton("Baja");
        JButton btnRegresar = new JButton("Regresar");

        // Estilo de los botones
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        btnAlta.setFont(buttonFont);
        btnBaja.setFont(buttonFont);
        btnRegresar.setFont(buttonFont);

        btnAlta.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Funcionalidad de Alta seleccionada");
            // Aquí podrías abrir un diálogo para dar de alta
        });

        btnBaja.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Funcionalidad de Baja seleccionada");
            // Aquí podrías abrir un diálogo para dar de baja
        });

        btnRegresar.addActionListener(e -> {
            CardLayout cardLayout = (CardLayout) getParent().getLayout();
            cardLayout.show(getParent(), "menuPrincipal");
        });

        add(btnAlta);
        add(btnBaja);
        add(btnRegresar);
    }
}