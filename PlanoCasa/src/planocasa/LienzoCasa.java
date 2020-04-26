/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocasa;

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

public class LienzoCasa extends Canvas
{

LienzoCasa(){
this.setSize(600,600);
this.setBackground(Color.WHITE);
}


public void paint (Graphics g){
    
    g.setColor(Color.black);
    
    g.setFont(new Font("Arial",Font.BOLD,10));
    g.drawString("HABITACION PRINCIPAL", 30, 80);
    
    g.setFont(new Font("Arial",Font.BOLD,10));
    g.drawString("COCINA", 300, 80);
    
    g.setFont(new Font("Arial",Font.BOLD,10));
    g.drawString("BAÑO 2", 30, 160);
    
    g.setFont(new Font("Arial",Font.BOLD,10));
    g.drawString("ESTUDIO", 50, 230);
    
    g.setFont(new Font("Arial",Font.BOLD,10));
    g.drawString("SALA-COMEDOR", 200, 180);
    
    
    g.setColor(Color.black);
    g.drawRect(20,20,350,250);//rect main
    g.drawRect(20,140,80,30);//rect baño2
    
    g.drawRect(20,170,150,100);//rect estudio
    
    
    g.drawLine(360,200,370,200);//pequeña
    
    g.setColor(Color.white);
    g.drawLine(20,40,20,100);//ventana
    
    g.drawLine(170,180,170,210);//puertaestudio
    
    g.drawLine(20,180,20,250);
    
    g.drawLine(285,260,360,200);   
    
    g.setColor(Color.black);
    g.drawLine(285,270,285,260);//peque2 horizontal
    
    g.drawOval(30,160,20,20);
   
    
    
    g.drawLine(250,110,340,110);// cocina1 horizontal
    g.drawLine(250,20,250,110);//cocina2 vertical
    g.drawLine(200,20,200,110);//div baño escalera
    
    g.setColor(Color.white);
    g.drawLine(285,270,370,270);//diagonal
    
    g.drawLine(200,270,250,270);//puerta
    
    g.drawLine(370,270,370,200);//diag2
    
    
    
    
    
    
    
}
    

    
}
