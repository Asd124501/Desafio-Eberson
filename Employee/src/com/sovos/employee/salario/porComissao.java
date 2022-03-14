package com.sovos.employee.salario;
import com.sovos.employee.abs.Employee;

public class porComissao extends Employee {

    private double salario;
    private int vendas;
    private double comissao;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double ganhar() {
        return getSalario();
    }

    public porComissao(String nome, String familia, double salario , double comissao , int vendas) {
        super(nome, familia);
        this.salario = salario + (comissao * vendas);
    }
}