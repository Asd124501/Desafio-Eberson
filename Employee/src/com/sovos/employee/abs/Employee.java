package com.sovos.employee.abs;

public abstract class Employee {
    private String Nome;
    private String Familia;

    public Employee() {

    }

    public abstract double ganhar();

    public Employee(String Nome, String Familia) {
        this.Nome = Nome;
        this.Familia = Familia;


    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String familia) {
        Familia = familia;
    }

    public String toString(String nome, String familia) {
        return nome + " " + familia;
    }
}