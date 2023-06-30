package com.RepoMarcoGithub;
//import java.sql.SQLOutput;

public class FuncionMain {
    public static void main(String[] args) {

        int numero1 = 100;
        int precioFinal = getPrice(numero1);
        System.out.println(precioFinal);
    }

    static int getPrice(int numero1) {
return numero1 * 21/100 + numero1;
    }

}
