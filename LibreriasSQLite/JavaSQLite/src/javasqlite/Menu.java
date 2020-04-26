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
public class Menu extends JFrame implements ActionListener {

    JButton C, R, U, D;
    ImageIcon Crear,Modifi,Leer,Borrar;
    Container cont;

    Menu() {
        this.setTitle("Menu Principal");
        this.setSize(300, 300);
        this.setLayout(null);
        Crear=new ImageIcon("crear.jpg");
        C=new JButton();
        C.setIcon(Crear);
        C.setToolTipText("En esta opción podrá crear nuevos alumnos");
        
        Leer=new ImageIcon("buscar.png");
        R=new JButton();
        R.setIcon(Leer);
        R.setToolTipText("En esta opción podrá consultar los alumnos inscritos");
        
        Modifi=new ImageIcon("editar.png");
        U=new JButton();
        U.setIcon(Modifi);
        U.setToolTipText("En esta opción podrá modificar datos de alumnos");
        
        Borrar=new ImageIcon("borrar.png");
        D=new JButton();
        D.setIcon(Borrar);
        D.setToolTipText("En esta opción podrá eliminar registros de alumnos");
        
        C.setBounds(10,10,100,100);
        R.setBounds(150,10,100,100);
        U.setBounds(10,150,100,100);
        D.setBounds(150,150,100,100);
        add(C);
        add(R);
        add(U);
        add(D);
        
        C.addActionListener(this);
        R.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==C){
        NuevoAlumno N=new NuevoAlumno();        
        }
        if(e.getSource()==R){
        BuscarAlumno B=new BuscarAlumno();        
        }
    }

}
