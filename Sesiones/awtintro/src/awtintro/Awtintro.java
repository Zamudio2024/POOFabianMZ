/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtintro;

import ico.fes.poo.gui.Ventana;

/**
 *
 * @author Fabian
 */
public class Awtintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
        
        Ventana v2 = new Ventana("Hola mundo", 800, 600);
        v2.setVisible(true);
    }
    
}