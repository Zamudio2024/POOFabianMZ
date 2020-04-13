/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_5;

/**
 *
 * @author Fabian
 */
public class Practica_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //<>
        
        int  PRI,SEG,SIG;
        
        PRI =0;
        SEG =1;
        SIG =0;
        for (int i = 3; i <= 180 ; i++) {
            SIG = PRI + SEG;
            PRI = SEG;
            SEG = SIG;
            
            
        }
        
        System.out.println("El numero siguiente es: "+SIG);
    }
    
}
