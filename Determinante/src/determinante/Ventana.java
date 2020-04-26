
package determinante; 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Ventana extends JFrame implements ActionListener{
    JScrollPane scroll;
    JButton b;
    JTable tabla;
    JLabel resultado, elresules;
    Color color1, color2; 
    
    Ventana()
    {
        setSize(400, 400);
        setTitle("Determinante");
        setLayout(null);
        
        String titulo[]={"A", "B", "C"};
        
        //matriz quemada:
        
        String celdas[][]={{" ", " ", " "},
                           {" ", " ", " "},
                           {" ", " ", " "}};
    
    tabla=new JTable(celdas, titulo);
    scroll=new JScrollPane(tabla);
    
    scroll.setBounds(20, 20, 200, 200);
    this.add(scroll);
    
    b=new JButton("Leer");
    b.setBounds(250,50,70,40);
    this.add(b);
    b.addActionListener(this);
   
    elresules= new JLabel("El Resultado es: ");
    elresules.setBounds(20, 250, 150, 50);
    add(elresules);
    
    resultado= new JLabel(" ");
    resultado.setBounds(150,250,150,50);
    add(resultado);
    color1= new Color (0, 0, 0);
    color2= new Color (255, 255, 255);
    
    
    
    setVisible(true);   
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
      
       
    if(ae.getSource()==b){
        
        int fil=tabla.getRowCount();
        int col=tabla.getColumnCount();
        
        for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                tabla.getValueAt(i,j);
            }
           
        }
        
        
        /*
        int fil=tabla.getRowCount();
        int col=tabla.getColumnCount();
        
        for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double a00 = ((double)tabla.getValueAt(i,j));
            }
           
        }
        
         for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                 double a01 = ((double)tabla.getValueAt(1,1));
            }
           
        }
         
          for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double a02 = ((double)tabla.getValueAt(1,2));
            }
           
        }
          
           for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double a10 = ((double)tabla.getValueAt(2,0));
            }
           
        }
           
            for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double a11 = ((double)tabla.getValueAt(2,1));
            }
           
        }
            
             for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double a12 = ((double)tabla.getValueAt(2,2));
            }
           
        }
             
              for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double a20 = ((double)tabla.getValueAt(3,0));
            }
           
        }
              
               for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
               double a21 = ((double)tabla.getValueAt(3,1));
            }
           
        }
               
                for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double a22 = ((double)tabla.getValueAt(3,2)); 
            }
           
        }
        
     
       
       
        
        
        double a01 = ((double)tabla.getValueAt(1,1));
       
          
        double a02 = ((double)tabla.getValueAt(1,2));
        
        double a10 = ((double)tabla.getValueAt(2,0));
        
          
        double a11 = ((double)tabla.getValueAt(2,1));
      
        
         
        double a12 = ((double)tabla.getValueAt(2,2));
        
          
         double a20 = ((double)tabla.getValueAt(3,0));
         
          
        double a21 = ((double)tabla.getValueAt(3,1));
        
         
         double a22 = ((double)tabla.getValueAt(3,2)); 

*/
        
        double a00 = Double.parseDouble(tabla.getValueAt(1,0).toString());
        double a01 = Double.parseDouble(tabla.getValueAt(1,1).toString());
        double a02 = Double.parseDouble(tabla.getValueAt(1,2).toString());
        double a10 = Double.parseDouble(tabla.getValueAt(2,0).toString());
        double a11 = Double.parseDouble(tabla.getValueAt(2,1).toString());
        double a12 = Double.parseDouble(tabla.getValueAt(2,2).toString());
        double a20 = Double.parseDouble(tabla.getValueAt(3,0).toString());
        double a21 = Double.parseDouble(tabla.getValueAt(3,1).toString());
        double a22 = Double.parseDouble(tabla.getValueAt(3,2).toString());        
   
    
  
 
        
        
        
        double a1, a2, a3,a4, a5, a6;
             
                
             
        a1=a00*a11*a22;
        a2=a01*a12*a20;
        a3=a02*a10*a21;
        a4=a02*a11*a20;
        a5=a00*a12*a21;
        a6=a01*a10*a22;
        double sum1;
        sum1= a1+a2+a3;
        double sum2;
        sum2= a4+a5+a6;
        double resul;
        resul= sum1-sum2;
        
        
        
        resultado.setText("Determinante es:"+resul);
        
    }
        
        
        
    }
    
    
    
}