package Probando.com;

import java.util.Scanner;

public class IfNumber09999 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite un numero entre 0 y 999");
        int numero = entrada.nextInt();
        if (numero<0 || numero>999){
            System.out.println("numero fuera de rango");

        }else if (numero<10){
            System.out.println("tiene una cifra  ");
        }else if (numero<100){
            System.out.println("tiene dos cifras");
        }else if (numero<1000){
            System.out.println("tiene tres cifras ");
        }
    }
}
