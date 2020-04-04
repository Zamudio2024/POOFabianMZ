/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Fabian
 */
public class SmarthPhone {
    private String marca;
    private float precio;
    private float tamañoPantalla; //pulgadas

    public SmarthPhone() {
    }

    public SmarthPhone(String marca, float precio, float tamañoPantalla) {
        this.marca = marca;
        this.precio = precio;
        this.tamañoPantalla = tamañoPantalla;
    }

    public float getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(float tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String res = "Marca: " + this.marca;
        res += "\n precio: "+this.precio;
        res += "\n Tamaño de pantalla: "+this.tamañoPantalla+"\"" ;
        return res;
    }
    
    
}
