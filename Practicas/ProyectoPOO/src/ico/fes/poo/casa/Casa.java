/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.casa;

/**
 *
 * @author Fabian
 */
public class Casa {
    private String material;
    private int numCuartos;
    private int numPatios;
    private int numPlantas;

    public Casa() {
    }

    public Casa(String material, int numCuartos, int numPatios, int numPlantas) {
        this.material = material;
        this.numCuartos = numCuartos;
        this.numPatios = numPatios;
        this.numPlantas = numPlantas;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumCuartos() {
        return numCuartos;
    }

    public void setNumCuartos(int numCuartos) {
        this.numCuartos = numCuartos;
    }

    public int getNumPatios() {
        return numPatios;
    }

    public void setNumPatios(int numPatios) {
        this.numPatios = numPatios;
    }
    
    
}
