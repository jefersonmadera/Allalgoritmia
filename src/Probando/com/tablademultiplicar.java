package Probando.com;
// tabla de un numero N
import java.util.Scanner;

public class tablademultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero entre 1 y 10 ");
        int numero = entrada.nextInt();
        if (numero<=10 && numero >0){
            for(int i=1;i<=10;i++){
                System.out.println(numero+"x"+i+"="+(i*numero));
            }
        }
        else System.out.println("ERROR DIGITE UN NUMERO VALIDO");
    }
}
