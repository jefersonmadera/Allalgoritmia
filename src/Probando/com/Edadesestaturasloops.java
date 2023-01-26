package Probando.com;
// el ejercicio pedia la edad y estatura de  estudiantes y el promedio de las mismas
//ademas de que pedia saber cuantos eran mayores de 18 y cuantos median mas 1,75 cm
import java.util.Scanner;

public class Edadesestaturasloops {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float mediaedad;
        float mediaaltura;
        int edad,contador18=0 ;
        int contador175=0;
        float estatura;
        float sumaaltura=0;
        int sumaedad=0;
        for (int i =1;i<=5;i++){
            System.out.println("Digite la edad del estudiante " + i ) ;
            edad = entrada.nextInt();
            System.out.println("digite la altura del estudiante " + i);
            estatura = entrada.nextFloat();
            sumaaltura+=estatura;
            sumaedad+=edad;
            if(edad>18){
            contador18++;
            }
            if (estatura>1.75){
                contador175++;
            }
        }
         mediaedad=(float)sumaedad/5;
        mediaaltura= sumaaltura/5;
        System.out.println("el promedio de edad es: " +mediaedad);
        System.out.println("el promedio de altura es : " + mediaaltura );
        System.out.println("mayores de 18 " + contador18 );
        System.out.println("mayor de 1,75 " + "► " + contador175);
    }
}
