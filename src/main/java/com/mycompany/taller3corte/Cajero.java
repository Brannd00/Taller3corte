/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3corte;
import Ejercicios.CuentaBancaria;
import Ejercicios.MontoInvalidoException;
import Ejercicios.SaldoInsuficienteException;
import java.util.Scanner;

/**
 *
 * @author brann
 */
public class Cajero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria("Juan", 500000);

        int opcion = 0;

        try {

            do {

                System.out.println("CAJERO AUTOMATICO");
                System.out.println("1. Consultar");
                System.out.println("2. Depositar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                System.out.print("Opción: ");

                try {

                    opcion = Integer.parseInt(sc.nextLine());

                    switch (opcion) {

                        case 1:

                            System.out.println("Titular: " + cuenta.getTitular());
                            System.out.println("Saldo actual: $" + cuenta.getSaldo());

                            break;

                        case 2:

                            System.out.print("Monto a depositar: ");
                            double deposito = Double.parseDouble(sc.nextLine());

                            try {
                                cuenta.depositar(deposito);

                            } catch (MontoInvalidoException e) {
                                System.out.println(e.getMessage());
                            }

                            break;

                        case 3:

                            System.out.print("Monto a retirar: ");
                            double retiro = Double.parseDouble(sc.nextLine());

                            try {
                                cuenta.retirar(retiro);

                            } catch (MontoInvalidoException e) {
                                System.out.println(e.getMessage());

                            } catch (SaldoInsuficienteException e) {
                                System.out.println(e.getMessage());
                            }

                            break;

                        case 4:

                            System.out.println("Gracias por utilizar el cajero.");

                            break;

                        default:

                            System.out.println("Opción invalida. Intente nuevamente.");

                    }

                } catch (NumberFormatException e) {

                    System.out.println("Error: debe ingresar un numero.");

                }

            } while (opcion != 4);

        } finally {

            sc.close();
            System.out.println("Scanner cerrado.");

        }
    }
}
