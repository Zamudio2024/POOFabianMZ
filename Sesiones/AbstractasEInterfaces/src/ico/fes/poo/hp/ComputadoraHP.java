/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.hp;

import ico.fes.poo.Aritmetica;

/**
 *
 * @author Fabian
 */
public class ComputadoraHP implements Aritmetica {

    @Override
    public float sumar(float a, float b) {
        return a + b;
    }

    @Override
    public float restar(float a, float b) {
        return a - b;
    }

    @Override
    public float multiplicar(float a, float b) {
        return a * b;
    }

    @Override
    public float dividir(float a, float b) {
        return a / b;
    }
    
    

}
