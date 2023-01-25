package Probando.com;

import javax.swing.*;
import java.util.Scanner;

public class del100alceroloops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        for (int i=100;i>=0;i-=7){
            System.out.println(i);
        }
    }
}
