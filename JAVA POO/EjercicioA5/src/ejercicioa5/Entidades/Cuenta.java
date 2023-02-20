package ejercicioa5.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Cuenta {

    //atributos  
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    //constructores
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    //get y set
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    
}


