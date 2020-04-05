/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Practica_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        float sue, phe, nsue;
        int cate, he;
        
        System.out.println("Introduzca el sueldo del trabajador: ");
        sue = S.nextFloat();
        
        System.out.println("Introduzca la categoria del trabajador (1-4)");
        cate = S.nextInt();
        
        System.out.println("Introduzca la horas extras del trabajador: ");
        he = S.nextInt();
        
        switch (cate) {
            case 1:
                phe = 30;
                break;
            case 2:
                phe = 38;
                break;
            case 3:
                phe = 50;
                break;
            case 4:
                phe = 70;
                break;
            default:
                phe = 0;
                break;
        }
        
        if (he > 30) {
            
            nsue = sue + 30*phe;
            
        }
        else {
            
            nsue = sue + he*phe;
            
        }
        
        System.out.println("El nuevo sueldo del trabajador sera:" + nsue);
    }
    
}
