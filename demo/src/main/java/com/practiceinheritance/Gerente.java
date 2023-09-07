package com.practiceinheritance;

public class Gerente extends Funcionario implements Autenticable {
    private AutenticacionUtil util;

    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);

    }

    @Override
    public double getBono() {
        return super.getSalario() + this.getSalario() * 0.05;
    }
}