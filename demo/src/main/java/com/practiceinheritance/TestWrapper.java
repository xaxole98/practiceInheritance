package com.practiceinheritance;

public class TestWrapper {
    public static void main(String[] args) {
        double numeroDoble = 300.0;
        boolean verdadero = true;
        double numeroDouble2 = Double.valueOf(33);
        System.out.println(numeroDouble2);
        boolean falso = Boolean.FALSE;

        String numeroString = "43";

        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);

        Number numero = Integer.valueOf(5);
        Double numeroDoublePrim = numero.doubleValue();
        System.out.println(stringToDouble);
        System.out.println(stringToInteger);
        System.out.println(numeroDoublePrim);
        System.out.println(numeroDoble);
        System.out.println(verdadero);
        System.out.println(falso);

    }

}
