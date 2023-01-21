package Probando.com;

import javax.swing.*;

public class simpleconversionKg {
    public static void main(String[] args) {
      final int kilogramo =1000;
      float result;
      float kilos = Float.parseFloat(JOptionPane.showInputDialog("digite los kilos de la coonversion"));

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("ELIJA UNA OPCION \n " +
                "1. de kilo a libra\n" +
                "2. de kilo a gramo\n" +
                "3. salir "));
        switch (opcion){

            case 1:
                result = kilos*2;
                JOptionPane.showMessageDialog(null, kilos + "KG son " + result + "libras");
                break;
            case 2:
                result = kilos*kilogramo;
                JOptionPane.showMessageDialog(null, kilos + "KG son " + result + "gramos");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "final");
        }
    }
}
