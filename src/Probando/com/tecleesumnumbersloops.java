package Probando.com;

import java.util.Scanner;

public class tecleesumnumbersloops {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numbers,contador=0;
        int suma=0;
        do {
            System.out.println("digite numeros ");
            numbers= entrada.nextInt();
            suma+=numbers;// esto es igual a suma= suma + numbers
            contador++;
        }while (numbers!=0);
        System.out.println("la suma total de sus numeros es = " + suma  );
        System.out.println("digitaste " + contador + " numeros");
    }
}

