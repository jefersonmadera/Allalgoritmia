package Ejercicios.com;

import java.util.Scanner;

public class Mostrar5nnumerosArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float [] numeros= new float[5];
        System.out.println("digite los numeros del array");
        for (int i=0; i< numeros.length;i++){
            System.out.print((i+1)+" numero ");
            numeros [i]= entrada.nextFloat();
        }
        for (float i : numeros){
            System.out.println(i);
        }
    }
}
