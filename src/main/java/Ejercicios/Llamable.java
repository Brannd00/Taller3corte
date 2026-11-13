/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author brann
 */
public interface Llamable {
    void llamar(String numero);
    void colgar();
    default String funcion() { 
        return "Llamadas"; 
    }
}
