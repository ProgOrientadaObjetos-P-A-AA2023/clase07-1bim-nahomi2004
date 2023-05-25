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
import paquete1.Profesor02;

public class ManejoArrayList5 {
    public static void main(String[] args) {
        String[] lineas = {"Gardenia Villacis|contratado|25",
        "Carlos, Lobos|factura|35","Luan Vivanco|nombramiento|40"};
    
        String nombre;
        String tipo;
        int edad;
    
        Profesor02[] profes = new Profesor02 [lineas.length];
    
        for (int i=0; i<lineas.length ;i++){
            ArrayList<String> lineas_partes = new ArrayList<>(
                    Arrays.asList(lineas[i].split("\\|")));
            // ese \\| sirve para que los saltos de lineas sean cuando hay
            // una barrita de esas separando a la cadena
            
            // Curiosamente lineas_partes y lineas están conectadas
            
            nombre=lineas_partes.get(0);
            tipo=lineas_partes.get(1);
            edad=Integer.parseInt(lineas_partes.get(2));


            profes[i]=new Profesor02(nombre,tipo,edad);
            System.out.printf("%s",profes[i]);
        }
    }    
}
