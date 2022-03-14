package com.sovos.employee.main;
import com.sovos.employee.salario.salario_boss;
import com.sovos.employee.salario.porComissao;
import com.sovos.employee.salario.porHora;
import com.sovos.employee.salario.porItem;
import java.text.DecimalFormat;

public class main {

    public static void main(String[] args) {


        salario_boss bs = new salario_Boss("Ricardo","Santos", 22222);
        porComissao pc = new porComissao("Suelen", "Souza",2000,5,50);
        porHora ph = new porHora("Rebecca","Soares", 2,300);
        porItem pi = new porItem("Matheus", "Ribeiro",50, 4);
        DecimalFormat df = new DecimalFormat();


        System.out.println(bs.toString(bs.getNome(), bs.getFamilia()) + " ganha $" + df.format(bs.ganhar()));
        System.out.println(pc.toString(pc.getNome(), pc.getFamilia()) + " ganha $" + df.format(pc.ganhar()));
        System.out.println(pi.toString(pi.getNome(), pi.getFamilia()) + " ganha $" + df.format(pi.ganhar()));
        System.out.println(ph.toString(ph.getNome(), ph.getFamilia()) + " ganha $" + df.format(ph.ganhar()));

    }

    private static class salario extends salario_boss {
        public salario(String Ricardo, String Santos, int i) {
            super();
        }
    }

    private static class salario_Boss extends salario_boss {
        public salario_Boss(String Ricardo, String Santos, int i) {
            super();
        }
    }
}