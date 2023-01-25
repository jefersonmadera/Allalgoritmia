package Probando.com;

import javax.swing.*;

public class adivinanumbers2loops {
    public static void main(String[] args) {
        int contador=0;
        int aleatorio,adivina;
        aleatorio = (int) (Math.random()*100);
        do {
            adivina = Integer.parseInt(JOptionPane.showInputDialog("ADIVINA EL NUMERO"));
            if(adivina<aleatorio){
                System.out.println("ES MAYOR");
            }else System.out.println("ES MENOR");
            contador++;
        }while(adivina!=aleatorio);
        JOptionPane.showMessageDialog(null,aleatorio + " FELICIDADES ACERTASTE EL NUMERO");
        JOptionPane.showMessageDialog(null," tardaste " + contador + " intentos") ;
    }
}
