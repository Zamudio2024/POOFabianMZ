/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_11;

import ico.fes.poo.SmarthPhone;
import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Sesion_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SmarthPhone> listaCells = new ArrayList<SmarthPhone>();
        
        listaCells.add(new SmarthPhone("Apple", 22000.f, 5.7f));
        listaCells.add(new SmarthPhone("Huawei", 12000.0f, 7.0f));
        listaCells.add(new SmarthPhone("Samsung", 14000.0f, 7.3f));
        
        System.out.println("Tamaño del arreglo: "+ listaCells.size());
        
        SmarthPhone x = listaCells.get(0);
        System.out.println("----------------------");
        System.out.println(x);
        
        SmarthPhone y = listaCells.get(1);
        System.out.println("----------------------");
        System.out.println(y);
        
        SmarthPhone z = listaCells.get(2);
        System.out.println("----------------------");
        System.out.println(z);
        
        for (SmarthPhone cell : listaCells) {
            System.out.println("+-+-+-+-+-+-+-+-+-");
            System.out.println(cell);
            
        }
    }
    
}
