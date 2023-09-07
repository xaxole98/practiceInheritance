package com.practiceinheritance;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorros ca = new CuentaAhorros(2, 3);
        cc.depositar(2000);
        ca.depositar(500);
        ca.transferir(300, cc);
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());


    }
}
