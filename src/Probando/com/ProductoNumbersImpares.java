package Probando.com;

public class ProductoNumbersImpares {
    public static void main(String[] args) {

        long producto=1;
        for(int i = 1; i<=20;i+=2){
            System.out.println("imparNumber" + i );
            producto*=i;
        }
        System.out.println("el producto de todos los numeros impares hasta 10 == \n" +
                "=" + producto);
            // este codigo muestra el producto de los 10 primeros numeros impares
    }

}
