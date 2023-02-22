package Ejercicios.com;

public class Coche {
    String color ;
    String Marca ;
    int Km;

    //metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color="Blaco";
        coche1.Marca="Audi";
        coche1.Km=0;

        System.out.println("el color del coche es : " + coche1.color);
        System.out.println("la marca del coche es :" + coche1.Marca);
        System.out.println("Kilometros del coche : "+ coche1.Km);

        Coche coche2 = new Coche();

        coche2.color="Rojo";
        coche2.Marca="Ferrary";
        coche2.Km=2000;

        System.out.println("el color del coche es :"+  coche2.color);
        System.out.println("la marca del coche es :"+ coche2.Marca );
        System.out.println("Kilometros del coche : "+ coche2.Km);
    }
}
