package Ejercicios.com;

public class LearnigForaech {
    public static void main(String[] args) {
        String [] nombres = {"Santiago","Daniel","nicolas","sharit","claudia","manuel"};
       /* for (int i =0; i< nombres.length;i++){ // este es otro metodo para mostrar elememtos del array
            System.out.println(nombres[i]);
        }*/
        for (String i: nombres) {
            System.out.println(i);
        }
    }
}
