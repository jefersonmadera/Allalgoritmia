package Probando.com;

import javax.swing.*;

public class IfDescuento {
    public static void main(String[] args) {
        int descuento;
        descuento = Integer.parseInt(JOptionPane.showInputDialog("escriba su compra total"));

        double total;
        total = descuento*0.20;

        if (descuento>300){
            JOptionPane.showMessageDialog(null, "total a pagar " + (descuento - total));
            JOptionPane.showMessageDialog(null, "descuento obtenido " + total );

        }else {
            JOptionPane.showMessageDialog(null, "total a pagar no tienes descuento  " + descuento );
        }
    }

}
