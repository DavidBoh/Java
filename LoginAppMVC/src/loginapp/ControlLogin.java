/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author herrboh
 */
public class ControlLogin implements ActionListener {
    
    VistaLogin v;
    ModeloLogin m;
    
    ControlLogin(ModeloLogin mod, VistaLogin vis){
        v=vis;
        m=mod;
              
        v.buttonx1.addActionListener(this);
        v.buttonx2.addActionListener(this);
        v.buttonx3.addActionListener(this);
        v.buttonx4.addActionListener(this);
        v.buttonx5.addActionListener(this);
        v.buttonx6.addActionListener(this);
        v.buttonx7.addActionListener(this);
        v.buttonx8.addActionListener(this);
        v.buttonx9.addActionListener(this);
        v.buttonx0.addActionListener(this);
        
        v.buttonxok.addActionListener(this);
        v.buttonxcancel.addActionListener(this);
        
        v.botonCerrar.addActionListener(this);
        
        v.buttonxA.addActionListener(this);
        v.buttonxB.addActionListener(this);
        v.buttonxC.addActionListener(this);
        v.buttonxD.addActionListener(this);
        v.buttonxE.addActionListener(this);
        v.buttonxF.addActionListener(this);
        v.buttonxG.addActionListener(this);
        v.buttonxH.addActionListener(this);
        v.buttonxI.addActionListener(this);
        v.buttonxJ.addActionListener(this);        
        v.buttonxK.addActionListener(this);
        v.buttonxL.addActionListener(this);
        v.buttonxM.addActionListener(this);
        v.buttonxN.addActionListener(this);
        v.buttonxO.addActionListener(this);
        v.buttonxP.addActionListener(this);
        v.buttonxQ.addActionListener(this);
        v.buttonxR.addActionListener(this);
        v.buttonxS.addActionListener(this);
        v.buttonxT.addActionListener(this);
        v.buttonxU.addActionListener(this);
        v.buttonxV.addActionListener(this);
        v.buttonxW.addActionListener(this);
        v.buttonxX.addActionListener(this);
        v.buttonxY.addActionListener(this);
        v.buttonxZ.addActionListener(this);
        v.buttonxABC.addActionListener(this);
        v.buttonx123.addActionListener(this);
        
        v.buttonxa.addActionListener(this);
       
        
        v.setVisible(true);
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("Button Clicked");
        
        
        if(e.getSource()==v.buttonxABC){
            v.buttonx1.setVisible(false);
            v.buttonx2.setVisible(false);
            v.buttonx3.setVisible(false);
            v.buttonx4.setVisible(false);
            v.buttonx5.setVisible(false);
            v.buttonx6.setVisible(false);
            v.buttonx7.setVisible(false);
            v.buttonx8.setVisible(false);
            v.buttonx9.setVisible(false);
            v.buttonx0.setVisible(false);
            v.buttonxcancel.setVisible(false);
            v.buttonxok.setVisible(false);
            v.buttonxABC.setVisible(false);
            v.buttonx123.setVisible(true);
            
            v.buttonxa.setVisible(true);
            
        }
        
        if(e.getSource()==v.buttonx123){
            v.buttonx1.setVisible(true);
            v.buttonx2.setVisible(true);
            v.buttonx3.setVisible(true);
            v.buttonx4.setVisible(true);
            v.buttonx5.setVisible(true);
            v.buttonx6.setVisible(true);
            v.buttonx7.setVisible(true);
            v.buttonx8.setVisible(true);
            v.buttonx9.setVisible(true);
            v.buttonx0.setVisible(true);
            v.buttonxcancel.setVisible(true);
            v.buttonxok.setVisible(true);
            v.buttonxABC.setVisible(true);
            v.buttonx123.setVisible(false);
            
            v.buttonxa.setVisible(false);
            
        }
        
        if(e.getSource()==v.botonCerrar){
            System.exit(0);
        }
         
        if(e.getSource()==v.buttonx1){
            v.pContra.setText(v.pContra.getText() + "1");
        }
        
        if(e.getSource()==v.buttonx2){
            v.pContra.setText(v.pContra.getText() + "2");
        }
        
        if(e.getSource()==v.buttonx3){
            v.pContra.setText(v.pContra.getText() + "3");
        }
        
        if(e.getSource()==v.buttonx4){
            v.pContra.setText(v.pContra.getText() + "4");
        }
        
        if(e.getSource()==v.buttonx5){
            v.pContra.setText(v.pContra.getText() + "5");
        }
        
        if(e.getSource()==v.buttonx6){
            v.pContra.setText(v.pContra.getText() + "6");
        }
        
        if(e.getSource()==v.buttonx7){
            v.pContra.setText(v.pContra.getText() + "7");
        }
        
        if(e.getSource()==v.buttonx8){
            v.pContra.setText(v.pContra.getText() + "8");
        }
        
        if(e.getSource()==v.buttonx9){
            v.pContra.setText(v.pContra.getText() + "9");
        }
        
        if(e.getSource()==v.buttonx0){
            v.pContra.setText(v.pContra.getText() + "0");
        }
        
        if(e.getSource()==v.buttonxcancel){
            v.pContra.setText(null);
        }
        
        if(e.getSource()==v.buttonxa){
            v.pContra.setText(v.pContra.getText() + "a");
        }
         
        
        /*
        if(e.getSource()==v.buttonxA){
            v.passwordText.setText(v.passwordText.getText() + "a");
        }
         
        if(e.getSource()==v.buttonxB){
            
            v.passwordText.setText(v.passwordText.getText() + "b");
        }
        if(e.getSource()==v.buttonxC){
            
            v.passwordText.setText(v.passwordText.getText() + "c");
        }
        if(e.getSource()==v.buttonxD){
            
            v.passwordText.setText(v.passwordText.getText() + "d");
        }
        if(e.getSource()==v.buttonxE){
            
            v.passwordText.setText(v.passwordText.getText() + "e");
        }
        if(e.getSource()==v.buttonxF){
            
            v.passwordText.setText(v.passwordText.getText() + "f");
        }
        if(e.getSource()==v.buttonxG){
            
            v.passwordText.setText(v.passwordText.getText() + "g");
        }
        if(e.getSource()==v.buttonxH){
            
            v.passwordText.setText(v.passwordText.getText() + "h");
        }
        if(e.getSource()==v.buttonxI){
            
            v.passwordText.setText(v.passwordText.getText() + "i");
        }
        if(e.getSource()==v.buttonxJ){
            
            v.passwordText.setText(v.passwordText.getText() + "j");
        }
        if(e.getSource()==v.buttonxK){
            
            v.passwordText.setText(v.passwordText.getText() + "k");
        }
        if(e.getSource()==v.buttonxL){
            
            v.passwordText.setText(v.passwordText.getText() + "l");
        }
        if(e.getSource()==v.buttonxM){
            
            v.passwordText.setText(v.passwordText.getText() + "m");
        }
        if(e.getSource()==v.buttonxN){
            
            v.passwordText.setText(v.passwordText.getText() + "n");
        }
        if(e.getSource()==v.buttonxÑ){
            
            v.passwordText.setText(v.passwordText.getText() + "ñ");
        }
        if(e.getSource()==v.buttonxO){
            
            v.passwordText.setText(v.passwordText.getText() + "o");
        }
        if(e.getSource()==v.buttonxP){
            
            v.passwordText.setText(v.passwordText.getText() + "p");
        }
        if(e.getSource()==v.buttonxQ){
            
            v.passwordText.setText(v.passwordText.getText() + "q");
        }
        if(e.getSource()==v.buttonxR){
            
            v.passwordText.setText(v.passwordText.getText() + "r");
        }
        if(e.getSource()==v.buttonxS){
            
            v.passwordText.setText(v.passwordText.getText() + "s");
        }
        if(e.getSource()==v.buttonxT){
            
            v.passwordText.setText(v.passwordText.getText() + "t");
        }
        if(e.getSource()==v.buttonxU){
            
            v.passwordText.setText(v.passwordText.getText() + "u");
        }
        if(e.getSource()==v.buttonxV){
            
            v.passwordText.setText(v.passwordText.getText() + "v");
        }
        if(e.getSource()==v.buttonxW){
            
            v.passwordText.setText(v.passwordText.getText() + "w");
        }
        if(e.getSource()==v.buttonxX){
            
            v.passwordText.setText(v.passwordText.getText() + "x");
        }
        if(e.getSource()==v.buttonxY){
            
            v.passwordText.setText(v.passwordText.getText() + "y");
        }
        if(e.getSource()==v.buttonxZ){
            
            v.passwordText.setText(v.passwordText.getText() + "y");
        }
        
       
        
        
        
       
        
        if(e.getSource() == v.buttonxok || e.getSource() == v.button){
        
            PreparedStatement st;
            ResultSet rs;

            final String username = v.userText.getText();
            final String password = String.valueOf(v.passwordText.getPassword());
            final String query = "SELECT * FROM `usuarios` WHERE `username` = ? AND `password` = ?";

            try {
            
                st = ModeloLogin.getConnection().prepareStatement(query);

                st.setString(1, username);
                st.setString(2, password);

                rs = st.executeQuery();
            
                if(rs.next())
                {
                     // aqui va el llamado a la ventana principal
                     System.out.println("conexion exitosa");
                                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos","Error login",2);
                }

            } catch (final SQLException ex){
                Logger.getLogger(LoginAppMVC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

*/
        
    }
    
}
    
   
    
    

