/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class limitadorCaracteres implements KeyListener, DocumentListener {

    private JTextComponent componente;
    private int limite;
    private int restringeCaracter;

    public limitadorCaracteres(JTextComponent componente, int limite, int restringeCaracter) {
        this.componente = componente;
        this.limite = limite;
        this.restringeCaracter = restringeCaracter;
        this.componente.addKeyListener(this);
        //this.componente.getDocument().addDocumentListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (componente.getText().length() == limite) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Limite Alcanzado");
        }
        switch (restringeCaracter) {
            case 1:
                restringeCaracteres(e);
                break;
            case 2:
                soloNumerico(e);
                break;
            case 3:
                caracteresCorreo(e);
                break;
            case 4:
                caracteresContrasena(e);
                break;
            default:
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }

    private void restringeCaracteres(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 64
                || e.getKeyChar() >= 91 && e.getKeyChar() <= 96
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 208
                || e.getKeyChar() >= 210 && e.getKeyChar() <= 240
                || e.getKeyChar() >= 242 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "No se permiten caracteres especiales o números");
        }
    }

    private void soloNumerico(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }

    private void caracteresCorreo(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 44
                || e.getKeyChar() == 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 63
                || e.getKeyChar() >= 65 && e.getKeyChar() <= 94
                || e.getKeyChar() == 96                
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Caracter Inválido");

        }
    }
    
    private void caracteresContrasena(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 44
                || e.getKeyChar() == 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 63
                || e.getKeyChar() >= 91 && e.getKeyChar() <= 94
                || e.getKeyChar() == 96                
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Caracter Inválido");

        }
    }
    
    

    public boolean printerError(KeyEvent e) {
        boolean error = true;
        String s = componente.getText();
        String errors = s.replaceAll("[:->]", "").replaceAll("\"", "s");
        if (errors.length() != s.length()) {
            error = false;
        }
        //return "" + errors + " " + errors.length() + "/" + s.length();        
        return error;
    }

    public boolean comprobarCorreo() {
        boolean bandera = true;
        // Patrón para validar el email

        Pattern pattern = Pattern.compile("([a-z0-9-\\+])+(\\.[a-z0-9-]+)*@"
                + "[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$");

        // El email a validar
        String email = componente.getText();

        Matcher mather = pattern.matcher(email);

        if (mather.find() != true) {
            JOptionPane.showMessageDialog(null, "Caracter Inválido");
        }
        return bandera;
    }

    public JTextComponent getComponente() {
        return componente;
    }

}