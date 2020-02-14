
package matriz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener{
    
    JScrollPane scroll1, scroll2;
    JButton bm;
    JTable tabla1;
    JLabel esca;
    JTextField tfesca;
    
    Ventana()
    {
        setSize(400, 300);
        setTitle("Matriz");
        setLayout(null);
    
         String titulo[]={"A", "B","C"};
        
        //matriz quemada:
        
        String celdas[][]={{"", "", ""},
                           {"", "", ""},
                           {"", "", ""}};
        
        tabla1=new JTable(celdas, titulo);
        scroll1=new JScrollPane(tabla1);
        
        scroll1.setBounds(20, 20, 200, 200);
        this.add(scroll1);
        
        bm=new JButton("Multiplicar");
        bm.setBounds(250,120,100,20);
        this.add(bm);
        bm.addActionListener(this);
        
        esca=new JLabel("Escalar: ");
        esca.setBounds(250, 60, 70, 40);
        add(esca);
        
        tfesca= new JTextField(10);
        tfesca.setBounds(300, 70, 60, 20);
        add(tfesca);
        
        
        setVisible(true);
        
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       int fil=tabla1.getRowCount();
       int col=tabla1.getColumnCount();
        
        
        
        /*for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(tabla1.getValueAt(i,j).toString()+"\t");
            }
            System.out.println("");
        }
        */
        
         double a=Double.parseDouble(tfesca.getText());
         
         for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                double resf=i*a;
                double resc=j*a;
                System.out.print(tabla1.getValueAt(i,j).toString()+"\t");
                
                
            }
            System.out.println();
        }
         
                     
            
        }
       
        
        
        
    }
    
    
    
    

