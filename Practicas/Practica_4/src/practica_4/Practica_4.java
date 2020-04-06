/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Practica_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //<>
        
        char band = 'T';
        int sumser = 0, I =2;
        
        while (I <= 1800) {
            
            sumser += I;
            
            System.out.println("El valor de I es: "+ I);
            
            if (band == 'T') {
                
                band = 'F';
                I+= 3;
                
            }else{
                
                band = 'T';
                I += 2;
                
                
            }
            
            
            
        }
        
        System.out.println("La suma de la series es: "+ sumser);
    }
    
}