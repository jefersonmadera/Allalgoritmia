package Probando.com;

import java.util.Scanner;

public class PedirnumN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite hasta que numero quiere sus numeros  " );
        int numero = entrada.nextInt();
        for(int i=1;i<=numero;i++){
            System.out.println(i);
        }//en este ejercicio se empieaz aprender sobre el como funciona el bucle for
    }
}
