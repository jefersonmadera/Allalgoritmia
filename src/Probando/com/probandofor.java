package Probando.com;

import java.util.Scanner;

public class probandofor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite las cantidades ");
        int cantiades = entrada.nextInt();
        for (int i =1 ; i <=cantiades ; i++){
            System.out.println("hello word" + i );

        }
    }
}
