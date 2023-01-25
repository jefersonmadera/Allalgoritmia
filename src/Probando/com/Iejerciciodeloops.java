package Probando.com;

import java.util.Scanner;

public class Iejerciciodeloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero ");
        double numero = entrada.nextDouble();
        double cuadrado;
        while (numero>=0){
            cuadrado = Math.pow(numero,2);
            System.out.println(cuadrado);
            System.out.println("digite un numero ");
             numero = entrada.nextDouble();
        }
    }
}
