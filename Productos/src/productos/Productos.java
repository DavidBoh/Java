/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.KeyStroke;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Pc1
 */
public class Productos extends JFrame implements ActionListener {
 
    
    JLabel Titulo, Lserifa, Lresponsable, Lvalor, Lmensaje;
    
    JTextArea T1, T2;
    
    JButton guarda, borra, consulta, añadir, consultar;
    
    JMenu a,b,c,tam,d;
    JMenuBar barra;
    
    JMenuItem a1,a2,a3;
    
    
    Productos(){
        
        setTitle("Inventarios");
        setLayout(null);
        setSize(500,400);
        
        añadir = new JButton("AÑADIR A INVENTARIO");
        consultar= new JButton("CONSULTAR INVENTARIO");

        Titulo = new JLabel("Control de inventarios");
      
        
        añadir.setBounds(150, 150, 180, 50);
        consultar.setBounds(150,210, 180,50);
        
        Titulo.setBounds(130, 80, 500, 50);
        Titulo.setFont(new Font("Calibri", Font.PLAIN,26));
        
         barra=new JMenuBar();
           a=new JMenu("Archivo");
           
      
         a1=new JMenuItem("Volver");
         a2=new JMenuItem("Cerrar");
        
      
           a.add(a1);  
          a.add(a2);
        
          
           barra.add(a);
      
      setJMenuBar(barra);
      
        this.add(Titulo);
        this.add(añadir);
        this.add(consultar);
        
        a2.addActionListener(this);
         a1.addActionListener(this);
        
        añadir.addActionListener(this);
        consultar.addActionListener(this);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
       
    }
    
    
    
    
    
    public static void main(String[] args) {
        new Productos();
    }

    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == añadir) {
            new Añadir();
            setVisible(false);
        }
       if (e.getSource() == consultar) {
            new Consultar();
        }
        
        
        
    }
    
}
