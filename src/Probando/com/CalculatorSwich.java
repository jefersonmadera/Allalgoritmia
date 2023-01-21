package Probando.com;

import java.util.Scanner;

public class CalculatorSwich {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma,resta,multi,div;
        System.out.println("escriiba dos numeros ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        System.out.println("digite la operacion que desea realizar\n" +
                "Ss(suma), Rr(resta), Pp(producto), Dd(division)");
        char operation = entrada.next().charAt(0);
        switch (operation) {
            case 'S', 's' -> {
                suma = num2 + num1;
                System.out.println("resultado = " + suma);
            }
            case 'R', 'r' -> {
                resta = num1 - num2;
                System.out.println("resultado = " + resta);
            }
            case 'P', 'p', 'M', 'm' -> {
                multi = num1 * num2;
                System.out.println("resultado = " + multi);
            }
            case 'D', 'd' -> {
                div = num1 / num2;
                System.out.println("resultado = " + div);

        }default -> {
                System.out.println("WRONG VALUE");
            }
        }

    }
}
