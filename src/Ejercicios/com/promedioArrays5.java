package Ejercicios.com;

import java.util.Scanner;

public class promedioArrays5 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int [] numeros = new int[5];
        int positivos=0,negativos=0,ceros=0,cuentapositivos=0,cuentanegativos=0;
        float mediapositivos,medianegativos;

        System.out.println(" digite los numeros");
        for (int i=0;i< numeros.length;i++){
            System.out.print((i+1)+". numeros ");
            numeros[i]= entrada.nextInt();
            if (numeros[i]==0){
                ceros++;
            }
            else if (numeros[i]>0){
                positivos+=numeros[i];
                cuentapositivos++;
            }
            else {
                negativos+=numeros[i];
                cuentanegativos++;
            }
        }
        if (cuentapositivos==0){
            System.out.println("No hay negativos no se puede dividir entre cero");
        }else {
            mediapositivos=(float) positivos /cuentapositivos;
        System.out.println("media numeros positivos"+mediapositivos);
        }
        if(cuentanegativos==0){
            System.out.println("NO HAY NEGATIVOS NO SE PUEDE DIVIDIR ENTRE CERO");
        }else {
            medianegativos= (float) negativos/cuentanegativos;
            System.out.println("promedio de numeros negativos "+ medianegativos);
        }
          System.out.println("cantidad de ceros "+ ceros);

    }
}
