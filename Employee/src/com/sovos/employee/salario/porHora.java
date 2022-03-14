package com.sovos.employee.salario;
import com.sovos.employee.abs.Employee;

public class porHora extends Employee {

    private double salario;
    private double valores;
    private double horas;



    @Override
    public double ganhar() {
        return getSalario();
    }

    public porHora(String nome, String familia, double valores, double horas) {
        super(nome, familia);
        this.salario = valores * horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValores() {
        return valores;
    }

    public void setValores(double valores) {
        this.valores = valores;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}