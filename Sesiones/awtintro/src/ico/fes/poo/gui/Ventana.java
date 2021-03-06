
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Fabian
 */
public class Ventana extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;

    public Ventana() throws HeadlessException {
        super("Sin titulo");
        super.setSize(200,200);
    }

    public Ventana(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        super.setSize(ancho, alto);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        boton1 = new Button("Norte");
        boton2 = new Button("Sur");
        boton3 = new Button("Este");
        boton4 = new Button("Oeste");
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        
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
