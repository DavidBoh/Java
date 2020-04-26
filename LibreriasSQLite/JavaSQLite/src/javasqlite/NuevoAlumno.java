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
public class NuevoAlumno extends JFrame implements ActionListener {

    JButton Env, Bor;
    JTextField TNom, TCod, TApe;
    JLabel LNom, LCod, LApe;

    NuevoAlumno() {

        this.setTitle("Crear Alumno");
        this.setSize(400, 400);
        this.setLayout(null);

        LNom = new JLabel("Nombre:");
        LCod = new JLabel("Codigo:");
        LApe = new JLabel("Apellido:");

        TNom = new JTextField();
        TApe = new JTextField();
        TCod = new JTextField();

        Env = new JButton("Guardar");
        Bor = new JButton("Borrar");
        
        LNom.setBounds(30,30,100,30);
        TNom.setBounds(140,30,150,30);
        LApe.setBounds(30,70,100,30);
        TApe.setBounds(140,70,150,30);
        LCod.setBounds(30,110,100,30);
        TCod.setBounds(140,110,150,30);
        
        Env.setBounds(50,150,100,40);
        Bor.setBounds(200,150,100,40);
        this.add(LNom);
        this.add(TNom);
        this.add(LApe);
        this.add(TApe);
        this.add(LCod);
        this.add(TCod);
        this.add(Env);
        this.add(Bor);
        Env.addActionListener(this);
        Bor.addActionListener(this);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Env){
        int s;
            BaseDatos Con = new BaseDatos();
            Con.conectar();

            s = Con.guardaDatos(TNom.getText(), TCod.getText(), TApe.getText());
            if (s == 1) {
                JOptionPane.showMessageDialog(null, "Guardado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Problema al guardar");
            }
            Con.cerrar();
        }
        else if(e.getSource()==Bor){
        TNom.setText("");
        TCod.setText("");
        TApe.setText("");
        }
    }

}
