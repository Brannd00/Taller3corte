/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3corte;
import Ejercicios.Bitacora;
import java.io.*;
import java.util.List;
/**
 *
 * @author brann
 */
public class PruebaBitacora {

    public static void main(String[] args) {

        Bitacora bitacora = new Bitacora();

        try {

            bitacora.registrar("Sistema iniciado");
            bitacora.registrar("ERROR al conectar con la base de datos");
            bitacora.registrar("Usuario inicio sesion");
            bitacora.registrar("ERROR al guardar iinformacion");

            System.out.println("BITACORA DE EVENTOS");

            List<String> eventos = bitacora.leer();

            for (int i = 0; i < eventos.size(); i++) {
                System.out.println(eventos.get(i));
            }

            int errores = bitacora.contar("ERROR");

            System.out.println("\nTotal de errores: " + errores);

            try {

                BufferedReader br = new BufferedReader(
                        new FileReader("noexiste.txt"));

                br.close();

            } catch (FileNotFoundException e) {

                System.out.println(
                        "\nEl archivo noexiste.txt no existe.");
            }

        } catch (IOException e) {

            System.out.println("Error al trabajar con archivos: "
                    + e.getMessage());
        }
    }
}