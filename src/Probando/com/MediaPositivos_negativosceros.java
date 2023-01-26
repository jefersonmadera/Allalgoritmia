package Probando.com;
// este programa pide 10 numeros  al usuario y le saca la media a los enteros
// tanto positivos como negativos ademas de que cuenta los ceros digitados

import java.util.Scanner;

public class MediaPositivos_negativosceros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int ceros=0;
        int negativos=0; float medianegativos=0;
        int positivos=0; float mediapositivos=0;
        for(int i=1;i<=10;i++){
            System.out.println("digite un numero" + i);
            numero = entrada.nextInt();
            if (numero==0){
                ceros++;
            }else if (numero<0){
                negativos++;
                medianegativos+=numero;

            }else {
                positivos++;
                mediapositivos+=numero;
            }

        }if (negativos==0){
            System.out.println("NO HAY NUMEROS NEGATIVOS");
        }else {
        double promediopositivos= mediapositivos/positivos;
        double promedionegativos= medianegativos/negativos;
        System.out.println("promedio positivos " + promediopositivos);
        System.out.println("promedio negativos " + promedionegativos);
    }
        System.out.println("cantidad de ceros " + ceros );
    }
}
