package com.practiceinheritance;

import com.practiceinheritance.modelo.Funcionario;
import com.practiceinheritance.modelo.Gerente;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Gerente();
        diego.setNombre("Diego");
        diego.setDocumento("7856459965");
        diego.setSalario(1500);
        diego.setTipo(1);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBono());
    }
}
