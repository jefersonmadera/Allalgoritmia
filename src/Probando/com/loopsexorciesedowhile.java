package Probando.com;

import java.util.Scanner;

public class loopsexorciesedowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int potencia,resultado;
        do{
            System.out.println("Digite un numero ");
             potencia = entrada.nextInt();
             resultado=(int) Math.pow(potencia,2);
            System.out.println(potencia + " al cuadrado es = " + resultado);
        }while (potencia>=0);
    }
}
