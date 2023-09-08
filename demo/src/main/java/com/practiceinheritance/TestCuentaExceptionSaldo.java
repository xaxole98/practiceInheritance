package com.practiceinheritance;

import com.practiceinheritance.modelo.Cuenta;
import com.practiceinheritance.modelo.CuentaAhorros;
import com.practiceinheritance.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(1, 55);
        cuenta.depositar(200);
        try {
            cuenta.retirar(200);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
