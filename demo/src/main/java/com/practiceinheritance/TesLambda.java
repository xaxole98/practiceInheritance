
package com.practiceinheritance;

import com.practiceinheritance.modelo.CuentaAhorros;
import com.practiceinheritance.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.practiceinheritance.modelo.Cliente;
import com.practiceinheritance.modelo.Cuenta;

public class TesLambda {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(22, 33);
        Cliente cliente1 = new Cliente();
        cc1.setTitular(cliente1);
        cliente1.setNombre("Alex");

        Cuenta cc2 = new CuentaAhorros(22, 44);
        Cliente cliente2 = new Cliente();
        cc2.setTitular(cliente2);
        cliente2.setNombre("Carlos");

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente cliente3 = new Cliente();
        cc3.setTitular(cliente3);
        cliente3.setNombre("Pepe");

        Cuenta cc4 = new CuentaAhorros(22, 22);
        Cliente cliente4 = new Cliente();
        cc4.setTitular(cliente4);
        cliente4.setNombre("Maria");

        cc1.depositar(333.0);
        cc2.depositar(444.0);
        cc3.depositar(111.0);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Aun no he hecho nada");
        lista.forEach((cuenta) -> System.out.println(cuenta));

        // Ordenar las cuentas
        lista.sort((Cuenta o1, Cuenta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

        System.out.println("Ordenar por numero");
        lista.forEach((cuenta) -> System.out.println(cuenta));

        // Ordenar las cuentas
        lista.sort((Cuenta arg1, Cuenta arg2) -> arg1.getTitular().getNombre().compareTo(arg2.getTitular().getNombre())

        );

        System.out.println("Ordenar por Titular");
        lista.forEach((cuenta) -> System.out.println(cuenta));

        System.out.println("Ordenando mediante la clase Collections a lo antiguo");
        Collections.sort(lista, (Cuenta arg1, Cuenta arg2) -> {
            return arg1.getTitular().getNombre().compareTo(arg2.getTitular().getNombre());

        });

    }

}
