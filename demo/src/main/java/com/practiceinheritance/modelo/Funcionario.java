package com.practiceinheritance.modelo;

public abstract class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    public Funcionario() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return this.tipo;
    }

    public abstract double getBono();
}
