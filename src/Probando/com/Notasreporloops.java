package Probando.com;

import javax.swing.*;

public class Notasreporloops {
    public static void main(String[] args) {
        double notas;
        int condicionados = 0, aprobados = 0, reprobados = 0;
        JOptionPane.showMessageDialog(null, "DIGITE LAS NOTAS DE LOS ESTUDIANTES");
        for (int i = 1; i <= 6; i++) {
            do {
                notas = Double.parseDouble(JOptionPane.showInputDialog("Nota" + i));

            } while (notas < 0 || notas > 10);
            if (notas >= 4 && notas <= 4.9) {
                condicionados++;
            } else if (notas >= 5) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
            JOptionPane.showMessageDialog(null, "Aprobados :" + aprobados + "\n" +
                    "reprobados :" + reprobados + "\ncondicionados : " + condicionados);

    }}
