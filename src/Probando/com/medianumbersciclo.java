package Probando.com;

import java.util.Scanner;

public class medianumbersciclo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int suma=0;
        // float  media;
        int contador = 0;
        System.out.println("digite numeros");
        int number = entrada.nextInt();
        while (number>0){
            suma+=number;
            contador ++;
            System.out.println("digita numeros ");
            number = entrada.nextInt();
        }
        if (contador ==0){
            System.out.println("ERROR NO SE PUEDE DIVIDIR ENTRE CERO ");
        }else{
            double media = (double) suma/contador;
            System.out.println("el promedio de los numeros " + media );
        }
    }
}
