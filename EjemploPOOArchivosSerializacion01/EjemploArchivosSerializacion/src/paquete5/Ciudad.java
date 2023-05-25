/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author SALA I
 */
public class Ciudad implements Serializable {
    private String nombre;
    private String provincia;   
    
    public Ciudad (String n, String p) {
        nombre = n;
        provincia = p;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerProvincia(String p) {
        provincia = p;
    }
}
