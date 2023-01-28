package Probando.com;

import java.util.Scanner;

public class Suspensobooleanfinish {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        int contador=0 ;
        boolean suspenso=false;
        for (int i = 1 ; i<=5; i++){
            do {
                System.out.println("digite la nota del estudiante" + i);
                nota = entrada.nextFloat();
            }while(nota< 0  || nota>5);
            if (nota<3){
                suspenso=true;
                contador++;
            }
        }
        if (suspenso){
            System.out.println("estudiantes suspensos:"+ contador);
        }else System.out.println("no hay estudiantes suspensos");
    }
}
