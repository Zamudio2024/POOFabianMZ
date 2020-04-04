/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

import ico.fes.poo.Fruta;
import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Fruta> listaF = new ArrayList<Fruta>();
        
        listaF.add(new Fruta("Fresa", 15.50f, "Rojo."));
        listaF.add(new Fruta("Mango", 18.0f, "Amarillo."));
        listaF.add(new Fruta("Mandarina", 23.5f, "Naranja."));
        listaF.add(new Fruta("Limon", 13.0f, "Verde."));
        listaF.add(new Fruta("Cereza", 16.4f, "Rojo."));
        listaF.add(new Fruta("Lima", 15.4f, "Rojo."));
        listaF.add(new Fruta("Mora", 32.93f, "Rojo."));
        listaF.add(new Fruta("Uva", 30.2f, "Rojo."));
        listaF.add(new Fruta("Papaya", 20.1f, "Rojo."));
        listaF.add(new Fruta("Melon", 12.5f, "Rojo."));
        listaF.add(new Fruta("Sandia", 25.4f, "Rojo."));
        listaF.add(new Fruta("Cereza", 16.4f, "Rojo."));
        System.out.println("Tamaño del arreglo: " + listaF.size());
        
        for (Fruta fruta : listaF) {
            System.out.println("-+-+-+-+-+-+-+-+-");
            System.out.println(fruta);
            
        }
    }
    
}
