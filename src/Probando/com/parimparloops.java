package Probando.com;

import java.util.Scanner;

public class parimparloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un numero ");
        int numero = entrada.nextInt();
        while (numero!=0){
            if (numero%2==0){
                System.out.println(numero + " es par ");
            }else {
                System.out.println(numero + " es impar ");
            }
            System.out.println("introduce un numero ");
             numero = entrada.nextInt();
        }

    }


}
