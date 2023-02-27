package ClasePresencialP;

import java.util.Random;

public class MoreArraysLearning {
    public static void main(String[] args) {
        int Vector [] = initVector(50);
        System.out.println(showVector(Vector));

    }
    public static int [] initVector (int size) {

        int Vector[] = new int[size];

        for(int i =0;i<size;i++) {
        Vector[i]=new Random().nextInt(99)+1;
        }
        return Vector;
    }
    public static String showVector (int [] Vector ){
        StringBuilder sb = new StringBuilder("[");
        for (int i =0;i<Vector.length;i++){
            StringBuilder append = sb.append(Vector[i] + ",");
        }
          //   sb.append("]");
        String s = sb.toString().substring(0, sb.toString().length() - 1) + "]";
        return s;
    }
    /*public static void cant (int[] cant){

    }*/
}
