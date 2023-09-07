package com.practiceinheritance;

public class SistemaInterno {
    private String clave = "AluraLatam";

    public boolean autenticar(Autenticable Funcionario) {
        boolean puedeIniciarSesion = Funcionario.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Haz logrado iniciar sesion");
            return true;
        } else {
            System.out.println("No lograste iniciar sesion");
            return false;
        }
    }
}
