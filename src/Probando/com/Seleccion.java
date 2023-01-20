package Probando.com;

public class Seleccion {
char grupo;
String nombredelequipo;
boolean clasificado;

void imprimir () {
        System.out.println(nombredelequipo );
    System.out.println(grupo);
    System.out.println(clasificado);

    }
    public static void main(String[] args) {
     /* Seleccion Argentina = new Seleccion();
      Argentina.nombredelequipo = "Argentina";
      Argentina.grupo = 'C';
      Argentina.clasificado = true;
       Argentina.imprimir();
       */
        int intento=0;
        int x = 5;
        try {
            System.out.println(x/intento);
        } catch (Exception lodel){
            System.out.println("No se puede dividir por cero ");
        }
    }
}
