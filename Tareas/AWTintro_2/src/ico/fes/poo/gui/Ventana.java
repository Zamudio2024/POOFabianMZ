/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ico.fes.poo.gui.eventos.EventoGenerico;
import ico.fes.poo.gui.eventos.EventosRaton;
import ico.fes.poo.gui.eventos.EventosVentana;
/**
 *
 * @author Fabian
 */
public class Ventana extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    private Button btn1;
    private Button btn2;

    public Ventana() throws HeadlessException {
    }

    public Ventana(int alto, int ancho, String string) throws HeadlessException {
        super(string);
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(this.ancho, this.alto);
        btn1 = new Button("Presioname 1");
        btn2 = new Button("Presioname 2");
        
        this.setLayout(new FlowLayout());
        this.add(btn1);
        this.add(btn2);
        this.add(new Button("Presioname 3"));
        this.add(new Button("Presionmae 4"));
        
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Evento click raton");
                System.out.println(e.getX());
                System.out.println(e.getY());
            }
            
        } );
        
        btn1.addActionListener(new EventoGenerico());
        this.addWindowListener(new EventosVentana());
        btn2.addMouseListener(new EventosRaton());
    }
    
    
    
}
