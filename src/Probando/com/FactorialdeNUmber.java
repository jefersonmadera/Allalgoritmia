package Probando.com;

import java.util.Scanner;

public class FactorialdeNUmber {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero ");
        int numero = entrada.nextInt();
        int facto= 1;
        for (int i= 1;i<=numero;i++){
            facto*=i;
        }

    }
}
