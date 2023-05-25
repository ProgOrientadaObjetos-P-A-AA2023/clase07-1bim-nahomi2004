/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author D E L L
 */

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.*;

public class ManejoArrayList4 {
    public static void main(String[] args) {
        String linea = "Gardenia Villacis; contratado";
        
        ArrayList<String> linea_partes = new ArrayList<>(
            Arrays.asList(linea.split(";")) 
            // ["Gardenia Villacis","contratado"]
        );
        
        Profesor profe = new Profesor(linea_partes.get(0),
        linea_partes.get(1));
        
        System.out.println(profe);
    }
}
