/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;



import javax.swing.*;

public class Menu extends JFrame {

    public Menu() {
        setTitle("Menú Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton btnListar = new JButton("Listar Vehículos");
        btnListar.setBounds(50, 40, 200, 30);

        JButton btnAgregar = new JButton("Agregar Vehículo");
        btnAgregar.setBounds(50, 90, 200, 30);

        add(btnListar);
        add(btnAgregar);

        btnListar.addActionListener(e -> {
            new ListarVehiculosView().setVisible(true);
        });

        btnAgregar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Pantalla no implementada");
        });
    }
}