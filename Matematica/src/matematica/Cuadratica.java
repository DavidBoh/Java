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

public class Cuadratica extends JFrame implements ActionListener{

   JLabel texta, textb, textc, txt, txt2;
   JTextField tf1, tf2, tf3;
   JButton bt, bt2, bt3; 
   
   Cuadratica(){
       setSize(400,600);
       setTitle("Función Cuadrática");
       setLayout(new FlowLayout());
       texta=new JLabel ("Valor de a: ");
       textb=new JLabel ("Valor de b: ");
       textc=new JLabel ("Valor de c: ");        
       txt=new JLabel ("");
       txt2=new JLabel ("");
       tf1=new JTextField(5);
       tf2=new JTextField(5);
       tf3=new JTextField(5);
       bt=new JButton("X1 ");
       bt2=new JButton("X2 " );
       bt3=new JButton("X1 y X2");
       
       bt.addActionListener(this);
       bt2.addActionListener(this);
       bt3.addActionListener(this);
       
       add(texta);
       add(tf1);
       add(textb);
       add(tf2);
       add(textc);
       add(tf3);
       
       add(bt);
       add(bt2);
      
       
       add(txt);
       
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
      
       
   }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ok");
        double a=Double.parseDouble(tf1.getText());
        double b=Double.parseDouble(tf2.getText());
        double c=Double.parseDouble(tf3.getText());
        
        if(e.getSource()==bt){
            double raiz=Math.sqrt(b*b-4*a*c);
            if(raiz<0 || a==0){
                txt.setText("La ecuación no tiene solución real");
            }
            else{
                double X1=(-b+raiz)/(a*2);
                txt.setText("X1= "+X1);
            }
            
        }
        
        else if (e.getSource()==bt2){
            double raiz=Math.sqrt(b*b-4*a*c);
            if(raiz<0 || a==0){
                txt.setText("La ecuación no tiene solución real");
            }
            else{
                double X2=(-b-raiz)/(a*2);
                txt.setText("X2= "+X2);
            }
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
