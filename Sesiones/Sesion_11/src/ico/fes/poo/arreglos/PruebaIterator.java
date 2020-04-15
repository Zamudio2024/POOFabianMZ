/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.arreglos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Fabian
 */
public class PruebaIterator {
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList();
        
        nombres.add("Cesar");
        nombres.add("Gema");
        nombres.add("David");
        nombres.add("Roberto");
        
        Iterator<String> iterator = nombres.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase().charAt(0));
            
        }
            
    }
}
