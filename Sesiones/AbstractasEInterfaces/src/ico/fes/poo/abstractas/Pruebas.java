/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.abstractas;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Fabian
 */
public class Pruebas {
    public static void main(String[] args) {
        Flauta f = new Flauta("Stevenson", 1987);
        
        
        f.afinar();
        f.Limpiar();
        f.tocar();
        System.out.println(f.obtenerTipoInstrumento());
        
        System.out.println("\n --------------------------------- \n");
        Guitarra g = new Guitarra("Mercury", 1991);
        
        g.afinar();
        g.Limpiar();
        g.tocar();
        System.out.println(g.obtenerTipoInstrumento());
        
        JFrame ventana = new JFrame("Hola ventana");
        ventana.setSize(600, 400);
        ventana.getContentPane().add(new JButton("Presioname"));
        ventana.setVisible(true);
        
        JButton btn = new JButton();
        btn.setSize(50,15);
    }
    
}
