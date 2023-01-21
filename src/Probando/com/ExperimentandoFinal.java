package Probando.com;

import javax.swing.*;
import java.util.Scanner;

public class ExperimentandoFinal {
    public static void main(String[] args) {
        final int mil = 1000;
        float saldofinal;
        float saldo;
        Scanner entrada = new Scanner(System.in);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION\n"+
                "1.ingresar dinero\n" +
                "2.retirar dinero\n" +
                "3. salir "));
        switch (opcion){
            case 1:
                saldo = Float.parseFloat(JOptionPane.showInputDialog("digite el dinero que quiere ingresae"));
                saldofinal = mil+saldo;
                JOptionPane.showMessageDialog(null, "dinero en cuenta " + saldofinal);
                break;

            case 2:
                saldo = Float.parseFloat(JOptionPane.showInputDialog("digite el dinero que quiere retirar"));
                if (saldo <= mil){
                    saldofinal=mil-saldo;
                    JOptionPane.showMessageDialog(null, "dinero en cuenta " + saldofinal + "valor retiro = " + saldo);
                }else {
                    JOptionPane.showMessageDialog(null, "invalided option");
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "muchas gracias por preferir nuestros servicios ");
        }
    }
}
