/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;


import java.awt.event.*;
import static java.lang.Math.pow;
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Pc1
 */
public class Formulario extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField tf1,tf2,tf3,tf4,tf5, tf6,tf7;
    JButton btt;
    JTextArea txtt;
    
    Formulario() {
        this.setLayout(null);
       
       setTitle("Formulario");
       
       l1=new JLabel("Nombre ");
       tf1=new JTextField(5);
       l2=new JLabel("Apellido ");
       tf2=new JTextField(5);
       l3=new JLabel("Cedula ");
       tf3=new JTextField(5);
       l4=new JLabel("Dirección ");
       tf4=new JTextField(5);
       l5=new JLabel("Universidad ");
       tf5=new JTextField(5);
       l6=new JLabel("EPS ");
       tf6=new JTextField(5);
       l7=new JLabel("Estado civil ");
       tf7=new JTextField(5);
       txtt=new JTextArea("");
       btt=new JButton("Enviar");
    
       
      l1.setBounds(50, 30, 100, 25);
      add(l1);
      
      tf1.setBounds(50, 60, 100, 25);
      add(tf1);
      
      l2.setBounds(50, 90, 100, 25);
      add(l2);
      
     tf2.setBounds(50, 120, 100, 25);
      add(tf2);
      
      l3.setBounds(50, 150, 100, 25);
      add(l3);
      
     tf3.setBounds(50, 180, 100, 25);
      add(tf3);
      
      l4.setBounds(50, 210, 100, 25);
      add(l4);
      
     tf4.setBounds(50, 240, 100, 25);
      add(tf4);
      
      l5.setBounds(50,270, 100, 25);
      add(l5);
      
    tf5.setBounds(50, 300, 100, 25);
      add(tf5);
      
      l6.setBounds(50, 330, 100, 25);
      add(l6);
      
      tf6.setBounds(50, 360, 100, 25);
      add(tf6);
      
      l7.setBounds(50, 390, 100, 25);
      add(l7);
      
    tf7.setBounds(50, 420, 100, 25);
      add(tf7);
      
      btt.setBounds(50, 470, 100, 50);
      add(btt);
      
      
       
      txtt.setBounds(200, 30, 400, 400);
      add(txtt);
     txtt.setFont(new Font("Serif",Font.PLAIN, 18));
      txtt.setEditable(false); 
      
     btt.addActionListener(this);
       
       
        
      this.setVisible(true);
       this.setSize(700, 600);
       
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        
    }
    
    
    
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       System.out.println("OK");
       
      String a=tf1.getText();
      String b=tf2.getText();
      String c=tf3.getText();
      String d=tf4.getText();
      String d1=tf5.getText();
      String f=tf6.getText();
      String g=tf7.getText();
       
               
        if(e.getSource()==btt){
            txtt.setText(
                    "Su nombre es "+a+"\n"+
                  
                    "Su apellido es "+b+"\n"+
                    "Su cédula es "+c+"\n"+
                    "Su dirección es "+d+"\n"+
                    "Su Universidad es "+d1+"\n"+
                    "Su EPS es "+f+ "\n"+
                    "Su estado civil es " +g+"\n");     
                     
        }
            
            
            
            
     
          
    }
    
}
