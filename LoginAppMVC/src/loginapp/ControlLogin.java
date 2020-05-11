/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import Controlador.ControlRegistro;
import Modelo.BDRegistro;
import Vista.VentanaRegistro;
import restablecimiento.vistarestablecimiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.text.View;
import menuprincipal.vistamenuprincipal;
import menuprincipal.controlmenuprincipal;
import restablecimiento.controlrestablecimiento;


/**
 *
 * @author herrboh
 */
public class ControlLogin implements ActionListener {
    
    VistaLogin v;
    ModeloLogin m;
    
    
    
    public ControlLogin(ModeloLogin mod, VistaLogin vis){
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
        v.buttonxb.addActionListener(this);
        v.buttonxd.addActionListener(this);
        v.buttonxe.addActionListener(this);
        v.buttonxf.addActionListener(this);
        v.buttonxg.addActionListener(this);
        v.buttonxh.addActionListener(this);
        v.buttonxi.addActionListener(this);
        v.buttonxj.addActionListener(this);
        v.buttonxk.addActionListener(this);
        v.buttonxl.addActionListener(this);
        v.buttonxn.addActionListener(this);
        v.buttonxñ.addActionListener(this);
        v.buttonxo.addActionListener(this);
        v.buttonxp.addActionListener(this);
        v.buttonxq.addActionListener(this);
        v.buttonxr.addActionListener(this);
        v.buttonxs.addActionListener(this);
        v.buttonxt.addActionListener(this);
        v.buttonxu.addActionListener(this);
        v.buttonxv.addActionListener(this);
        v.buttonxc.addActionListener(this);
        v.buttonxw.addActionListener(this);
        v.buttonxx.addActionListener(this);
        v.buttonxy.addActionListener(this);
        v.buttonxz.addActionListener(this);
        v.buttonxm.addActionListener(this);
        v.mayus.addActionListener(this);
        v.minus.addActionListener(this);
        v.pContra.addActionListener(this);
        v.tIdentificacion.addActionListener(this);
        
        v.usuarionuevo.addActionListener(this);
        v.restablecer.addActionListener(this);
        
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
            v.buttonxb.setVisible(true);
            v.buttonxc.setVisible(true);
            v.buttonxd.setVisible(true);
            v.buttonxe.setVisible(true);
            v.buttonxf.setVisible(true);
            v.buttonxg.setVisible(true);
            v.buttonxh.setVisible(true);
            v.buttonxi.setVisible(true);
            v.buttonxj.setVisible(true);
            v.buttonxk.setVisible(true);
            v.buttonxl.setVisible(true);
            v.buttonxm.setVisible(true);
            v.buttonxn.setVisible(true);
            v.buttonxñ.setVisible(true);
            v.buttonxo.setVisible(true);
            v.buttonxp.setVisible(true);
            v.buttonxq.setVisible(true);
            v.buttonxr.setVisible(true);
            v.buttonxs.setVisible(true);
            v.buttonxt.setVisible(true);
            v.buttonxu.setVisible(true);
            v.buttonxv.setVisible(true);
            v.buttonxw.setVisible(true);
            v.buttonxx.setVisible(true);
            v.buttonxy.setVisible(true);
            v.buttonxz.setVisible(true);
            v.mayus.setVisible(true);
            
        }
        
        if(e.getSource()==v.mayus){
            v.buttonxb.setVisible(false);
            v.buttonxc.setVisible(false);
            v.buttonxa.setVisible(false);
            v.buttonxd.setVisible(false);
            v.buttonxe.setVisible(false);
            v.buttonxf.setVisible(false);
            v.buttonxg.setVisible(false);
            v.buttonxh.setVisible(false);
            v.buttonxi.setVisible(false);
            v.buttonxj.setVisible(false);
            v.buttonxk.setVisible(false);
            v.buttonxl.setVisible(false);
            v.buttonxm.setVisible(false);
            v.buttonxn.setVisible(false);
            v.buttonxñ.setVisible(false);
            v.buttonxo.setVisible(false);
            v.buttonxp.setVisible(false);
            v.buttonxq.setVisible(false);
            v.buttonxr.setVisible(false);
            v.buttonxs.setVisible(false);
            v.buttonxt.setVisible(false);
            v.buttonxu.setVisible(false);
            v.buttonxv.setVisible(false);
            v.buttonxw.setVisible(false);
            v.buttonxx.setVisible(false);
            v.buttonxy.setVisible(false);
            v.buttonxz.setVisible(false);

            v.buttonxA.setVisible(true);
            v.buttonxB.setVisible(true);
            v.buttonxC.setVisible(true);
            v.buttonxD.setVisible(true);
            v.buttonxE.setVisible(true);
            v.buttonxF.setVisible(true);
            v.buttonxG.setVisible(true);
            v.buttonxH.setVisible(true);
            v.buttonxI.setVisible(true);
            v.buttonxJ.setVisible(true);
            v.buttonxK.setVisible(true);
            v.buttonxL.setVisible(true);
            v.buttonxM.setVisible(true);
            v.buttonxN.setVisible(true);
            v.buttonxÑ.setVisible(true);
            v.buttonxO.setVisible(true);
            v.buttonxP.setVisible(true);
            v.buttonxQ.setVisible(true);
            v.buttonxR.setVisible(true);
            v.buttonxS.setVisible(true);
            v.buttonxT.setVisible(true);
            v.buttonxU.setVisible(true);
            v.buttonxV.setVisible(true);
            v.buttonxW.setVisible(true);
            v.buttonxX.setVisible(true);
            v.buttonxY.setVisible(true);
            v.buttonxZ.setVisible(true);
            
            v.buttonxABC.setVisible(false);
            v.buttonx123.setVisible(true);
            v.minus.setVisible(true);
            v.mayus.setVisible(false);
            
            
        }
        
        if(e.getSource()==v.buttonxok){
            v.dispose();
            
            vistamenuprincipal mainmenu = new vistamenuprincipal();
            controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu);
        }
        
        if(e.getSource()==v.restablecer){
            v.dispose();
            
            vistarestablecimiento restab = new vistarestablecimiento();
            controlrestablecimiento controlre = new controlrestablecimiento(restab);
        }
        
        if(e.getSource()==v.usuarionuevo){
            
           v.dispose();
           
           VentanaRegistro r = new VentanaRegistro();
           BDRegistro bd = new BDRegistro();
           ControlRegistro ct = new ControlRegistro(r,bd);
           
        }
        
         if(e.getSource()==v.minus){
             
            v.buttonxb.setVisible(true);
            v.buttonxc.setVisible(true);
            v.buttonxa.setVisible(true);
            v.buttonxd.setVisible(true);
            v.buttonxe.setVisible(true);
            v.buttonxf.setVisible(true);
            v.buttonxg.setVisible(true);
            v.buttonxh.setVisible(true);
            v.buttonxi.setVisible(true);
            v.buttonxj.setVisible(true);
            v.buttonxk.setVisible(true);
            v.buttonxl.setVisible(true);
            v.buttonxm.setVisible(true);
            v.buttonxn.setVisible(true);
            v.buttonxñ.setVisible(true);
            v.buttonxo.setVisible(true);
            v.buttonxp.setVisible(true);
            v.buttonxq.setVisible(true);
            v.buttonxr.setVisible(true);
            v.buttonxs.setVisible(true);
            v.buttonxt.setVisible(true);
            v.buttonxu.setVisible(true);
            v.buttonxv.setVisible(true);
            v.buttonxw.setVisible(true);
            v.buttonxx.setVisible(true);
            v.buttonxy.setVisible(true);
            v.buttonxz.setVisible(true);

            v.buttonxA.setVisible(false);
            v.buttonxB.setVisible(false);
            v.buttonxC.setVisible(false);
            v.buttonxD.setVisible(false);
            v.buttonxE.setVisible(false);
            v.buttonxF.setVisible(false);
            v.buttonxG.setVisible(false);
            v.buttonxH.setVisible(false);
            v.buttonxI.setVisible(false);
            v.buttonxJ.setVisible(false);
            v.buttonxK.setVisible(false);
            v.buttonxL.setVisible(false);
            v.buttonxM.setVisible(false);
            v.buttonxN.setVisible(false);
            v.buttonxÑ.setVisible(false);
            v.buttonxO.setVisible(false);
            v.buttonxP.setVisible(false);
            v.buttonxQ.setVisible(false);
            v.buttonxR.setVisible(false);
            v.buttonxS.setVisible(false);
            v.buttonxT.setVisible(false);
            v.buttonxU.setVisible(false);
            v.buttonxV.setVisible(false);
            v.buttonxW.setVisible(false);
            v.buttonxX.setVisible(false);
            v.buttonxY.setVisible(false);
            v.buttonxZ.setVisible(false);
            
            v.buttonxABC.setVisible(false);
            v.buttonx123.setVisible(true);
            v.minus.setVisible(false);
            v.mayus.setVisible(true);
            

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
            v.buttonxb.setVisible(false);
            v.buttonxc.setVisible(false);
            v.buttonxd.setVisible(false);
            v.buttonxe.setVisible(false);
            v.buttonxf.setVisible(false);
            v.buttonxg.setVisible(false);
            v.buttonxh.setVisible(false);
            v.buttonxi.setVisible(false);
            v.buttonxj.setVisible(false);
            v.buttonxk.setVisible(false);
            v.buttonxl.setVisible(false);
            v.buttonxm.setVisible(false);
            v.buttonxn.setVisible(false);
            v.buttonxñ.setVisible(false);
            v.buttonxo.setVisible(false);
            v.buttonxp.setVisible(false);
            v.buttonxq.setVisible(false);
            v.buttonxr.setVisible(false);
            v.buttonxs.setVisible(false);
            v.buttonxt.setVisible(false);
            v.buttonxu.setVisible(false);
            v.buttonxv.setVisible(false);
            v.buttonxw.setVisible(false);
            v.buttonxx.setVisible(false);
            v.buttonxy.setVisible(false);
            v.buttonxz.setVisible(false);
            v.mayus.setVisible(false);
            v.minus.setVisible(false);
            
            v.buttonxB.setVisible(false);
            v.buttonxA.setVisible(false);
            v.buttonxC.setVisible(false);
            v.buttonxD.setVisible(false);
            v.buttonxE.setVisible(false);
            v.buttonxF.setVisible(false);
            v.buttonxG.setVisible(false);
            v.buttonxH.setVisible(false);
            v.buttonxI.setVisible(false);
            v.buttonxJ.setVisible(false);
            v.buttonxK.setVisible(false);
            v.buttonxL.setVisible(false);
            v.buttonxM.setVisible(false);
            v.buttonxN.setVisible(false);
            v.buttonxÑ.setVisible(false);
            v.buttonxO.setVisible(false);
            v.buttonxP.setVisible(false);
            v.buttonxQ.setVisible(false);
            v.buttonxR.setVisible(false);
            v.buttonxS.setVisible(false);
            v.buttonxT.setVisible(false);
            v.buttonxU.setVisible(false);
            v.buttonxV.setVisible(false);
            v.buttonxW.setVisible(false);
            v.buttonxX.setVisible(false);
            v.buttonxY.setVisible(false);
            v.buttonxZ.setVisible(false);
            
            
        }
        
        if(e.getSource()==v.botonCerrar){
            System.exit(0);
        }
        
        /*
        if(v.pContra.isCursorSet()){
            v.tIdentificacion.setEditable(false);
            
            
            if(!v.tIdentificacion.isEditable()){
                
                if(e.getSource()==v.buttonx1){
                    v.pContra.setText(v.pContra.getText() + "1");
                }
                
            }
            
            
        }
        
         v.pContra.addMouseListener((MouseListener) this);
         if(v.pContra.isCursorSet()){
             //v.tIdentificacion.setEnabled(false);
             System.out.println("jjaaja");
           
            if(e.getSource()==v.buttonx1){
                 v.pContra.setText(v.pContra.getText() + "1");
            }
         
         }
            
            
        
        
        if(v.tIdentificacion.isEditable()){
           // v.pContra.setEnabled(false);
                
                if(e.getSource()==v.buttonx1){
                    v.tIdentificacion.setText(v.tIdentificacion.getText() + "1");
                }        
        }
        
        /*
        if(e.getSource()==v.pContra && v.buttonx1.hasFocus()){
            
                
                    v.pContra.setText(v.pContra.getText() + "1");
                
                
        }
        
        
        if(e.getSource()==v.buttonx1){
                if (v.pContra.isFocusOwner()){
                    v.pContra.setText(v.pContra.getText() + "1");
                }
        }
            
        /*
        if(e.getSource()==v.buttonx1){
            v.pContra.setText(v.pContra.getText() + "1");
        }
        */
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
    
   
    
    

