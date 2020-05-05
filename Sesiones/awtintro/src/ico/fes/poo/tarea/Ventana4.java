/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.tarea;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.HeadlessException;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Fabian
 */
public class Ventana4 extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    

    public Ventana4() throws HeadlessException {
        super("Sin titulo");
        super.setSize(200,200);
    }

    public Ventana4(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        super.setSize(ancho, alto);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gbg = new GridBagLayout();
        setLayout(gbg);
        gbc.fill =GridBagConstraints.BOTH;
        gbc.weightx=1.0;
        
        Button boton0=new Button("Botón 0");
        gbg.setConstraints(boton0,gbc);
        add(boton0);
        Button boton1=new Button("Botón 1");
        gbg.setConstraints(boton1,gbc);
        add(boton1);
        Button boton2=new Button("Botón 2");
        gbg.setConstraints(boton2,gbc);
        add(boton2);
        
        gbc.gridwidth= GridBagConstraints.REMAINDER;
        Button boton3=new Button("Botón 3");
        gbg.setConstraints(boton3,gbc);
        add(boton3);
        
        gbc.anchor= GridBagConstraints.BELOW_BASELINE;
        Button boton4=new Button("Botón 4");
        gbg.setConstraints(boton4,gbc);
        add(boton4);
        
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