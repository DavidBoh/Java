
package creartxt;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;




public class VistaFormulario extends JFrame {

    JLabel lm,lmn, ln, la, le, lg, les, ltv, ld, ltel;
    JTextField tn, ta, td, ttel;
    JComboBox ce, cg, ctv, ces;
    JButton guarda, borra;
    
    VistaFormulario(){
        
      setSize(800,600);
      setLayout(null);
      setTitle("Datos Familiares");
      
      ln=new JLabel("Nombre: ");
      la=new JLabel("Apellido: ");
      le=new JLabel("Edad: ");
      lg=new JLabel("Género: ");
      les=new JLabel("Estrato: ");
      ltv=new JLabel("Nivel Educativo: ");
      ld=new JLabel("Dirección: ");
      ltel=new JLabel("Teléfono: ");
      lmn=new JLabel("Nº Integrantes familia que vivan con usted");
      lm=new JLabel("Seleccione integrantes");
      
      
      tn=new JTextField();
      ta=new JTextField();
      td=new JTextField();
      ttel=new JTextField();
      
      ce=new JComboBox();
      for (int i=0; i<101; i++)
      {
          ce.addItem(""+i);
      }
      
      String gen[]={"","Masculino", "Femenino", "Otro"};
      cg=new JComboBox();
      for (int i=0;i<gen.length; i++)
      {
          cg.addItem(gen[i]);
      }
     
      ces=new JComboBox();
      
      for (int i=6; i>=0; i--)
      {
       ces.addItem(""+i);
      }
      
      String niveledu[]={"Otro","Profesional", "Técnico","Bachillerato","Primaria", ""};
      
      ctv=new JComboBox();
      for (int i=niveledu.length-1;i>=0;i--)
      {
        ctv.addItem(niveledu[i]);  
      }
      
      borra=new JButton("Borrar");
      guarda=new JButton("Guardar");
      consulta=new
      
      borra.setBounds(190,250, 100, 50);
      this.add(borra);
      guarda.setBounds(310,250,100,50);
      this.add(guarda);
      
      
      ln.setBounds(20, 60, 100, 25);
      this.add(ln);
      
      tn.setBounds(150, 60, 200, 25);
      this.add(tn);
      
      la.setBounds(20, 80, 100, 25);
      this.add(la);
      
      ta.setBounds(150, 80,200,25);
      this.add(ta);
      
      
      le.setBounds(20, 100, 100,25);
      this.add(le);
      
      ce.setBounds(150,100,200,25);
      this.add(ce);
      
      lg.setBounds(20, 120, 100,25);
      this.add(lg);
      
      cg.setBounds(150, 120, 200,25);
      this.add(cg);
        
      les.setBounds(20, 140, 100,25);
      this.add(les);
      
      ces.setBounds(150,140,200,25);
      this.add(ces);
      
      ltv.setBounds(20, 160, 100,25);
      this.add(ltv);
      
      ctv.setBounds(150, 160, 200,25);
      this.add(ctv);
      
      ld.setBounds(20,180,100,25);
      this.add(ld);
      
      td.setBounds(150,180,200,25);
      this.add(td);
      
      ltel.setBounds(20, 200, 100,25);
      this.add(ltel);
      
      ttel.setBounds(150,200,200,25);
      this.add(ttel);
      
        
    }
    
    
}
