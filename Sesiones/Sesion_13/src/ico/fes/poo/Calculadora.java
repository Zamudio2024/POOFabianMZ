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
public class Calculadora {
    Aritmetica arit;

    public Calculadora() {
    }

    public Calculadora(Aritmetica arit) {
        this.arit = arit;
    }

    public Aritmetica getArit() {
        return arit;
    }

    public void setArit(Aritmetica arit) {
        this.arit = arit;
    }
    
    public void setValores(float op1, float op2, int oper)throws Exception{
        
        arit.setOp1(op1);
        arit.setOp2(op2);
        arit.setOperando(oper);
    }
    public float calcular(){
        float res = 0.0f;
        switch (arit.getOperando()) {
            case 1: // sum
                res = arit.getOp1() + arit.getOp2();
                break;
            case 2: // res
                res = arit.getOp1() - arit.getOp2();
                break;
            case 3: // mult
                res = arit.getOp1() * arit.getOp2();
                break;
            case 4: // div
                res = arit.getOp1() / arit.getOp2();
                break;
            
                
                
            
        }
      return res;
    }
    
}
