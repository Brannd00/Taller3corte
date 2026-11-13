/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author brann
 */
public class Camara extends Dispositivo implements Fotografiable {

    private int megapixeles;

    public Camara(String marca, String modelo, double precio, int megapixeles) {
        super(marca, modelo, precio);
        this.megapixeles = megapixeles;
    }

    @Override
    public void describir() {
        System.out.println("Cámara " + marca + " " + modelo + " - $" + String.format("%,.0f", precio).replace(",", ".") + " - " + funcion());
    }

    @Override
    public void tomarFoto() {
        System.out.println(marca + " tomó una foto profesional de " + megapixeles + " MP");
    }

    @Override
    public int getMegapixeles() {
        return megapixeles;
    }
}