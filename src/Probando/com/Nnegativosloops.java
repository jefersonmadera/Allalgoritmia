package Probando.com;

import java.util.Scanner;

public class Nnegativosloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int negativos=0,numero;
        boolean sihay=false;
        for (int i = 1 ;i<=10;i++ ){
            System.out.println("escriba un numero" + i);
            numero = entrada.nextInt();
            if (numero<0){
                negativos++;
                sihay=true;
            }
        }
        if(sihay){
            System.out.println("hay " + negativos + "negativos");
        }
        else System.out.println("no hay negativos");
    }
}
