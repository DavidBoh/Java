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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
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
  
     void mouseEvents(){
        
        
         
    }
     
   
    
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
        
       
        
        v.tIdentificacion.addActionListener(this);
        
        
        
        v.usuarionuevo.addActionListener(this);
        v.restablecer.addActionListener(this);
        
        v.setVisible(true);
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        
        
    }
    
  
   
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
           
              
        v.tIdentificacion.addCaretListener(new CaretListener(){
                @Override
                public void caretUpdate(CaretEvent e){
                System.out.println("carettriggered");
                }

            }
        );

        
            if(e.getSource()==v.buttonx1){
                
                
            }
        
              
         /*
            v.pContra.addFocusListener(new FocusListener() {

                @Override
                public void focusGained(FocusEvent e) {
                    //v.pContra.setText(null); // Empty the text field when it receives focus
                    System.out.println("tfdude");
                    v.pContra.setText(v.pContra.getText() + "1");
                    
                }

                @Override
                public void focusLost(FocusEvent e) {
                    //System.out.println("tfdude");
                    //v.pContra.setText(v.pContra.getText() + "1");
                }

           });
        
                        
      */
        //System.out.println("Button Clicked");
        
        
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

        if(e.getSource()==v.buttonxb){
            v.pContra.setText(v.pContra.getText() + "b");
        }

        if(e.getSource()==v.buttonxc){
            v.pContra.setText(v.pContra.getText() + "c");
        }

        if(e.getSource()==v.buttonxd){
            v.pContra.setText(v.pContra.getText() + "d");
        }

        if(e.getSource()==v.buttonxe){
            v.pContra.setText(v.pContra.getText() + "e");
        }

        if(e.getSource()==v.buttonxf){
            v.pContra.setText(v.pContra.getText() + "f");
        }

        if(e.getSource()==v.buttonxg){
            v.pContra.setText(v.pContra.getText() + "g");
        }

        if(e.getSource()==v.buttonxh){
            v.pContra.setText(v.pContra.getText() + "h");
        }

        if(e.getSource()==v.buttonxi){
            v.pContra.setText(v.pContra.getText() + "i");
        }

        if(e.getSource()==v.buttonxj){
            v.pContra.setText(v.pContra.getText() + "j");
        }

        if(e.getSource()==v.buttonxk){
            v.pContra.setText(v.pContra.getText() + "k");
        }

        if(e.getSource()==v.buttonxl){
            v.pContra.setText(v.pContra.getText() + "l");
        }

        if(e.getSource()==v.buttonxm){
            v.pContra.setText(v.pContra.getText() + "m");
        }

        if(e.getSource()==v.buttonxn){
            v.pContra.setText(v.pContra.getText() + "n");
        }

        if(e.getSource()==v.buttonxñ){
            v.pContra.setText(v.pContra.getText() + "ñ");
        }

        if(e.getSource()==v.buttonxo){
            v.pContra.setText(v.pContra.getText() + "o");
        }

        if(e.getSource()==v.buttonxp){
            v.pContra.setText(v.pContra.getText() + "p");
        }

        if(e.getSource()==v.buttonxq){
            v.pContra.setText(v.pContra.getText() + "q");
        }

        if(e.getSource()==v.buttonxr){
            v.pContra.setText(v.pContra.getText() + "r");
        }

        if(e.getSource()==v.buttonxs){
            v.pContra.setText(v.pContra.getText() + "s");
        }

        if(e.getSource()==v.buttonxt){
            v.pContra.setText(v.pContra.getText() + "t");
        }

        if(e.getSource()==v.buttonxu){
            v.pContra.setText(v.pContra.getText() + "u");
        }

        if(e.getSource()==v.buttonxv){
            v.pContra.setText(v.pContra.getText() + "v");
        }

        if(e.getSource()==v.buttonxw){
            v.pContra.setText(v.pContra.getText() + "w");
        }

        if(e.getSource()==v.buttonxx){
            v.pContra.setText(v.pContra.getText() + "x");
        }
         
        if(e.getSource()==v.buttonxy){
            v.pContra.setText(v.pContra.getText() + "y");
        }

        if(e.getSource()==v.buttonxz){
            v.pContra.setText(v.pContra.getText() + "z");
        }

        if(e.getSource()==v.buttonxA){
            v.pContra.setText(v.pContra.getText() + "A");
        }
         
        if(e.getSource()==v.buttonxB){
            
            v.pContra.setText(v.pContra.getText() + "B");
        }
        if(e.getSource()==v.buttonxC){
            
            v.pContra.setText(v.pContra.getText() + "C");
        }
        if(e.getSource()==v.buttonxD){
            
            v.pContra.setText(v.pContra.getText() + "D");
        }
        if(e.getSource()==v.buttonxE){
            
            v.pContra.setText(v.pContra.getText() + "E");
        }
        if(e.getSource()==v.buttonxF){
            
            v.pContra.setText(v.pContra.getText() + "F");
        }
        if(e.getSource()==v.buttonxG){
            
            v.pContra.setText(v.pContra.getText() + "G");
        }
        if(e.getSource()==v.buttonxH){
            
            v.pContra.setText(v.pContra.getText() + "H");
        }
        if(e.getSource()==v.buttonxI){
            
            v.pContra.setText(v.pContra.getText() + "I");
        }
        if(e.getSource()==v.buttonxJ){
            
            v.pContra.setText(v.pContra.getText() + "J");
        }
        if(e.getSource()==v.buttonxK){
            
            v.pContra.setText(v.pContra.getText() + "K");
        }
        if(e.getSource()==v.buttonxL){
            
            v.pContra.setText(v.pContra.getText() + "L");
        }
        if(e.getSource()==v.buttonxM){
            
            v.pContra.setText(v.pContra.getText() + "M");
        }
        if(e.getSource()==v.buttonxN){
            
            v.pContra.setText(v.pContra.getText() + "N");
        }
        if(e.getSource()==v.buttonxÑ){
            
            v.pContra.setText(v.pContra.getText() + "Ñ");
        }
        if(e.getSource()==v.buttonxO){
            
            v.pContra.setText(v.pContra.getText() + "O");
        }
        if(e.getSource()==v.buttonxP){
            
            v.pContra.setText(v.pContra.getText() + "P");
        }
        if(e.getSource()==v.buttonxQ){
            
            v.pContra.setText(v.pContra.getText() + "Q");
        }
        if(e.getSource()==v.buttonxR){
            
            v.pContra.setText(v.pContra.getText() + "R");
        }
        if(e.getSource()==v.buttonxS){
            
            v.pContra.setText(v.pContra.getText() + "S");
        }
        if(e.getSource()==v.buttonxT){
            
            v.pContra.setText(v.pContra.getText() + "T");
        }
        if(e.getSource()==v.buttonxU){
            
            v.pContra.setText(v.pContra.getText() + "U");
        }
        if(e.getSource()==v.buttonxV){
            
            v.pContra.setText(v.pContra.getText() + "V");
        }
        if(e.getSource()==v.buttonxW){
            
            v.pContra.setText(v.pContra.getText() + "W");
        }
        if(e.getSource()==v.buttonxX){
            
            v.pContra.setText(v.pContra.getText() + "X");
        }
        if(e.getSource()==v.buttonxY){
            
            v.pContra.setText(v.pContra.getText() + "Y");
        }
        if(e.getSource()==v.buttonxZ){
            
            v.pContra.setText(v.pContra.getText() + "Z");
        }
        
       /*
        
        if(e.getSource()==v.buttonx1){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "1");
        }
        
        if(e.getSource()==v.buttonx2){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "2");
        }
        
        if(e.getSource()==v.buttonx3){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "3");
        }
        
        if(e.getSource()==v.buttonx4){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "4");
        }
        
        if(e.getSource()==v.buttonx5){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "5");
        }
        
        if(e.getSource()==v.buttonx6){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "6");
        }
        
        if(e.getSource()==v.buttonx7){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "7");
        }
        
        if(e.getSource()==v.buttonx8){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "8");
        }
        
        if(e.getSource()==v.buttonx9){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "9");
        }
        
        if(e.getSource()==v.buttonx0){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "0");
        }
        
        if(e.getSource()==v.buttonxcancel){
            v.tIdentificacion.setText(null);
        }
        
        if(e.getSource()==v.buttonxa){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "a");
        }

        if(e.getSource()==v.buttonxb){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "b");
        }

        if(e.getSource()==v.buttonxc){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "c");
        }

        if(e.getSource()==v.buttonxd){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "d");
        }

        if(e.getSource()==v.buttonxe){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "e");
        }

        if(e.getSource()==v.buttonxf){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "f");
        }

        if(e.getSource()==v.buttonxg){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "g");
        }

        if(e.getSource()==v.buttonxh){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "h");
        }

        if(e.getSource()==v.buttonxi){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "i");
        }

        if(e.getSource()==v.buttonxj){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "j");
        }

        if(e.getSource()==v.buttonxk){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "k");
        }

        if(e.getSource()==v.buttonxl){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "l");
        }

        if(e.getSource()==v.buttonxm){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "m");
        }

        if(e.getSource()==v.buttonxn){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "n");
        }

        if(e.getSource()==v.buttonxñ){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "ñ");
        }

        if(e.getSource()==v.buttonxo){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "o");
        }

        if(e.getSource()==v.buttonxp){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "p");
        }

        if(e.getSource()==v.buttonxq){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "q");
        }

        if(e.getSource()==v.buttonxr){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "r");
        }

        if(e.getSource()==v.buttonxs){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "s");
        }

        if(e.getSource()==v.buttonxt){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "t");
        }

        if(e.getSource()==v.buttonxu){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "u");
        }

        if(e.getSource()==v.buttonxv){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "v");
        }

        if(e.getSource()==v.buttonxw){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "w");
        }

        if(e.getSource()==v.buttonxx){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "x");
        }
         
        if(e.getSource()==v.buttonxy){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "y");
        }

        if(e.getSource()==v.buttonxz){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "z");
        }

        if(e.getSource()==v.buttonxA){
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "A");
        }
         
        if(e.getSource()==v.buttonxB){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "B");
        }
        if(e.getSource()==v.buttonxC){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "C");
        }
        if(e.getSource()==v.buttonxD){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "D");
        }
        if(e.getSource()==v.buttonxE){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "E");
        }
        if(e.getSource()==v.buttonxF){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "F");
        }
        if(e.getSource()==v.buttonxG){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "G");
        }
        if(e.getSource()==v.buttonxH){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "H");
        }
        if(e.getSource()==v.buttonxI){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "I");
        }
        if(e.getSource()==v.buttonxJ){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "J");
        }
        if(e.getSource()==v.buttonxK){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "K");
        }
        if(e.getSource()==v.buttonxL){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "L");
        }
        if(e.getSource()==v.buttonxM){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "M");
        }
        if(e.getSource()==v.buttonxN){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "N");
        }
        if(e.getSource()==v.buttonxÑ){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "Ñ");
        }
        if(e.getSource()==v.buttonxO){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "O");
        }
        if(e.getSource()==v.buttonxP){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "P");
        }
        if(e.getSource()==v.buttonxQ){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "Q");
        }
        if(e.getSource()==v.buttonxR){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "R");
        }
        if(e.getSource()==v.buttonxS){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "S");
        }
        if(e.getSource()==v.buttonxT){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "T");
        }
        if(e.getSource()==v.buttonxU){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "U");
        }
        if(e.getSource()==v.buttonxV){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "V");
        }
        if(e.getSource()==v.buttonxW){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "W");
        }
        if(e.getSource()==v.buttonxX){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "X");
        }
        if(e.getSource()==v.buttonxY){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "Y");
        }
        if(e.getSource()==v.buttonxZ){
            
            v.tIdentificacion.setText(v.tIdentificacion.getText() + "Z");
        }
        
       
        
        
        
        /*
        
       
        
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
    
   
    
    

