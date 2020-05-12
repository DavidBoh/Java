/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BDRegistro;
import Vista.VentanaRegistro;
import Hash.Sha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import loginapp.ControlLogin;
import loginapp.ModeloLogin;
import loginapp.VistaLogin;

/**
 *
 * @author Christian
 */
public class ControlRegistro implements ActionListener {

    private VentanaRegistro ventanaR;
    private BDRegistro bdRegistro;
    private Sha seguridad = new Sha();
    private ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();

    public ControlRegistro(VentanaRegistro vr, BDRegistro bd) {
        this.ventanaR = vr;
        this.bdRegistro = bd;

        ventanaR.botonRegistrar.addActionListener(this);
        ventanaR.botonCerrar.addActionListener(this);
        ventanaR.regresarx.addActionListener(this);

        limiteCaracteres(ventanaR);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==ventanaR.regresarx){
            ventanaR.dispose();
            
            VistaLogin v1= new VistaLogin();
            ModeloLogin m1= new ModeloLogin();
            ControlLogin c1= new ControlLogin(m1,v1);
            
        }

        if (ae.getSource() == ventanaR.botonRegistrar) {
            bdRegistro.conectar();
            ingresarUsuario(ventanaR, bdRegistro);
            bdRegistro.cerrar();
            
        }
        if (ae.getSource() == ventanaR.botonCerrar) {
            System.exit(0);
        }
    }

    private void ingresarUsuario(VentanaRegistro ventana, BDRegistro datos) {
        if (!"".equals(ventana.tIdentificacion.getText())) {
            if (datos.confirmarU(ventana.tIdentificacion.getText())) {
                char[] ar = ventana.pContra.getPassword();
                StringBuilder builder = new StringBuilder();
                for (char s : ar) {
                    builder.append(s);
                }
                String str = builder.toString();
                if (str.length() > 5) {
                    datos.guardaDatos(
                            ventana.JCombotipoIdentificacion.getSelectedIndex() + 1,
                            ventana.tNombre.getText(),
                            ventana.tApellido.getText(),
                            ventana.tIdentificacion.getText(),
                            ventana.tCorreo.getText(),
                            str);
                } else {
                    JOptionPane.showMessageDialog(null, "Clave debe ser mayor a 5 caracteres");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ya Existe");
                ventana.gettNombre().setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Datos");
        }
    }

    /*
    *   Limite de caracteres en los campos de texto tomando el Componente como primer parámetro
    *   y el límite de caracteres que tendrá en el segundo parámetro     
     */
    private void limiteCaracteres(VentanaRegistro vt) {
        limitadores.add(new limitadorCaracteres(vt.tNombre, 10));
        limitadores.add(new limitadorCaracteres(vt.tApellido, 10));
        limitadores.add(new limitadorCaracteres(vt.tIdentificacion, 10));
        limitadores.add(new limitadorCaracteres(vt.tCorreo, 30));
        limitadores.add(new limitadorCaracteres(vt.pContra, 10));
    }
}