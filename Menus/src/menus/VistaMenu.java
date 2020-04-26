/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author misaelinux
 */
public class VistaMenu extends JFrame{
    JMenu a,b,c,tam,d;
    JMenuBar barra; 
/* 
  JMenuBar= file, edit, view, etc. en este caso 4 menu 
    JMenuItem los que se despliegan en el menu, y que lo componen
    */
    
    
    JMenuItem a1,a2,a3,a4,b1,b2,b3,c1,c2,c3,d1,m10,m12,m14,m16,m20;
    
    JTextArea T1;
    
    VistaMenu(){
    setTitle("");
    setSize(600,400);
    setLayout(null);
    T1=new JTextArea(20,100);
    barra=new JMenuBar();
    a=new JMenu("Archivo");
    b=new JMenu("Fuentes");
    c=new JMenu("Colores");
    tam=new JMenu ("Tamaños fuente");
    d=new JMenu("Acerca de");
    
    a1=new JMenuItem("Abrir");
    a2=new JMenuItem("Reiniciar");
    a3=new JMenuItem("Cerrar");
    a4=new JMenuItem("Guardar");
    b1=new JMenuItem("Arial");
    b2=new JMenuItem("Times New Roman");
    b3=new JMenuItem("Calibri");
    c1=new JMenuItem("Negro");
    c2=new JMenuItem("Verde");
    c3=new JMenuItem("Azul");
    d1=new JMenuItem("Acerca de...");
    m10=new JMenuItem(" 10 ");
    m12=new JMenuItem(" 12 ");
    m14=new JMenuItem(" 14 ");
    m16=new JMenuItem(" 16 ");
    m20=new JMenuItem(" 20 ");
    
    a.add(a1);  //añadiendo items que se despliegan, los JMenuItem.
    a.add(a2);
    a.add(a3);
    a.add(a4);
    b.add(b1);
    b.add(b2);
    b.add(b3);
    c.add(c1);
    c.add(c2);
    c.add(c3);
    d.add(d1);
    
    tam.add(m10);
    tam.add(m12);
    tam.add(m14);
    tam.add(m16);
    tam.add(m20);
    
    barra.add(a);
    barra.add(b);
    barra.add(c);
    barra.add(tam);
    barra.add(d);
    setJMenuBar(barra);
    T1.setBounds(0,0,600,400); //textarea del tamaño de la ventana
    this.add(T1);
    
    
    }
    
}
