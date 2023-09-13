package com.practiceinheritance;

import java.util.ArrayList;
import java.util.List;

public class RepasoArrayList {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numero = 40;

        // WRAPPER

        // Integer numeroObjeto = new Integer(40);
        Integer numeroObjeto = Integer.valueOf(40);

        List<Integer> lista = new ArrayList<>();

        lista.add(numero);
        lista.add(Integer.valueOf(40));
        lista.add(numeroObjeto);

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(numeros);
        System.out.println(byteInteger);
        System.out.println(doubleInteger);
        System.out.println(floatInteger);
    }
}
