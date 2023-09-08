package com.practiceinheritance;

import com.practiceinheritance.modelo.Funcionario;
import com.practiceinheritance.modelo.Gerente;

public class TestReferencias {

    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        Gerente gerente = new Gerente();
        funcionario.setNombre("Diego");
        gerente.setNombre("Alexa");
        funcionario.setSalario(5000);
        gerente.setSalario(7000);
        gerente.setClave("AluraLatam");
        gerente.iniciarSesion("AluraLatam");
    }

}
