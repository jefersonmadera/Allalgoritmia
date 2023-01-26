package Probando.com;
// este ejercicio es sobre 10 sueldos digitados por el usuario y
// sumarlos y verificar cuantos son mayores de mil
import java.util.Scanner;

public class diezsueldosloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int sueldos;
        int suma=0;
        int mayoresmil=0;
        System.out.println("escriba los suedos \n  " );
        for (int i=1;i<=10;i++){
            System.out.println("sueldos " + i);
            sueldos = entrada.nextInt();
            suma+=sueldos;
            if (sueldos>1000){
                mayoresmil++;
            }
        }
        System.out.println("Suma Total: " + suma + "$");
        System.out.println("mayores de mil$ " + mayoresmil );
    }
}
