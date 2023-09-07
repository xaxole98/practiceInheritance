package com.practiceinheritance;

public class TestGerente {
    public static void main(String[] args) {
        Gerente alex = new Gerente();
        alex.setNombre("Diego");
        alex.setDocumento("7856459965");
        alex.setSalario(1500);
        alex.setClave("AluraLatam");
        alex.iniciarSesion("AluraLatam");

        System.out.println(alex.getSalario());
        System.out.println(alex.getBono());
    }
}
