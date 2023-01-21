package Probando.com;

import java.util.Scanner;

public class NotaIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escriba su nota definitiva ");
        double nota = entrada.nextDouble();
        if ((nota>0.0) && (nota<3.0)){
            System.out.println("perdio mi chino paila");
        }
        else if (nota>=3 && nota<=3.4){
            System.out.println("paso mi chino");
        }
        else if (nota>=3.5 && nota<=4.1){
            System.out.println("alto");
        }
        else if (nota>=4.2&&nota<=5){
            System.out.println("superior ");
        }
        else {
            System.out.println("invalided note");
        }
    }
}
