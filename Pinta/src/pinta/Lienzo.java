


package pinta;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author ESTUDIANTE
 */

/*
Rotacion, escalamiento, translacion(viejo error de windows), pantallas. 
*/

public class Lienzo extends Canvas
{

Lienzo(){
this.setSize(600,600);
this.setBackground(Color.white);
}


public void paint (Graphics g){
    
    
    g.setColor(Color.red);
    g.drawLine(00,00,600,600);//LINEA
    
    g.setColor(Color.BLUE);
    g.drawRect(70,50,300,400);//RECTANGULO, CIRCULO
    
    g.setColor(Color.ORANGE);
    g.drawOval(100, 100, 400, 400); //CIRCULO, OVALO, segundo ancho y largo son diferentes
    
    g.setFont(new Font("Arial",Font.BOLD,40));
    g.drawString("AYYY LMAO", 300, 40);
    
    
    
    g.setColor(Color.GREEN);
    
    g.drawOval(400, 70, 150, 200);
    g.drawOval(430, 120, 35, 50);
    
   
    
    g.drawOval(490, 120, 35, 50);
    g.drawArc(420, 100, 120, 130, 200, 140);
    
}
    

    
}





