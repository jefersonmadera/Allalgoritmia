package Probando.com;

import java.util.Scanner;

public class tecleenumbersloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador=0;
        System.out.println("introduce numeros");
        int numeros = entrada.nextInt();
        while (numeros>=0){
            contador++;
            System.out.println("introduce numeros");
             numeros = entrada.nextInt();
        }
        System.out.println("numeros introducidos " + contador);
    }
}
