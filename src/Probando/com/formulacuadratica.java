package Probando.com;

import java.util.Scanner;

public class formulacuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite A,B,C");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double x1, x2;
        x1= (-b) + Math.sqrt(Math.pow(b,2)-4*a*c);
        x1/=2;
        x2= (-b) - Math.sqrt(Math.pow(b,2)-4*a*c);
        x2/=2;
        System.out.println(" X1 =  " + x1   + "\n X2 = " + x2);
    }
}
