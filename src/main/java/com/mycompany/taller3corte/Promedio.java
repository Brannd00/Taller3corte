/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3corte;
import java.util.Scanner;
/**
 *
 * @author brann
 */
public class Promedio {

    public static double promedio(double[] notas) {

        if (notas.length == 0) {
            throw new IllegalArgumentException("No hay notas");
        }

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        return suma / notas.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Total de notas: ");
            int n = Integer.parseInt(sc.nextLine());

            if (n <= 0) {
                throw new IllegalArgumentException(
                    "La cantidad debe ser mayor que cero"
                );
            }

            double[] notas = new double[n];

            for (int i = 0; i < n; i++) {

                System.out.print("Ingrese la nota " + (i + 1) + ": ");

                double nota = Double.parseDouble(sc.nextLine());

                if (nota < 0 || nota > 5) {
                    throw new IllegalArgumentException(
                        "La nota debe estar entre 0 y 5"
                    );
                }

                notas[i] = nota;
            }

            System.out.println("Promedio: " + promedio(notas));

        } catch (NumberFormatException e) {

            System.out.println("Dato invalido. Ingrese un numero.");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            sc.close();

        }
    }
}