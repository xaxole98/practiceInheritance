package com.practiceinheritance.modelo;

public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;

    public Cuenta(int agencia, int numero) {
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
            this.numero = numero;
            System.out.println("Se ha creado existosamente una nueva cuenta");
        }
        total++;
    }

    public abstract void depositar(double valor);

    public void retirar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        } else {

        }
        this.saldo -= valor;
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            try {
                this.retirar(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            cuenta.depositar(valor);
            System.out.println("Haz logrado una transferencia exitosa hacia " + cuenta + "de una cantidad de " + valor);
            return true;
        } else {
            System.out.println("La transferencia no es posible");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}
