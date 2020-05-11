/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BDRegistro;

import Vista.VentanaRegistro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class ControlRegistro implements ActionListener, KeyListener {

    private VentanaRegistro ventanaR;
    private BDRegistro bdRegistro;

    public ControlRegistro(VentanaRegistro vr, BDRegistro bd) {
        this.ventanaR = vr;
        this.bdRegistro = bd;
        ventanaR.botonRegistrar.addActionListener(this);
        ventanaR.botonCerrar.addActionListener(this);
        ventanaR.gettNombre().addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == ventanaR.botonRegistrar) {
            //bdRegistro.conectar();
            //ingresarUsuario(ventanaR, bdRegistro);
            //bdRegistro.cerrar();
        }
        if (ae.getSource() == ventanaR.botonCerrar) {
            System.exit(0);
        }
    }

    private void ingresarUsuario(VentanaRegistro ventana, BDRegistro datos) {
        if (datos.confirmarU(ventana.gettNombre().getText()) && !"".equals(ventana.gettNombre().getText())) {
            char[] ar = ventana.pContra.getPassword();
            StringBuilder builder = new StringBuilder();
            for (char s : ar) {
                builder.append(s);
            }
            String str = builder.toString();
            datos.guardaDatos(
                    ventana.JCombotipoIdentificacion.getSelectedIndex() + 1,
                    ventana.tNombre.getText(),
                    ventana.tApellido.getText(),
                    ventana.tIdentificacion.getText(),
                    ventana.tCorreo.getText(),
                    str);
        } else {
            if ("".equals(ventana.gettNombre().getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Datos");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ya Existe");
                ventana.gettNombre().setText("");
            }
        }
    }

    /*
    *Limite de caracteres en los campos de texto     
     */
    @Override
    public void keyTyped(KeyEvent e) {
        if (ventanaR.gettNombre().getText().length() >= 10) {
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
