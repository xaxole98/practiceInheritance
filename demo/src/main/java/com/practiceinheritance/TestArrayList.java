package com.practiceinheritance;

import java.util.ArrayList;
import java.util.List;

import com.practiceinheritance.modelo.Cuenta;
import com.practiceinheritance.modelo.CuentaCorriente;

public class TestArrayList {
    public static void main(String[] args) {
        List<Cuenta> lista = new ArrayList<>();
        Cuenta cc = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(13, 42);

        lista.add(cc);
        lista.add(cc2);

        Cuenta obtenerCuenta = (Cuenta) lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for(Cuenta cuenta : lista){
            System.out.println(cuenta);
        }
    }

}
