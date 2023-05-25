/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    private Ciudad ciudad;
    
    public Hospital (String n, int num, double p, Ciudad c) {
        nombre = n;
        numeroCamas = num;
        presupuesto = p;
        ciudad = c;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumeroCamas(int n) {
        numeroCamas = n;
    }

    public void establecerPresupuesto(double n) {
        presupuesto = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }    
    
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }  
    
}