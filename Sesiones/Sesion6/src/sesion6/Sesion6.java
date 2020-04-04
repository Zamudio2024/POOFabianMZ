/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion6;

import ico.fes.is.marvel.SuperHeroe;

/**
 *
 * @author Fabian
 */
public class Sesion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperHeroe spiderMan = new SuperHeroe();
        spiderMan.setNombre("Peter Parker");
        spiderMan.setEdad(16);
        spiderMan.setAlias("Spider-Man!!!");
        spiderMan.setPoder("Trepar paredes, Super fuerza, Sentido aracndio.");
        System.out.println(spiderMan);
    }
    
}
