package Probando.com;


import javax.swing.*;


public class Ifconditionals {
    public static void main(String[] args) {
        char letra= JOptionPane.showInputDialog("Escriba una Letra  ").charAt(0);
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"la letra es mayuscula");

        }else {
            JOptionPane.showMessageDialog(null, "la letra es minuscula");
        }


    }
}

