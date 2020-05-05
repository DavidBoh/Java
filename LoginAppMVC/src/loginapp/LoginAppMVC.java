/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

/**
 *
 * @author herrboh
 */
public class LoginAppMVC {
    
     public static void main(String[] args) {
       
        VistaLogin v1= new VistaLogin();
        ModeloLogin m1= new ModeloLogin();
        ControlLogin c1= new ControlLogin(m1,v1);
    
        
    }
    
}
