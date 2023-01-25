package Probando.com;

import java.util.Scanner;

public class positivonegativoloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un numero ");
        int numero = entrada.nextInt();
        while (numero!=0){
            if (numero>0){
                System.out.println("el numero " + numero + " es positivo  ");
            }else {
                System.out.println("el numero " + numero + " es negativo ");
            }
            System.out.println("introduce un numero ");
            numero = entrada.nextInt();
        }
    }
}
