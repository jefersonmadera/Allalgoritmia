package Probando.com;

import javax.swing.*;

public class Nsueldos {
    public static void main(String[] args) {

        float sueldos,maximo=0;
        int Nsueldos = Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de sueldos"));
        for(int i = 1 ; i<=Nsueldos;i++){
            sueldos=Float.parseFloat(JOptionPane.showInputDialog("Digite su sueldo " + i));
            if (maximo<sueldos){
                maximo=sueldos;
            }

        }
        JOptionPane.showMessageDialog(null, "sueldo maximo es :" + maximo + "$");
    }
}
