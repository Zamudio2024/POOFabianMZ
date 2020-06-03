/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.eventos.EventosItems;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Fabian
 */
public class VentanaComponentes extends JFrame {

    private JButton bt1;
    private JTextField entrada;
    private JButton botonArchivo;
    private JComboBox combo;
    private JLabel etiqueta;
    private JTextArea area;

    public VentanaComponentes() throws HeadlessException {
        super("Elementos swing");
        super.setSize(400, 300);
        super.getContentPane().setLayout(new FlowLayout());
        bt1 = new JButton("Saludame");
        entrada = new JTextField(20);
        botonArchivo = new JButton("Elegir archivo");
        String[] frutas = {"Limon","Piña","Kiwi","Naranja"};
        combo = new JComboBox(frutas);
        etiqueta = new JLabel("Hola mundo");
        etiqueta.setForeground(new Color(245,234, 123, 254));
        area = new JTextArea(3,5);
        super.getContentPane().add(entrada);
        super.getContentPane().add(bt1);
        super.getContentPane().add(botonArchivo);
        super.getContentPane().add(combo);
        super.getContentPane().add(etiqueta);
        super.getContentPane().add(area);
        
        combo.addActionListener(new EventosItems());
       /*Combo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("Click sobre el combo.");
            }
        
        });
        */
        botonArchivo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JFileChooser jfc = new JFileChooser();
                jfc.showOpenDialog(null);
                File archivo = jfc.getSelectedFile();
                System.out.println("Ruta: "+ archivo.getAbsolutePath());
                try {
                    FileReader fr = new FileReader(archivo);
                    BufferedReader bf = new BufferedReader(fr);
                    String linea = "";
                    do{
                    linea = bf.readLine();
                    area.setText(area.getText()+linea + "\n");
                    }while (linea != null);
                
                } catch (FileNotFoundException ex) {
                    System.out.println("Error al leer el archivo!!!");
                }catch(IOException u){
                    System.out.println("Error en la lectura");
                }
                
            }
            
});

        bt1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int resp = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?","Responde",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(resp == JOptionPane.YES_OPTION)
                    System.out.println("Respondiste Si");
                if(resp == JOptionPane.NO_OPTION)
                    System.out.println("Respondiste No");
                if(resp == JOptionPane.CANCEL_OPTION)
                    System.out.println("Respondiste Cancelar");
                String entrada = JOptionPane.showInputDialog(null,"Introduce tu nombre: ", "Dame un nombre", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, entrada.toUpperCase());
            }   
            
        });

        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });

    }

}
