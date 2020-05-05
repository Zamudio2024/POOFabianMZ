/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtintro;

import ico.fes.poo.gui.Ventana;
import ico.fes.poo.tarea.Ventana2;
import ico.fes.poo.tarea.Ventana3;
import ico.fes.poo.tarea.Ventana4;

/**
 *
 * @author Fabian
 */
public class Awtintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v = new Ventana("Mi primer ventana", 400, 500);
        v.setVisible(true);
        
        Ventana2 v2 = new Ventana2("Mi segunda ventana", 400, 500);
        v2.setVisible(true);
        
        Ventana3 v3 = new Ventana3("Mi tercer ventana", 400, 500);
        v3.setVisible(true);
        
        Ventana4 v4 = new Ventana4("Mi cuarta ventana", 400, 500);
        v4.setVisible(true);
    }
    
}
