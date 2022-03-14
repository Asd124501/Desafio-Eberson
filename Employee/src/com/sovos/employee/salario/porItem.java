package com.sovos.employee.salario;
import com.sovos.employee.abs.Employee;

public class porItem extends Employee {

    private double salario;
    private double produção;
    private int quantidade;



    @Override
    public double ganhar() {
        return getSalario();
    }

    public porItem(String nome, String familia, double produção, int quantidade) {
        super(nome, familia);
        this.salario = produção * quantidade ;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getProdução() {
        return produção;
    }

    public void setProdução(double produção) {
        this.produção = produção;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
