/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller3corte;

import Ejercicios.Dispositivo;
import Ejercicios.Fotografiable;
import Ejercicios.Llamable;
import Ejercicios.Smartphone;
import Ejercicios.Camara;
/**
 *
 * @author brann
 */
public class Taller3corte {

    public static void main(String[] args) {
             Dispositivo[] dispositivos = {
            new Smartphone("Samsung", "Galaxy S24", 3_500_000, 50),
            new Smartphone("Xiaomi", "Redmi Note 13 Pro", 1_400_000, 108),
            new Camara("Canon", "EOS R50", 4_200_000, 24)
        };

        int mayorResolucion = 0;

        for (Dispositivo d : dispositivos) {
            d.describir();

            if (d instanceof Fotografiable f) {
                f.tomarFoto();
                mayorResolucion = Math.max(mayorResolucion, f.getMegapixeles());
            }

            if (d instanceof Llamable l) {
                l.llamar("3001234567");
                l.colgar();
            }
            System.out.println();
        }

        System.out.println("Mayor resolucion: " + mayorResolucion + " MP");
    }
}
