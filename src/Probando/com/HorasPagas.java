package Probando.com;

import java.util.Scanner;

public class HorasPagas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escriba las horas trabajadas");
        float horas = entrada.nextFloat();
        if (horas <=40){
            horas *= 16;
            System.out.println("su salario total es " + horas +"$");
        }else {
            float total = (40 + 16) + ((horas - 40) * 20);
            System.out.println("su salario final es " + total + "$");
        }
    }
}
