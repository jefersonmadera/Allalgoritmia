package Ejercicios.com;

import java.util.Scanner;

public class Llenarchar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite el tamaño del arreglo");
        int arreglo = entrada.nextInt();
        char [] caracteres = new char[arreglo];
        System.out.println("digite los elementos del caracter");
        for (int i = 0 ; i<arreglo;i++){
            System.out.println((i+1)+"digite un caracter ");
              caracteres [i]=entrada.next().charAt(0);
        }
        System.out.println("\n los caracteres son:");
        for (int i = 0;i<arreglo;i++){
            System.out.print(caracteres [i] +"");
        }
    }
}
