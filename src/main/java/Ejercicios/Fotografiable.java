/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author brann
 */
public interface Fotografiable {
    void tomarFoto();
    int getMegapixeles();
    default String funcion() {
        return "Fotografia";
    }
}
