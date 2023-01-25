package Probando.com;

import java.util.Scanner;

public class adivinanumberloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aleatorio, adivina, contador=0;
        aleatorio= (int) (Math.random()*100);

        do {
            System.out.println("adivina el numero " );
             adivina= entrada.nextInt();

            if(adivina<aleatorio){
                System.out.println("ES MAYOR");
            }else System.out.println("ES MENOR");
            contador++;

        }while(adivina != aleatorio);
        System.out.println("FELICIDADES ADIVINASTES EL NUMERO \n" +
                " tardaste " + contador + " intentos ");
    }
}
