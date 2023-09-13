package com.practiceinheritance;

public class TestMain {
    public static void main(String[] args) {
        int edad = 20;
        int edad2 = 15;
        int edad3 = 57;

        int[] edades = new int[5];
        edades[2] = 30;
        int tamano = edades.length;

        System.out.println(tamano);

        for (int i = 0; i < tamano; i++) {
            System.out.println(edades[i]);
        }
        System.out.println(edad);
        System.out.println(edad2);
        System.out.println(edad3);
    }

}
