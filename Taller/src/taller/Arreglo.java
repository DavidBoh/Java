/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arreglo extends JFrame implements ActionListener{

     JLabel num1, num2, num3, num4, num5, num6;
   JTextField tf1, tf2, tf3, tf4, tf5, tf6, taux1, taux2;
   JButton bt, bt2;
   JTextArea textt;
    
  
    
    Arreglo(){
        this.setLayout(null);
        
        setTitle("Arreglo");
        num1=new JLabel("Primer num");
        num2=new JLabel("Segundo num ");
        num3=new JLabel("Tercer num ");
        num4=new JLabel("Cuarto num ");
        num5=new JLabel("Quinto num ");
        num6=new JLabel("Sexto num ");
        textt=new JTextArea("");
        bt=new JButton("Ordenar");
        tf1=new JTextField(5);
        tf2=new JTextField(5);
        tf3=new JTextField(5);
        tf4=new JTextField(5);
        tf5=new JTextField(5);
        tf6=new JTextField(5);
        
        
         num1.setBounds(50, 30, 100, 25);
         add(num1);
         
         tf1.setBounds(50, 60, 50, 25);
         add(tf1);
         
         num2.setBounds(50, 90, 100, 25);
         add(num1);
         
         tf2.setBounds(50, 120, 50, 25);
         add(tf2);
         
         num3.setBounds(50, 150, 100, 25);
         add(num1);
         
         
         tf3.setBounds(50, 180, 50, 25);
         add(tf3);
         
         num4.setBounds(50, 210, 100, 25);
         add(num1);
         
         tf4.setBounds(50, 240, 50, 25);
         add(tf4);
         
         
         num5.setBounds(50,270, 100, 25);
         add(num1);
         
         tf5.setBounds(50, 300, 50, 25);
         add(tf5);
         
         num6.setBounds(50, 330, 100, 25);
         add(num1);
         
         tf6.setBounds(50, 360, 50, 25);
         add(tf6);
         
         bt.setBounds(50, 390, 100, 25);
         add(bt);
         
         textt.setBounds(200, 30, 400, 400);
        add(textt);
         textt.setEditable(false); 
         
         
       
         bt.addActionListener(this);
         
         
                
        
      
        this.setVisible(true);
      
       this.setSize(700, 600);
        
        
    }
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
         double a=Double.parseDouble(tf1.getText());
        double b=Double.parseDouble(tf2.getText());
        double c=Double.parseDouble(tf3.getText());    
        double d=Double.parseDouble(tf1.getText());
        double d1=Double.parseDouble(tf2.getText());
        double d2=Double.parseDouble(tf3.getText());
        
        
        
       if(e.getSource()==bt){
             int aaa=0;
        double array[] = {a, b, c, d, d1, d2};
        
        for (boolean orden=false;!orden;){
            for (int i=0;i<array.length-1;i++){
                if (array[i]>array[i+1]){
                    
                    double aux=array[i];
                    array[i]=array[i+1];
                    array[i+1]=aux;
                    
                    aaa++;
                }
            }
            
            if (aaa==0){
                orden=true;
            }
            
            aaa=0;
            
        }
            textt.setText("Array ordenada: "+aaa);
    }
    }

    
    
    
       
            
        
    


    }
