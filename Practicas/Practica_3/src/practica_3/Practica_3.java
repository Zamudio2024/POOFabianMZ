/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3;

import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Practica_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        int tipoenf, edad, dias;
        float costot = 0;
        
        System.out.println("Introduzca el tipo de enfermedad (1-4): ");
        tipoenf = S.nextInt();
        
        System.out.println("Introduzca la edad del paciente: ");
        edad = S.nextInt();
        
        System.out.println("Introduzca los dias que estuvo internado: ");
        dias = S.nextInt();
        
        switch (tipoenf) {
            case 1:
            costot = dias * 25;
            break;
            
            case 2:
            costot = dias * 16;
            break;
            
            case 3:
            costot = dias * 20;
            break;
            
            case 4:
            costot = dias * 32;
            break;
        }
        
        System.out.println(costot);
        
        if (edad >= 14 && edad <= 22){
            
           costot = (float)(costot* 1.10);
            
        }
        else{
            
            System.out.println("El costo total es: "+costot);
        }
    }
    
}
