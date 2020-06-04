/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.casa.practica;

/**
 *
 * @author Fabian
 */
public class Celular {
    private String marca;
    private String compañiaTel;
    private String sistemaOp;
    private float pulgadas;
    private float precio;
    

    public Celular() {
    }

    public Celular(String marca, String compañiaTel, String sistemaOp, float pulgadas, float precio) {
        this.marca = marca;
        this.compañiaTel = compañiaTel;
        this.sistemaOp = sistemaOp;
        this.precio = precio;
        this.pulgadas = pulgadas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCompañiaTel() {
        return compañiaTel;
    }

    public void setCompañiaTel(String compañiaTel) {
        this.compañiaTel = compañiaTel;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Celular { " + "Marca: " + marca + ", Compañia telefonica: " + compañiaTel + ", Sistema Operativo: " + sistemaOp + ", Pulgadas: " + pulgadas + ", Precio: " + precio + "}";
    }
    
    
}
