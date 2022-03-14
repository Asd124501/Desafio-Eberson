package com.sovos.employee.salario;
import com.sovos.employee.abs.Employee;

public class salario_boss extends Employee {

    public double salario;

    public salario_boss(String nome, String familia, double salario) {
        super(nome, familia);
        this.salario = salario;
    }

    public salario_boss() {
        super();
    }


    @Override
    public double ganhar() {
        return getSalario();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}