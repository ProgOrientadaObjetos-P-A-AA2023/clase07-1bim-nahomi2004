/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;


/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        String nombreArchivo = "calificaciones.data";

        Ciudad c1 = new Ciudad("Loja", "Loja");
        Ciudad c2 = new Ciudad("Zamora", "Zamora Chinchipe");
        Ciudad c3 = new Ciudad("Cuenca", "Azuay");
        Ciudad c4 = new Ciudad("Quito", "Pichincha");
        Ciudad c5 = new Ciudad("Guayaquil", "Guayas");

        Hospital h1 = new Hospital("Isisdro Ayora",400,2000,c1);
        Hospital h2 = new Hospital("Mugrovejo",200,1000,c2);
        Hospital h3 = new Hospital("San Pablo",500,3000,c3);
        Hospital h4 = new Hospital("San Francisco",300,4000,c4);
        Hospital h5 = new Hospital("Manuel Ignacio",250,1000,c5);

        Hospital[] lista = {h1, h2, h3, h4, h5};

        EscrituraArchivoSecuencial archivo = new
        EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            archivo.establecerRegistro(lista[i]);
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
    }
}
