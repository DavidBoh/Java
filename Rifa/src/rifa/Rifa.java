/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifa;

import com.itextpdf.kernel.pdf.PdfDocument;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import javax.swing.*;

import com.itextpdf.kernel.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


import java.io.File;
import java.io.IOException;

/**
 *
 * @author ESTUDIANTE
 */
public class Rifa extends JFrame implements ActionListener {

    JMenu a,b,c,tam,d;
    JMenuBar barra;
    
    JMenuItem a1,a2,a3;
    
     JLabel ri, sr, res, val, bol, fech ;
    JTextField tpersona, tvalor;
    JComboBox ce, cg, ctv, ces;
    JButton guarda, borra, consulta;
    
    ButtonGroup grup;
    JTextArea tfecha, telemento;
    JScrollPane panel;
    
    Rifa(){
        
      setSize(500,600);
      setLayout(null);
      setTitle("Rifa ");
      ri=new JLabel("RIFA ESTELAR: ");
      sr=new JLabel("Se Rifa: ");
      res=new JLabel("Responsable: ");
      val=new JLabel("Valor: ");
      bol=new JLabel("Boleta sin cancelar no juega ");
      fech=new JLabel("Fecha");
       guarda=new JButton("Guardar");
       
       guarda.setBounds(200,450,100,25);
       this.add(guarda);
      
      barra=new JMenuBar();
      a=new JMenu("Archivo");
      
      a1=new JMenuItem("Guardar");
      a2=new JMenuItem("Cerrar");
      
       a.add(a1);  
       a.add(a2);
     
      
      barra.add(a);
      
      setJMenuBar(barra);
      
      tfecha = new JTextArea();
      telemento = new JTextArea();
      
      tpersona= new JTextField();
      tvalor= new JTextField();
      
      ri.setBounds(200,40,100,40);
      this.add(ri);
      
      sr.setBounds(30,70,60,40);
      this.add(sr);
      
      telemento.setBounds(30, 120,400,100);
      
      this.add(telemento);
      
      fech.setBounds(30, 200,80,80);
      this.add(fech);
      tfecha.setBounds(30,250,400,100);
      this.add(tfecha);
      
      tfecha.setText("Juega el día __ de ______ de 20__ con las __ últimas"
                + "\ncifras del premio mayor de la lotería de __________");
      
      res.setBounds(30,360,100,100);
      this.add(res);
      
      tpersona.setBounds(120,400,100,25);
      this.add(tpersona);
      
      val.setBounds(250,360,100,100);
      this.add(val);
      
      tvalor.setBounds(300,400,100,25);
      this.add(tvalor);
     
    bol.setBounds(30,450,200,100);
    this.add(bol);
      
      guarda.addActionListener(this);
      a2.addActionListener(this);
      a1.addActionListener(this);
      
      this.setVisible(true);
      
      this.setDefaultCloseOperation(3);
      
    }
    
    
    public static void main(String[] args) {
        new Rifa();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         if(ae.getSource()==a1)
        {
            String Dat[] = new String[4];
            Dat[0] = telemento.getText();
            Dat[1] = tfecha.getText();
            Dat[2] = tpersona.getText();
            Dat[3] = tvalor.getText();
            String r = "C:\\Users\\ESTUDIANTE\\Desktop\\Recibos\\Recibos.pdf";
            crearPdf(r, Dat);
        }
         
         if(ae.getSource()==a2)
        {
            System.exit(0);
        }
         
         if(ae.getSource()==guarda)
        {
            
           String Dat[] = new String[5];
            Dat[0] = telemento.getText();
            Dat[1] = tfecha.getText();
            Dat[2] = tpersona.getText();
            Dat[3] = tvalor.getText();
            
            for(int i=0;i<=100;i++){
            Dat[4]= ""+i;
            String r = "C:\\Users\\ESTUDIANTE\\Desktop\\Reciboss\\Recibos_"+i+".pdf";
            crearPdf(r, Dat);
            }
             
        }
        
        
        
        
    }
    
     public void crearPdf(String Ruta, String t[]) {
      
         
         File file;
        PdfWriter writer;
        PdfDocument pdf;
        Document document;
        try {
            file = new File(Ruta);
            file.getParentFile().mkdirs();//crea carpetas si no existen
            writer = new PdfWriter(Ruta);
            pdf = new PdfDocument(writer);
            document = new Document(pdf);

            document.add(new Paragraph("RIFA ESTELAR\t\t\t Boleta Numero"+ t[4]));
            document.add(new Paragraph("Se rifa: " + t[0]));
            document.add(new Paragraph(t[1]));
            document.add(new Paragraph("Responsable: " + t[2]));
            document.add(new Paragraph("Valor: " + t[3]));

            document.close();
            System.out.println("Boleta Nro"+t[4]+"Creada");
        } catch (IOException ioex) {
            System.out.println("" + ioex.getMessage());
        }
        
       
    }
    
    
}
