/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Sesion_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList();
        nombre.add("Jose");
        nombre.add("Jaqueline");
        nombre.add("Diana");
        nombre.add("Diego");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un entero: ");
        int indice = 0;
        
        try{
        indice = teclado.nextInt();
        System.out.println("Elemento :" + nombre.get( indice ));
        }
        catch(IndexOutOfBoundsException e){
            
            System.out.println(e.toString());
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Fin del programa :D");
        
    }
    
}
