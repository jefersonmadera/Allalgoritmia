package Probando.com;

import java.util.Scanner;

public class Ifimparnumbers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite dos digite dos numeros ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        if (num1%2==0 && num2%2==0){
            System.out.println("los dos numeros son pares");
        } else if (num1%2!=0 && num2%2 != 0){
            System.out.println("los dos numeros son impares ");
        }else if (num1%2==0 && num2%2!=0){
            System.out.println(num1 + "es par " + num2 + "es impar");
        }else {
            System.out.println(num1 + "es impar " + num2 + "es par ");
        }

    }
}
