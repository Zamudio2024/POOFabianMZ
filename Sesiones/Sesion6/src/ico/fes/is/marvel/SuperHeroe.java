/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.marvel;

import ico.fes.is.Persona;

/**
 *
 * @author Fabian
 */
public class SuperHeroe extends Persona{
    private String alias;
    private String poder;

    public SuperHeroe() {
    }

    public SuperHeroe(String alias, String poder, String nombre, int edad) {
        super(nombre, edad);
        this.alias = alias;
        this.poder = poder;
    }
    

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
       
    @Override
    public String toString(){
        String res = super.toString();
        res= res + "Nombre clave:" + this.alias;
        res = res + "Poder:" + this.poder;
        
        return res;
        
    }
}
