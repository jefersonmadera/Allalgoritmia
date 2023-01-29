package Ejercicios.com;

import java.util.Scanner;

public class ArrayInversorecorrido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float [] numeros = new float[5];
        System.out.println("Digite los numeros para rellenar");
        for (int i=0;i< numeros.length;i++){
            System.out.print ((i+1)+" numeros ");
            numeros[i]= entrada.nextFloat();
        }
        System.out.println("este es el ordern invertido");
        for (int i = numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }

    }
}
