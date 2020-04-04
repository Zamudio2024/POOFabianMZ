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
public class Fruta {
    private String fruta;
    private float precio;
    private String color;

    public Fruta() {
    }

    public Fruta(String fruta, float precio, String color) {
        this.fruta = fruta;
        this.precio = precio;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String res = "Fruta: " + this.fruta;
        res += "\n Precio: " + this.precio+ "$";
        res += "\n Color: " + this.color;
        return res;
    }
    
    
}
