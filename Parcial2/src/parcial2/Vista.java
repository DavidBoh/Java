/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;




public class Vista extends JFrame {

    JMenu a,b,c,tam,d;
    JMenuBar barra;
    
    JMenuItem a1,a2,a3;
    
    JLabel  co, no, ma, de, es, ca, va;
    JTextField  tco, tno, tma, tde, tes, tca, tva;
   
    JButton guarda, consulta;
    
    ButtonGroup grup;
    JTextArea campo;
    JScrollPane panel;
    
    Vista(){
        
      setSize(800,600);
      setLayout(null);
      setTitle("Parcial");
      
      co=new JLabel("Código: ");
      no=new JLabel("Nombre: ");
      ma=new JLabel("Marca: ");
      de=new JLabel("Descrip/caract: ");
      es=new JLabel("Estado: ");
      ca=new JLabel("Cantidad:");
      va=new JLabel("Valor Unitario: ");
     
      barra=new JMenuBar();
      a=new JMenu("Archivo");
      
      a1=new JMenuItem("Guardar");
      a2=new JMenuItem("Cerrar");
      
       a.add(a1);  
       a.add(a2);
     
      
      barra.add(a);
      
      setJMenuBar(barra);
      
      
      
      campo=new JTextArea(20,40);
      panel=new JScrollPane(campo);
      this.add(panel);
      panel.setBounds(400,60,350,400);
      
      
     
      
     
      tco=new JTextField();
      tno=new JTextField();
      tma=new JTextField();
      tde=new JTextField();
      tes=new JTextField();
      tca=new JTextField();
      tva=new JTextField();
    
      
      
      
     
     
      
     
     
      
      
      
    
      guarda=new JButton("Guardar");
      consulta=new JButton("Consultar Base");
      
     
      guarda.setBounds(180,360,150,50);
      this.add(guarda);
      
      
      
     
      
      co.setBounds(20, 90, 100, 25);
      this.add(co);
      
      tco.setBounds(150, 90,200,25);
      this.add(tco);
      
      
      no.setBounds(20, 120, 100,25);
      this.add(no);
      
      tno.setBounds(150,120,200,25);
      this.add(tno);
      
      ma.setBounds(20, 150, 100,25);
      this.add(ma);
      
      tma.setBounds(150, 150, 200,25);
      this.add(tma);
        
      de.setBounds(20, 180, 100,25);
      this.add(de);
      
      tde.setBounds(150,180,200,25);
      this.add(tde);
      
      es.setBounds(20, 210, 100,25);
      this.add(es);
      
      tes.setBounds(150, 210, 200,25);
      this.add(tes);
      
      ca.setBounds(20, 240,250,25);
      this.add(ca);
      
      tca.setBounds(150,240,200,25);
      this.add(tca);
      
      va.setBounds(20,270,250,20);
      this.add(va);
      
      tva.setBounds(150,270,200,25);
      this.add(tva);
      
      
     
        
    }
    
    
}
