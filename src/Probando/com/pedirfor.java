package Probando.com;

import java.util.Scanner;

public class pedirfor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int suma=0;
        int numero;
        // este codigo pide 10 numeros y luego los suma
        System.out.println("digita los numeros que vas a sumar \n");
        for(int i=1;i<=10;i++){
            System.out.println("numero " + i );
            System.out.println("====================");
            numero= entrada.nextInt();
            suma+=numero;

        }
        System.out.println("el resultado de la suma es = " + suma );

    }
}
