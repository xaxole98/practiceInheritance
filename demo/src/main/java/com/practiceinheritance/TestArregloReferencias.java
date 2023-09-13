package com.practiceinheritance;

import com.practiceinheritance.modelo.Cuenta;
import com.practiceinheritance.modelo.CuentaAhorros;
import com.practiceinheritance.modelo.CuentaCorriente;

public class TestArregloReferencias {
    public static void main(String[] args) {

        // alterando el tipo
        Cuenta[] cuentas = new Cuenta[5];
        CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        cuentas[0] = cc1;

        // crea instancia de CuentaAhorro
        CuentaAhorros ca2 = new CuentaAhorros(23, 22);
        cuentas[1] = ca2;

        System.out.println(cuentas[1].getNumero());

        // alterou o tipo, realizando o cast
        CuentaCorriente ref = (CuentaCorriente) cuentas[0];
        System.out.println(ca2.getNumero());
        System.out.println(ref.getNumero());
    }
}
