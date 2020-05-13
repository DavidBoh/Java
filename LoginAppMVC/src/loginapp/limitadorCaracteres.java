/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Christian
 */
public class limitadorCaracteres implements KeyListener {
    
    private JTextComponent componente;
    private int limite; 
    
    public limitadorCaracteres(JTextComponent componente, int limite) {        
        this.componente = componente;
        this.limite = limite;
        this.componente.addKeyListener(this);        
    }

   
    @Override
    public void keyTyped(KeyEvent e) {
        if (componente.getText().length() == limite) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
