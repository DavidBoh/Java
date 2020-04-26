/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casagraphic;


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
    
    
    g.setColor(Color.YELLOW);
    g.fillOval(80,60,80,80);
    
    
    g.setColor(Color.BLUE);
    g.drawRect(80,300,400,200);//ESTRUCTURA   
    
    
    g.setColor(Color.red);
    g.fillRect(200,420,40,80);
    g.drawRect(200,420,41,81);//puerta
    
    g.drawRect(420,220,41,81);//chimenea
    g.drawRect(420,220,42,82);
            
            
    for(int i=0;i<300;i++){
        g.drawLine(300, 200, 200+i, 300);
    }
     
    
    g.setColor(Color.red); //ventanas
    g.drawRect(110,360,40,40);
    g.setColor(Color.red);
    g.drawRect(110,360,41,41);
    g.setColor(Color.red);
    g.drawRect(110,360,42,42);
    g.setColor(Color.red);
    g.drawRect(110,360,43,43);
    
    g.setColor(Color.red);
    g.drawRect(190,360,40,40);
    g.drawRect(190,360,41,41);
    g.drawRect(190,360,42,42);
    g.drawRect(190,360,43,43);
    
    g.setColor(Color.red);
    g.drawRect(270,360,40,40);
    g.drawRect(270,360,41,41);
    g.drawRect(270,360,42,42);
    g.drawRect(270,360,43,43);
    
    
    g.setColor(Color.red);
    g.drawRect(350,360,40,40);
    g.drawRect(350,360,41,41);
    g.drawRect(350,360,42,42);
    g.drawRect(350,360,43,43);
    
    g.setColor(Color.red);
    g.drawRect(425,360,40,40);
    g.drawRect(425,360,41,41);
    g.drawRect(425,360,42,42);
    g.drawRect(425,360,43,43);
    
    
    
    g.setColor(Color.black);
    g.fillOval(230, 455, 8, 8);
    
}
    

    
}





