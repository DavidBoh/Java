
package inventariocelulares;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;




public class VistaCelu extends JFrame {

    JLabel lm, lmo, le, lc, li, lime;
    JTextField ti, time;
    JComboBox cmo, cmarc, ctv, ces;
    JButton guarda, borra;
    
    VistaCelu(){
        
      setSize(800,600);
      setLayout(null);
      setTitle("Inventario Celulares");
      lm=new JLabel("Marca: ");
      lime=new JLabel("IMEI: ");
      lmo=new JLabel("Modelo(año): ");
      le=new JLabel("Estado: ");
      lc=new JLabel("Color: ");
      li=new JLabel("Importado por: ");
      
      
     
     
      ti=new JTextField();
      time=new JTextField();
      
      cmo=new JComboBox();
      for (int i=2007; i<2019; i++)
      {
          cmo.addItem(""+i);
      }
      
      String marc[]={"","Samsung", "Apple", "Huawei","Nokia", "Motorola", "LG", "Otra"};
      cmarc=new JComboBox();
      for (int i=0;i<marc.length; i++)
      {
          cmarc.addItem(marc[i]);
      }
     
      String est[]={"", "Nuevo", "Usado"};
      ces=new JComboBox();
      
      for (int i=0;i<est.length; i++)
      {
          ces.addItem(est[i]);
      }
      
      String color[]={"Sin Color", "Blanco", "Negro", "Azul", "Rosado", "Gris", "Otro", ""};
      
      ctv=new JComboBox();
      for (int i=color.length-1;i>=0;i--)
      {
        ctv.addItem(color[i]);  
      }
      
      borra=new JButton("Reiniciar");
      guarda=new JButton("Almacenar");
      
      borra.setBounds(190,350, 100, 50);
      this.add(borra);
      guarda.setBounds(310,350,100,50);
      this.add(guarda);
      
      
      lm.setBounds(20, 60, 100, 25);
      this.add(lm);
      cmarc.setBounds(150, 60,100,25);
      this.add(cmarc);
      
      lime.setBounds(20, 100, 100, 25);
      this.add(lime);
      time.setBounds(150, 100,100,25);
      this.add(time);
      
      
      lmo.setBounds(20, 140, 100, 25);
      this.add(lmo);
      cmo.setBounds(150, 140,100,25);
      this.add(cmo);
     
      
      
      le.setBounds(20, 180, 100,25);
      this.add(le);
      ces.setBounds(150,180,100,20);
      this.add(ces);
          
      lc.setBounds(20, 220, 100,25);
      this.add(lc);
      ctv.setBounds(150, 220, 100,25);
      this.add(ctv);
     
        
      li.setBounds(20, 260, 100,25);
      this.add(li);
      ti.setBounds(150,260,100,25);
      this.add(ti);
      
      
      
      
     
      
     
      
     
      
        
    }
    
    
}

