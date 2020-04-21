/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraylist;

import ico.fes.poo.tarea.Empleado;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Fabian
 */
public class EjercicioArrayList {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float total = 0;
        
        ArrayList<Empleado> listaE = new ArrayList<Empleado>();
        
        listaE.add(new Empleado("José Garcia Pérez", "Sistemas", 670.00f, 30, 5));
        listaE.add(new Empleado("Diana Herrera Pérez", "Recursos humanos", 450.00f, 25, 0));
        listaE.add(new Empleado("Jessica Juarez Días", "Ventas", 400.00f, 28, 0));
        listaE.add(new Empleado("Pedro Paz Orozco", "Ventas", 410.00f, 30, 0));
        listaE.add(new Empleado("José Marcel Pérez", "Sistemas", 680.00f, 29, 6));
        listaE.add(new Empleado("Jesus Días Garcia", "Recursos humanos", 455.00f, 30, 0));
        listaE.add(new Empleado("Pedro Xotla Ramirez", "Sistemas", 675.00f, 27, 0));
        listaE.add(new Empleado("Javier Medina Blanco", "Ventas", 400.00f, 30, 4));
        listaE.add(new Empleado("Elizabeth Villa Sosa", "Sistemas", 670.00f, 30, 3));
      
        System.out.println("Numero de empleados: " + listaE.size());
        
       
        
        Iterator<Empleado> i = listaE.iterator();
        while (i.hasNext() ) {
            System.out.println("\n ----------------------------------------------");
            System.out.println(i.next());
            
        }
        Iterator<Empleado> i2 = listaE.iterator();
        float a = 0;
        float t = 0; 
        while (i2.hasNext()) {
                Empleado f = (Empleado) i2.next();
                a = f.getSueldoDiario() * f.getDiasTrab() + f.getHorasEx() * 85;
                t += a;  
        }
        System.out.println("\n ++++++++++++++++++++++++++");
        System.out.println("La suma total del salario de todos los empleados es de : "+t+"$");
          
        Iterator<Empleado> i3 = listaE.iterator();
        
        int dm = 100;
        String nm = null;
        while (i3.hasNext()) {
            Empleado d = (Empleado) i3.next();
            if (d.getDiasTrab()<dm ) {
                dm = d.getDiasTrab();
                nm = d.getNombre();
            }
        }
        System.out.println("\n ***************************");
        System.out.println("El empleado: " + nm + ". \n Fue el que menos dias trabajó con: " + dm + " Dias.");

        Iterator<Empleado> i4 = listaE.iterator();
        
        int hm = 0;
        String nom = null;
        while (i4.hasNext()) {
            Empleado h = (Empleado) i4.next();
            if (h.getHorasEx()>hm ) {
                hm = h.getHorasEx();
                nom = h.getNombre();
            }
        }
        System.out.println("\n -+-+--+-+-+-+-+-+-+-++-");
        System.out.println("El empleado: " + nom + ". \n Tuvo mayor numero de horas extra con: "+hm+" hrs.");
        
        System.out.println(" \n \n Fin del programa. !!!!  :D");
        
        
        
       
            
        
            
        
        
        
        
        }
    
}
