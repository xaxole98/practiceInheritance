package com.practiceinheritance;

public class TestSistemaInterno {
    public static void main(String[] args) {
        Autenticable gerente = new Gerente();
        Autenticable administrador = new Administrador();
        SistemaInterno sistemaInterno = new SistemaInterno();
        gerente.setClave("AluraLatam");
        administrador.setClave("AluraLatam");
        sistemaInterno.autenticar(administrador);
        sistemaInterno.autenticar(gerente);
    }

}
