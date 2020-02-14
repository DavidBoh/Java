package paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

    JPanel panel, panel2, panel3;
    JTextField ruta, tb, tc, td;
    JButton b, b2, b3, b4;
    JLabel lestilo, lfuente, ltamaño;
    JComboBox cestilo, cfuente, ctamaño;
    JTextArea campo;
    JMenuBar barra;
    JMenu archivo, edicion, acerca;
    JMenuItem arch1, arch2, arch3, edi1, edi2, edi3, acer1;

    Ventana() {
        setTitle("Word Pequeño");
        setSize(800, 600);
        setLayout(null);
        archivo = new JMenu("Archivo");
        edicion = new JMenu("Edición");
        acerca = new JMenu("Acerca de");
        arch1 = new JMenuItem("Abrir");
        arch2 = new JMenuItem("Guardar");
        arch3 = new JMenuItem("Salir");
        edi1 = new JMenuItem("Centrar");
        edi2 = new JMenuItem("Alinear a la izq");
        acer1 = new JMenuItem("Acerca de...");
        archivo.add(arch1);
        archivo.add(arch2);
        archivo.add(arch3);
        archivo.add(edi1);
        archivo.add(edi2);
        archivo.add(acer1);

        ruta = new JTextField(50);

        barra = new JMenuBar();
        barra.add(archivo);
        barra.add(edicion);
        barra.add(acerca);
        setJMenuBar(barra);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBounds(0, 0, 800, 200);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 2));
        panel2.setBounds(0, 200, 200, 400);

        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.setBounds(200, 200, 600, 400);

        campo = new JTextArea(50, 500);
        panel3.add(campo, BorderLayout.CENTER);

        lestilo = new JLabel("Estilo");
        lfuente = new JLabel("Fuente");
        ltamaño = new JLabel("Tamaño");

        cestilo = new JComboBox();
        cestilo.addItem("Normal");
        cestilo.addItem("Negrilla");
        cestilo.addItem("Cursiva");
        cestilo.addItem("Subrayado");

        cfuente = new JComboBox();
        cfuente.addItem("Arial");
        cfuente.addItem("Calibri");
        cfuente.addItem("Tahoma");
        cfuente.addItem("Times New Roman");
        cfuente.addItem("ALGERIAN");

        ctamaño = new JComboBox();
        ctamaño.addItem("MUY PEQUEÑA");
        ctamaño.addItem("PEQUEÑA");
        ctamaño.addItem("NORMAL");
        ctamaño.addItem("GRANDE");
        ctamaño.addItem("MUY GRANDE");

        b = new JButton("Cargar");

        panel.add(ruta);
        panel.add(b);

        panel2.add(lestilo);
        panel2.add(cestilo);
        panel2.add(lfuente);
        panel2.add(cfuente);
        panel2.add(ctamaño);
        panel2.add(ltamaño);

        this.add(panel);
        this.add(panel2);
        this.add(panel3);

        b.addActionListener(this);
        ctamaño.addActionListener(this);
        cfuente.addActionListener(this);
        cestilo.addActionListener(this);
        arch3.addActionListener(this);

        this.setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cestilo) {
            if (cestilo.getSelectedIndex() == 0) {
                Font x = campo.getFont();
                x = x.deriveFont(Font.PLAIN);
                campo.setFont(x);
            }
            if (cestilo.getSelectedIndex() == 1) {
                Font x = campo.getFont();
                x = x.deriveFont(Font.BOLD);
                campo.setFont(x);
            }
            if (cestilo.getSelectedIndex() == 2) {
                Font x = campo.getFont();
                x = x.deriveFont(Font.ITALIC);
                campo.setFont(x);
            }
            if (cestilo.getSelectedIndex() == 3) {
                Font x = campo.getFont();
                x = x.deriveFont(Font.ROMAN_BASELINE);
                campo.setFont(x);
            }

        }

        if (e.getSource() == ctamaño) {
            if (ctamaño.getSelectedIndex() == 0) {
                Font x = campo.getFont();
                x = x.deriveFont(10f);
                campo.setFont(x);
            }
            if (ctamaño.getSelectedIndex() == 1) {
                Font x = campo.getFont();
                x = x.deriveFont(12f);
                campo.setFont(x);
            }
            if (ctamaño.getSelectedIndex() == 2) {
                Font x = campo.getFont();
                x = x.deriveFont(20f);
                campo.setFont(x);
            }
            if (ctamaño.getSelectedIndex() == 3) {
                Font x = campo.getFont();
                x = x.deriveFont(30f);
                campo.setFont(x);
            }
            if (ctamaño.getSelectedIndex() == 4) {
                Font x = campo.getFont();
                x = x.deriveFont(40f);
                campo.setFont(x);
            }
        }
        if (e.getSource() == cfuente) {

            if (cfuente.getSelectedIndex() == 0) {
                Font x = campo.getFont();
                int es = x.getStyle();
                int ta = x.getSize();
                x = new Font("Arial", es, ta);
                campo.setFont(x);
            }

            if (cfuente.getSelectedIndex() == 1) {
                Font x = campo.getFont();
                int es = x.getStyle();
                int ta = x.getSize();
                x = new Font("Calibri", es, ta);
                campo.setFont(x);
            }

            if (cfuente.getSelectedIndex() == 2) {
                Font x = campo.getFont();
                int es = x.getStyle();
                int ta = x.getSize();
                x = new Font("Tahoma", es, ta);
                campo.setFont(x);
            }

            if (cfuente.getSelectedIndex() == 3) {
                Font x = campo.getFont();
                int es = x.getStyle();
                int ta = x.getSize();
                x = new Font("Times New Roman", es, ta);
                campo.setFont(x);
            }

            if (cfuente.getSelectedIndex() == 4) {
                Font x = campo.getFont();
                int es = x.getStyle();
                int ta = x.getSize();
                x = new Font("ALGERIAN", es, ta);
                campo.setFont(x);
            }
        }
        if (e.getSource() == arch3) {

            System.exit(0);

        }

        if (e.getSource() == b) {
            File doc;
            FileReader fr = null;
            BufferedReader br;
            String linea, msj = null;

            if (!ruta.getText().equals("")) {
                try {
                    doc = new File(ruta.getText());
                    fr = new FileReader(doc);
                    br = new BufferedReader(fr);
                    linea = " ";
                    msj = " ";
                    while ((linea = br.readLine()) != null) {
                        msj = msj + linea + "\n";
                    }
                } catch (IOException io) {
                    System.err.println(io);
                } finally {
                    if (fr != null) {
                        try {
                            fr.close();
                        } catch (IOException ex) {
                            System.err.println(ex);
                        }
                        campo.setText(msj);
                    }
                }

            }

        }

    }

}
