/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.abstractas;

/**
 *
 * @author Fabian
 */
public class Flauta extends Instrumento{
    private String marca;
    
    public Flauta() {
    }

    public Flauta(String marca, int anioFabricacion) {
        super(anioFabricacion);
        this.marca = marca;
    }
    
    
    
    @Override
    public void tocar() {
        System.out.println("Posicionar los dedos sobre la flauta");
        System.out.println("Soplar sobre la boquilla");
        System.out.println("Emitiendo sonidos...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la flauta...");
    }
    
    public void Limpiar(){
        System.out.println("Limpiando la flauta...");
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String obtenerTipoInstrumento() {
        return "Instrumento de musica de viento, es una flauta!";
    }
    
    
}
