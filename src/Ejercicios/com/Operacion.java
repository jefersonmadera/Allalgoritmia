package Ejercicios.com;

import javax.swing.*;

public class Operacion {
    //Atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // metodos



    //metodo para pedirle al usuario numeros

    public void leerNumeros (){
        num1 =  Integer.parseInt (JOptionPane.showInputDialog("DIGITE UN NUMERO"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

    }
    // metodo para sumar dos numeros
    public void sumar (){
        suma= num1+num2;
    }
    // metodo para restar numeros
    public void restar (){
        resta=num1-num2;
    }
    //metoto para multiplicar numeros
    public  void multiplicar (){
        multiplicacion = num1*num2;

    }
    //metodo para dividir
    public  void Dividir (){
        division= num1/num2;
    }
    // metodo para mostrar resultados
    public void MostrarResultados() {
        System.out.println("la suma de los dos numeros ");

    }
}

