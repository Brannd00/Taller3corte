/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author brann
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double monto)
            throws MontoInvalidoException {

        if (monto <= 0) {
            throw new MontoInvalidoException(monto);
        }

        saldo += monto;

        System.out.println("Deposito realizado correctamente.");
    }

    public void retirar(double monto)
            throws MontoInvalidoException, SaldoInsuficienteException {

        if (monto <= 0) {
            throw new MontoInvalidoException(monto);
        }

        if (monto > saldo) {
            throw new SaldoInsuficienteException(saldo, monto);
        }

        saldo -= monto;

        System.out.println("Retiro realizado correctamente.");
    }
}
