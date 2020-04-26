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

public class Añadir extends JFrame implements ActionListener  {
    
    
     JMenu a,b,c,tam,d;
    JMenuBar barra;
    
    JMenuItem a1,a2,a3;
    
    JLabel  npro,nopro,fein, feven, tipro, marpro, copro,impor, valor, observa;
    JTextField  tnpro,tnopro,tfein,tfeven,ttipro,tmarpro,tcopro,timpor,tvalor;
   
    JButton guarda, consulta;
    
    ButtonGroup grup;
    JTextArea campo;
    JScrollPane panel;
    
    Añadir(){
        
      setSize(800,600);
      setLayout(null);
      setTitle("Añadir a Inventario");
      
      npro=new JLabel("Número producto: ");
      tipro=new JLabel("Tipo de producto: ");
      nopro=new JLabel("Nombre : ");
      marpro=new JLabel("Marca: ");
      
      fein=new JLabel("Fecha ingreso: ");
      feven=new JLabel("Fecha vencimiento (si aplica): ");
      copro=new JLabel("Código producto: ");
      impor=new JLabel("Importado por: ");
      valor=new JLabel("Valor unidad: ");
      observa=new JLabel("Observaciones adicionales: ");
      
      
      tnpro=new JTextField();
      ttipro=new JTextField();
      tnopro=new JTextField();
      tmarpro=new JTextField();
      tfein=new JTextField();
      tfeven=new JTextField();
      tcopro=new JTextField();
      timpor=new JTextField();
      tvalor=new JTextField();
     
      barra=new JMenuBar();
      a=new JMenu("Archivo");
      
      a1=new JMenuItem("Volver");
      a2=new JMenuItem("Cerrar");
      
       a.add(a1);  
       a.add(a2);
     
      
      barra.add(a);
      
      setJMenuBar(barra);
      
      observa.setBounds(450,90,250,25);
      this.add(observa);
      
      campo=new JTextArea(20,50);
      panel=new JScrollPane(campo);
      this.add(panel);
      panel.setBounds(450,120,200,200);
      
    
    
      guarda=new JButton("Guardar");
      consulta=new JButton("Consultar Base");
      
     
      guarda.setBounds(250,400,150,50);
      this.add(guarda);
      
     
      npro.setBounds(20, 90, 150, 25);
      this.add(npro);
      
      tnpro.setBounds(200, 90,200,25);
      this.add(tnpro);
      
      
      tipro.setBounds(20, 120, 150,25);
      this.add(tipro);
      
      ttipro.setBounds(200,120,200,25);
      this.add(ttipro);
      
      nopro.setBounds(20, 150, 150,25);
      this.add(nopro);
      
      tnopro.setBounds(200, 150, 200,25);
      this.add(tnopro);
        
      marpro.setBounds(20, 180, 150,25);
      this.add(marpro);
      
      tmarpro.setBounds(200,180,200,25);
      this.add(tmarpro);
      
      fein.setBounds(20, 210, 150,25);
      this.add(fein);
      
      tfein.setBounds(200, 210, 200,25);
      this.add(tfein);
      
      feven.setBounds(20, 240,250,25);
      this.add(feven);
      
      tfeven.setBounds(200,240,200,25);
      this.add(tfeven);
      
      copro.setBounds(20,270,250,20);
      this.add(copro);
      
      tcopro.setBounds(200,270,200,25);
      this.add(tcopro);
      
      impor.setBounds(20,300,200,25);
      this.add(impor);
      
      timpor.setBounds(200,300,200,25);
      this.add(timpor);
      
      valor.setBounds(20,330,200,25);
      this.add(valor);
      
      tvalor.setBounds(200,330,200,25);
      this.add(tvalor);
      
      a1.addActionListener(this);
      guarda.addActionListener(this);
      
      this.setVisible(true);
      this.setDefaultCloseOperation(3);  
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a1) {
            new Productos();
        }
        
        if (e.getSource() == guarda) {
            int s;
           
           
            conectar();

            s = guardaDatos(tnpro.getText(), tnopro.getText(), tfein.getText(), tfeven.getText(), ttipro.getText(), tmarpro.getText(), tcopro.getText(), timpor.getText(), tvalor.getText(), campo.getText());
         
          
            
            if (s == 1) {
                JOptionPane.showMessageDialog(null, "Guardado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Problema al guardar");
            }
            cerrar();
            
        }
        
    }
    
     String url= "C:\\Users\\David\\Desktop\\inventario.db";
    Connection connect;
    
       public void conectar(){
        try{
            connect=DriverManager.getConnection(
            "jdbc:sqlite:"+url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        }catch (SQLException ex){
                System.err.println("No se ha podido conectar a la base \n"+ex.getMessage());
                }
            
        }
        
    public void cerrar(){
        try{
            connect.close();
            System.out.println("Exito al cerrar conexion");
         }catch(SQLException ex){
             System.out.println("Error al cerrar conexion\n"+ex.getMessage());
         }
    }
    
    public void Salir(){
    System.exit(0);
    }
    
    
    public int guardaDatos(String num, String tip, String nom, String mar, String fechi, String fechven, String cod, String imp, String val, String obs){
         int estado;
         try {
             PreparedStatement st=
                     connect.prepareStatement
           ("insert into inventario (numero_producto, tipo_producto, nombre, marca, fecha_ing, fecha_ven, codigo, importado, valor, observa) values (?,?,?,?,?,?,?,?,?,?)");
             st.setString(1, num);
             st.setString(2, tip);
             st.setString(3, nom);
             st.setString(4, mar);
             st.setString(5, fechi);
             st.setString(6, fechven);
             st.setString(7, cod);
             st.setString(8, imp);
             st.setString(9, val);
             st.setString(10,obs);
             st.execute();
             estado = 1;
             
             
       }catch (SQLException ex){
                        System.err.println(ex.getMessage());
                        
                        estado=0;
        }
                
               
        return estado;
        
    }
    
    
}
