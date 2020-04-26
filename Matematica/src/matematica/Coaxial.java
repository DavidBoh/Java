/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.pow;


/**
 *
 * @author Estudiante
 */
public class Coaxial extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JTextField tf1, tf2;
    JButton bt;
    
    Coaxial (){
        setSize(200,300);
        setTitle("Coaxial");
        setLayout(new FlowLayout());
        l1=new JLabel("D");
        l2=new JLabel("d");
        l3=new JLabel("");
        
        tf1=new JTextField(5);
        tf2=new JTextField(5);
        
        bt=new JButton("Resultado");
        
        bt.addActionListener(this);
        
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(bt);
        
        add (l3);
        
         setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK");
        double D=Double.parseDouble(tf1.getText());
        double d=Double.parseDouble(tf2.getText());
        
        
        if(e.getSource()==bt){
             if(d==0){
                l3.setText("Valor inválido");
            }
             
        double z=138*(Math.log10(D/d));
        
            l3.setText("Z = "+z+" Ohmios");
            
             
        }
         
                
        
           
        

    }
    
}
