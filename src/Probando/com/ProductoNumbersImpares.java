package Probando.com;

import java.util.Scanner;

public class ProductoNumbersImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int producto=1;
        for(int i = 1; i<=10;i+=2){
            System.out.println("imparNumber" + i );
            producto*=i;
        }
        System.out.println("el producto de todos los numeros impares hasta 10 == \n" +
                "=" + producto);
            // este codigo muestra el producto de los 10 primeros numeros impares
    }

}
