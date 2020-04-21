/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.tarea;

/**
 *
 * @author Fabian
 */
public class Empleado {
    private String nombre;
    private String departamento;
    private float sueldoDiario;
    private int diasTrab;
    private int horasEx;
    int total = 0;

    public Empleado() {
    }

    public Empleado(String nombre, String departamento, float sueldoDiario, int diasTrab, int horasEx) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldoDiario = sueldoDiario;
        this.diasTrab = diasTrab;
        this.horasEx = horasEx;
    }

    public int getHorasEx() {
        return horasEx;
    }

    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(float sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public int getDiasTrab() {
        return diasTrab;
    }

    public void setDiasTrab(int diasTrab) {
        this.diasTrab = diasTrab;
    }
    
    

    @Override
    public String toString() {
        String res = "Nombre del empleado: " + this.nombre;
        res += " \n Departamento donde trabaja: " + this.departamento;
        res += "\n Sueldo diario: " + this.sueldoDiario + "$";
        res += "\n Dias trabajados: " + this.diasTrab + " Días";
        res += "\n Horas extras que trabajó: " + this.horasEx + " Horas";
        res += "\n Salario mensual: " + this.diasTrab * this.sueldoDiario + "$";
        res += "\n Monto por horas extras para el empleado si 1hr = 85$: " + this.horasEx * 85 + "$";
        res += "\n Salario total del empleado: " + (this.sueldoDiario * this.diasTrab+this.horasEx * 85) + "$";
        return res;
        
    }
    
   
        
    


    
    
}
