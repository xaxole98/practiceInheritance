package com.practiceinheritance;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean retirar(double valor) {
        double comision = 0.02;
        return super.retirar(valor + comision);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
}
