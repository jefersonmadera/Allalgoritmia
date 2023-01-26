package Probando.com;

import javax.swing.*;

public class facturaciondesinloops {
    public static void main(String[] args) {
        int codigo,litros,articulo1=0,mayorde600=0;
        float precioL,facturacioParcial,facturatotal=0;

        for (int i=1;i<=5;i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("producto N°"+i+"\nCodigo"));
            litros= Integer.parseInt(JOptionPane.showInputDialog("producto N°"+i+"\nLitros"));
            precioL=Float.parseFloat(JOptionPane.showInputDialog("producto N°"+i+"\nprecio por litro"));
            facturacioParcial=(float) (litros*precioL);
            facturatotal+=facturacioParcial;

            if (codigo==1){
                articulo1+=litros;
            }
            if (facturacioParcial>600){
                mayorde600++;
            }
        }
        JOptionPane.showMessageDialog(null,"RESUMEN DE VENTAS\n" +
                "facturacion Total:"+facturatotal+ "$"+"\nCantidad en litros producto N°1 :"+articulo1+"\n" +
                "Mayores de 600$ : " + mayorde600);
    }
}
