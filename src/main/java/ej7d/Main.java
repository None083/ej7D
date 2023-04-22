/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7d;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        
        ServiciosFicheros.lecturaDeportivo("Deportivos.txt", listaVehiculos);
        ServiciosFicheros.lecturaTurismo("Turismos.txt", listaVehiculos);
        ServiciosFicheros.lecturaElectrico("Electricos.txt", listaVehiculos);
        
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
        
        ServiciosFicheros.escrituraDeportivo("Deportivos.csv", listaVehiculos);
        ServiciosFicheros.escrituraElectrico("Electricos.csv", listaVehiculos);
        ServiciosFicheros.escrituraTurismo("Turismos.csv", listaVehiculos);
        
        ServiciosFicheros.copiarFicheros("Deportivos.csv", "copias/Deportivos.csv");
        ServiciosFicheros.copiarFicheros("Electricos.csv", "copias/Electricos.csv");
        ServiciosFicheros.copiarFicheros("Turismos.csv", "copias/Turismos.csv");
        
    }
    
}
