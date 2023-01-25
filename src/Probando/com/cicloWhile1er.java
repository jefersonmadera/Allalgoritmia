package Probando.com;

import java.util.Scanner;

public class cicloWhile1er {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int iterador =1;
        System.out.println("type how many numbers you want to see on the screen ");
        int contador = entrada.nextInt();
        while (iterador<=contador){
            System.out.println(iterador);
            iterador++; // esto tambien puede ser = iterador = iterador +1 ;

        }
    }
}
