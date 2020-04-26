/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author GabeL
 */
public class Inicio extends JFrame implements ActionListener {

    JTextField T;
    JPasswordField P;
    JLabel L1, L2;
    JButton A, B;
    Container cont = null;

    Inicio() {
        this.setTitle("Inicio");
        this.setSize(400, 400);
        this.setLayout(null);

        L1 = new JLabel("Usuario:");
        T = new JTextField();
        L2 = new JLabel("Clave:");
        P = new JPasswordField();
        A = new JButton("Entrar");
        B = new JButton("Borrar");

        L1.setBounds(30, 30, 100, 40);
        T.setBounds(30, 80, 100, 40);
        L2.setBounds(30, 130, 100, 40);
        P.setBounds(30, 180, 100, 40);
        A.setBounds(50, 250, 80, 50);
        B.setBounds(150, 250, 80, 50);
        this.add(L1);
        this.add(T);
        this.add(L2);
        this.add(P);
        this.add(A);
        this.add(B);

        A.addActionListener(this);
        B.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == A) {
            int s;
            BaseDatos Con = new BaseDatos();
            Con.conectar();
            //System.out.println(Con.validarUsuario(T.getText(), P.getText()));

            s = Con.validarUsuario(T.getText(), P.getText());
            if (s == 1) {
                Menu m = new Menu();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario/Clave NO validos");
            }
            Con.cerrar();
        } else if (e.getSource() == B) {
            T.setText("");
            P.setText("");
        }
    }

}
