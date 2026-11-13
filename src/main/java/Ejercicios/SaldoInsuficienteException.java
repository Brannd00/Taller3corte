/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author brann
 */
public class SaldoInsuficienteException extends Exception {

    private double faltante;

    public SaldoInsuficienteException(double saldo, double monto) {
        super("Saldo insuficiente. Saldo: $" + saldo + " - Faltan: $" + (monto - saldo));

        this.faltante = monto - saldo;
    }

    public double getFaltante() {
        return faltante;
    }
}
