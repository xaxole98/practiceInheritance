package com.practiceinheritance;

import com.practiceinheritance.modelo.Administrador;
import com.practiceinheritance.modelo.Autenticable;
import com.practiceinheritance.modelo.Gerente;
import com.practiceinheritance.modelo.SistemaInterno;

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
