/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3corte;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author brann
 */
public class ProcesarNotas {

    public static void main(String[] args) {

        int procesados = 0;
        int errores = 0;
        int numeroLinea = 1;

        try {

            BufferedReader br = new BufferedReader(new FileReader("notas.csv"));

            PrintWriter pw = new PrintWriter(new FileWriter("reporte.csv"));

            pw.println("codigo,nombre,promedio,estado");

            br.readLine();

            String linea;

            while ((linea = br.readLine()) != null) {

                numeroLinea++;

                try {
                    String[] datos = linea.split(",", -1);
                    if (datos.length != 5) {
                        throw new IllegalArgumentException("Debe tener codigo, nombre y 3 notas.");
                    }

                    String codigo = datos[0];
                    String nombre = datos[1];

                    double nota1 = Double.parseDouble(datos[2]);
                    double nota2 = Double.parseDouble(datos[3]);
                    double nota3 = Double.parseDouble(datos[4]);

                    double promedio = (nota1 + nota2 + nota3) / 3;

                    String estado;

                    if (promedio >= 3.0) {
                        estado = "APROBADO";
                    } else {
                        estado = "REPROBADO";
                    }

                    pw.println(codigo + "," + nombre + "," + String.format(Locale.US, "%.2f", promedio)+ "," + estado);

                    procesados++;

                } catch (NumberFormatException e) {

                    errores++;

                    System.out.println("Línea " + numeroLinea + ": Error, una nota no es numerica.");

                } catch (IllegalArgumentException e) {

                    errores++;

                    System.out.println("Linea " + numeroLinea + ": Error, " + e.getMessage());
                }
            }

            br.close();
            pw.close();

            System.out.println("RESUMEN");
            System.out.println("Registros procesados: " + procesados);
            System.out.println("Registros con error: " + errores);
            System.out.println("Reporte generado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al trabajar con archivos: "
                    + e.getMessage());
        }
    }
}
