/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.limitadorCaracteres;
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

            limitadores.get(3).comprobarCorreo();
            ingresarUsuario(ventanaR, bdRegistro);
       
            
        }
        if (ae.getSource() == ventanaR.botonCerrar) {
            System.exit(0);
        }
    }

    /*
    *   Limite de caracteres en los campos de texto tomando el Componente como primer parámetro
    *   ,el límite de caracteres que tendrá en el segundo parámetro     
    *   y el tipo de restriccion de caracteres en el tercero
     */
    private void limiteCaracteres(VentanaRegistro vt) {
        limitadores.add(new limitadorCaracteres(vt.tNombre, 10,1));
        limitadores.add(new limitadorCaracteres(vt.tApellido, 10,1));
        limitadores.add(new limitadorCaracteres(vt.tIdentificacion, 10,2));
        limitadores.add(new limitadorCaracteres(vt.tCorreo, 50,3));
        limitadores.add(new limitadorCaracteres(vt.pContra, 15,4));
    }

    private void ingresarUsuario(VentanaRegistro ventana, BDRegistro datos) {

        if (!ventana.tNombre.getText().isEmpty()
                && !ventana.tApellido.getText().isEmpty()
                && !ventana.tIdentificacion.getText().isEmpty()
                && !ventana.tCorreo.getText().isEmpty()
                && ventana.pContra.getPassword().length > 0) {
            try {
                int identificacion = Integer.parseInt(ventana.tIdentificacion.getText());
                if (datos.confirmarU(identificacion)) {
                    char[] ar = ventana.pContra.getPassword();
                    StringBuilder builder = new StringBuilder();
                    for (char s : ar) {
                        builder.append(s);
                    }
                    String str = builder.toString();
                    String clave = seguridad.get_SHA_256_SecurePassword(str);
                    if (str.length() > 4) {
                        bdRegistro.conectar();
                        datos.guardaDatos(
                                ventana.JCombotipoIdentificacion.getSelectedIndex() + 1,
                                ventana.tNombre.getText(),
                                ventana.tApellido.getText(),
                                identificacion,
                                ventana.tCorreo.getText(),
                                clave);
                        bdRegistro.cerrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Clave debe ser mayor a 4 caracteres");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ya Existe");
                    ventana.gettNombre().setText("");
                }//Fin Comprobacion campo identificacion
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "El campo identificación debe llevar sólo números");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Datos");
        }
    }
}