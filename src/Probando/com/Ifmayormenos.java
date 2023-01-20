package Probando.com;

import java.util.Scanner;

public class Ifmayormenos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("write three numbers ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        if ((num1>num2) && (num2>num3) ){
            System.out.println("el orden es " + num1 + num2 + num3);
        }else if ((num1<num2) && (num2<num3)){
            System.out.println("el orden es " + num3 + num2 + num1);
        }else if ((num3>num1) && (num2>num3)){
            System.out.println("el orden es " + num2 + num3+num1);
        }else if ((num1>num3)&&(num2>num1)){
            System.out.println("el orden es " + num2 + num1 + num3);
        } else if ((num1>num3)&&( num3>num2)) {
            System.out.println("el orden es " + num1 + num3 + num2);
        }else {
            System.out.println("el orden es " + num3 + num1 + num2);
        }

        }
    }

