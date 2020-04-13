/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.arreglos;

import ico.fes.poo.SmarthPhone;
import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class PruebaArrayList {
    public static void main(String[] args) {
        ArrayList<SmarthPhone> celulares= new ArrayList();
        celulares.add(new SmarthPhone("Nokia", 270.0f, 4.1f));
        celulares.add(new SmarthPhone("Xiaomi", 12000.0f, 6.0f));
        
        for (SmarthPhone cel : celulares) {
            System.out.println("+-+-+-+-+-+-+-+-+-+-");
            System.out.println(cel);
        }
        celulares.add(1, new SmarthPhone("Motorola", 11000.0f, 5.3f));
        
        for (SmarthPhone cel : celulares) {
            System.out.println("*********************");
            System.out.println(cel);
        }
        SmarthPhone y = celulares.set(1, new SmarthPhone("Alcatel", 7000.0f, 4.6f));
        System.out.println("????????????? Y");
        System.out.println(y);
        
        for (SmarthPhone cel : celulares) {
            System.out.println(";;;;;;;;;;;;;;");
            System.out.println(cel);
        }
        
        SmarthPhone z =celulares.remove(1);
        System.out.println("???????????????? Z");
        System.out.println(z);
        
        for (SmarthPhone cel : celulares) {
            System.out.println("%%%%%%%%%%%%%%%%%%%");
            System.out.println(cel);
        }
        SmarthPhone r = celulares.get(0);
        System.out.println("???????????????? R");
        System.out.println(r);
        
        SmarthPhone s = celulares.get(1);
        System.out.println("????????????? S");
        System.out.println(s);
        
        celulares.set(1, new SmarthPhone("ZTE", 5.0f, 3.0f));
        System.out.println("????????????? S");
        System.out.println(s);
        
        for (SmarthPhone cel : celulares) {
            System.out.println("&&&&&&&&&&&&&&&");
            System.out.println(cel);
            
        }
        //SmarthPhone t = celulares.get(2);
        
        for (int i = 0; i < celulares.size(); i++) {
            System.out.println("++++++++++++++++++");
            System.out.println(celulares.get(i));
            
        }
        
    }
}
