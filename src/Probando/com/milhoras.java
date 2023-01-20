package Probando.com;

import java.util.Scanner;

public class milhoras {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite la cantidad de horas ");
        int horas = entrada.nextInt();
     /*    dias = 24; // horas
         semana = 160; //horas
         */

        //operaciones necesarias
        int semanas = horas/168;
        int dias = (horas%168) / 24;
        int horasend = horas %24;
        System.out.println("\n el equivalente es :");
        System.out.println(semanas + " semanas "  + dias + " dias "  + horasend + " horas " );

    }
}
