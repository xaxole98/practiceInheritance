package com.practiceinheritance;

public class ControlBonificacion {
    private double sumaTotal;

    public double registrarSalario(Funcionario funcionario) {
        this.sumaTotal = funcionario.getBono() + funcionario.getSalario();
        System.out.println(sumaTotal);
        return sumaTotal;

    }

}
