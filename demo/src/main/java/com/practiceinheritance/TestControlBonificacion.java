package com.practiceinheritance;

import com.practiceinheritance.modelo.Contador;
import com.practiceinheritance.modelo.ControlBonificacion;
import com.practiceinheritance.modelo.Funcionario;
import com.practiceinheritance.modelo.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(100);
        Gerente alexa = new Gerente();
        alexa.setSalario(200);
        Contador carlos = new Contador();
        carlos.setSalario(700);
        ControlBonificacion control = new ControlBonificacion();
        control.registrarSalario(diego);
        control.registrarSalario(alexa);
        control.registrarSalario(carlos);
    }

}
