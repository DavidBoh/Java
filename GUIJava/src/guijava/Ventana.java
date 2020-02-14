
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.pow;

/**
 *
 * @author Estudiante
 */

public class Ventana extends JFrame implements ActionListener{
    JLabel La, Lb, Lr; 
    JTextField ta, tb; 
    JButton bt, bt2, bt3, bt4, bt5, bt6, bt7; 
    
    Ventana(){
        setSize(200,300);
        setTitle("Sumador");
        setLayout(new FlowLayout());
        La=new JLabel("Número a: ");
        Lb=new JLabel("Número b: ");
        Lr=new JLabel("");
        ta=new JTextField(5);
        tb=new JTextField(5);
        bt=new JButton("Sumar");
        bt2=new JButton("Restar");
        bt3=new JButton("Multiplicar");
        bt4=new JButton("Dividir");
        bt5=new JButton("Porcentaje");
        bt6=new JButton("Potencia");
        bt7=new JButton("Raiz cuadrada");
        
        bt.addActionListener(this);
        bt2.addActionListener(this);
         bt3.addActionListener(this);
          bt4.addActionListener(this);
         bt5.addActionListener(this);
         bt6.addActionListener(this);
         bt7.addActionListener(this);
        add(La);
        add(ta);
        add(Lb);
        add(tb);
                
        
        add(bt);
         add(bt2);
          add(bt3);
          add(bt4);
          add(bt5);
          add(bt6);
          add(bt7);
          
        add(Lr);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        
    }

    @Override
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK");
        double a=Double.parseDouble(ta.getText());
        double b=Double.parseDouble(tb.getText());
        double r=0;
        double r2=0;
        
        if (e.getSource()==bt){
            r=a+b;
              Lr.setText(""+r);
        }
        else if(e.getSource()==bt2){
            r=a-b;
              Lr.setText(""+r);
        }
        else if(e.getSource()==bt3){
            r=a*b;
              Lr.setText(""+r);
        }
        
        else if(e.getSource()==bt4){
            if(b==0){
                Lr.setText("Error");
            }
            else {
                r=a/b;
                  Lr.setText(""+r);
            }
        }
        
        else if (e.getSource()==bt5){
        r=a*b/100;
        r2=a-r;
        Lr.setText("El "+b+" % de "+a+" es igual a "+r+" || "+a+" menos "+b+" % es igual a "+r2);
    }
        else if (e.getSource()== bt6){
            r=Math.pow(a,b);
            Lr.setText("Siendo "+a+" la base, y "+b+" el exponente, la respuesta es "+r);
        }
        
        else if(e.getSource()==bt7){
            r=Math.pow((double)a,1/(double)2);
            r2=Math.pow((double)b,1/(double)2);
            Lr.setText("La raíz cuadrada de "+a+" es igual a "+r+" || La raiz cuadrada de "+b+" es igual a "+r2);      
        }
      
    }
    
    
}