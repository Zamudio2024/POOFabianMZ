/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Fabian
 */
public class Ventana extends JFrame {

    private JTextField tF1;
    private JButton btn1;
    private JTextArea tA1;
    
    public Ventana() throws HeadlessException {
        super("Mi ventana Swing");
        super.setSize(400, 600);
        super.getContentPane().setLayout(new FlowLayout());
        tF1 = new JTextField(10);
        tF1.setBackground(Color.red);
        btn1 = new JButton("Aceptar");
        btn1.setBackground(Color.cyan);
        tA1 = new JTextArea(3, 10);
        tA1.setBackground(Color.yellow);
        this.getContentPane().add(tF1);
        this.getContentPane().add(btn1);
        this.getContentPane().add(tA1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("Cerrado");
                System.exit(0);
            }
            
        });
        
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                tA1.setText(tF1.getText());
                JOptionPane.showMessageDialog(null, "Hola "+ tF1.getText());
            }
            
});
        
    }
    
}
