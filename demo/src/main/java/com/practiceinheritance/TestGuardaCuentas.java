package com.practiceinheritance;

import com.practiceinheritance.modelo.Cuenta;
import com.practiceinheritance.modelo.CuentaCorriente;
import com.practiceinheritance.modelo.GuardaCuentas;

public class TestGuardaCuentas {
    public static void main(String[] args) {
        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(11, 22);
        guardaCuentas.guardar(cc);
        Cuenta cc2 = new CuentaCorriente(22, 44);
        guardaCuentas.guardar(cc2);
        System.out.println(guardaCuentas.obtener(1));
    }
}
