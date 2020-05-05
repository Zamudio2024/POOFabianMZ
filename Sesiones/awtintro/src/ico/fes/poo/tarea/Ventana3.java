/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.tarea;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Fabian
 */
public class Ventana3 extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;

    public Ventana3() throws HeadlessException {
        super("Sin titulo");
        super.setSize(200,200);
    }

    public Ventana3(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        super.setSize(ancho, alto);
        this.setResizable(false);
        this.setLayout(new GridLayout(3,1));
        boton1 = new Button("Presioname");
        boton2 = new Button("En segundo lugar este");
        boton3 = new Button("Despues a este");
        boton4 = new Button("Por ultimo a este");
        this.add(boton1, 0);
        this.add(boton2, 1);
        this.add(boton3, 2);
        this.add(boton4, 3);
        
        super.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }

                }
        );

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
}

