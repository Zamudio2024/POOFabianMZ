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
public class Guitarra extends Instrumento{
    private String marca;

    public Guitarra() {
    }

    public Guitarra(String marca, int anioFabricacion) {
        super(anioFabricacion);
        this.marca = marca;
    }

    @Override
    public void tocar() {
        System.out.println("Posicionar los dedos sobre las cuerdas");
        System.out.println("Mover la mano de arriba y abajo");
        System.out.println("Emitiendo sonidos...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la guitarra...");
    }
    
    public void Limpiar(){
        System.out.println("Limpiando la guitarra...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String obtenerTipoInstrumento() {
        return "Instrumento de musica de cuerda, es una guitarra!";
    }
    
    
}
