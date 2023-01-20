package Probando.com;

import java.util.Scanner;

public class elevacionesalcuadrado {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        System.out.println("digite el valor de A ") ;
        double valorA = entrada.nextDouble();
        System.out.println("ddigite el valor de B ");
        double valorB = entrada.nextDouble();

        //salida de datos

        double resultadoA = Math.pow(valorA,2);
        double resultadoB = Math.pow(valorB,2);
        double total = (resultadoA) + 2*(valorA*valorB) + (resultadoB);
        System.out.println("(a+b)^2 el resultado de esta operacion es :" + total);

        }
    }

