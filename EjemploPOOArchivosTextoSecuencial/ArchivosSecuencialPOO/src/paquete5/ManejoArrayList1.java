/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList1 {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        // Arreglo
        Profesor [] profesores = new Profesor[2];
        profesores[0] = prof1;
        profesores[1] = prof2;
        
        for (int i = 0; i < profesores.length; i++) {
            System.out.printf("%s - %s\n", profesores[i].obtenerNombre(),
                    profesores[i].obtenerTipo());
        }
        // Esto me va aimprimir a los dos objetos antes creados, o sea
        // a Joseph y a David
        
        System.out.println("-----------------------------");
        
        prof1.establecerNombre("Joseph Jimenez 2.0");
        prof2.establecerNombre("David Jones 2.0");
        
        // ArrayList
        ArrayList <Profesor> profesores2 = new ArrayList<>();
        profesores2.add(prof1);
        profesores2.add(prof2);
        
        for (int i = 0; i < profesores2.size(); i++) {
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
        }
        
        // Este for hace lo mismo que arriba, sin embargo, en vez de imprimir
        // lo del arreglo normal, imprime lo que hay en en el ArrayList.
        // Para entenderlo mejor, esto imprimirá un Joseph 2.0 y un David 2.0
        
        System.out.println("-----------------------------");
        
        prof1.establecerNombre("Joseph Jimenez 3.0");
        prof2.establecerNombre("David Jones 3.0");
        
        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");
        profesores2.add(prof3);
        
        for (int i = 0; i < profesores2.size(); i++) {
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
        }
        
        // Por lo visto los ArrayList no tiene un tamaño definido, sino los
        // elementos pueden ser añadidos y estos tipos de variables (? van 
        // creciendo.
        // Para comprobarlo este imprimirá un Joseph 3.0, un David 3.0 y un 
        // nuevo objeto llamado Melissa
        
        // Es que es simplemente increíble como cambian tan fácil los valores
    }
}
