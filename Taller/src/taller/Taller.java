/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Taller extends JFrame implements ActionListener {
    
    JButton Formulario, Formula, Arreglo;
   
    
    

   
    public static void main(String[] args) {
        
        new Taller();
        
        
        
    }
    
    Taller()
    {
       this.setLayout(null);
       
       setTitle("Taller");
       
      
       Formulario= new JButton("Formulario");
       Formula= new JButton("Fórmula");
       Arreglo= new JButton("Arreglo");
      
       
       Formulario.setBounds(50, 30, 100, 50);
       this.add(Formulario);
       Formula.setBounds(50, 100, 100, 50);
       this.add(Formula);
       Arreglo.setBounds(50, 170, 100, 50);
       this.add(Arreglo);
       
       Formulario.addActionListener(this);
       Formula.addActionListener(this);
       Arreglo.addActionListener(this);
       
       
       
       
      this.setVisible(true);
       this.setSize(250, 400);
       
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       
         
        if(e.getSource()==Formulario){
        Formulario r=new Formulario();    
        }
        else if(e.getSource()==Formula){
        Formula r2=new Formula();
        }
        else if(e.getSource()==Arreglo){
        Arreglo r3=new Arreglo();
        }
    
        
    }
    
}
