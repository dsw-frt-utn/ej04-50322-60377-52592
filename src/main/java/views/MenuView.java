/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author Eliana
 */

import javax.swing.*;

public class MenuView extends JFrame {

    private Controlador controlador;

    public MenuView(Controlador controlador) {
        this.controlador = controlador;

        setTitle("Menú Principal");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("Seleccionar una opción");
        titulo.setBounds(110, 20, 200, 30);
        add(titulo);

        JButton btnListar = new JButton("Listar Vehículos");
        btnListar.setBounds(100, 70, 200, 30);

        JButton btnAgregar = new JButton("Agregar Vehículo");
        btnAgregar.setBounds(100, 120, 200, 30);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(100, 170, 200, 30);

        add(btnListar);
        add(btnAgregar);
        add(btnSalir);

        btnListar.addActionListener(e -> controlador.mostrarLista());

        btnAgregar.addActionListener(e -> controlador.mostrarAltaVehiculoView());

        btnSalir.addActionListener(e -> System.exit(0)); 
    }
}