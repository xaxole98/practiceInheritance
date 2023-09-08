package com.practiceinheritance.modelo;

public class Administrador extends Funcionario implements Autenticable {
    private AutenticacionUtil util;

    public Administrador() {
        this.util = new AutenticacionUtil();
    }

    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public double getBono() {
        return 0;
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

}
