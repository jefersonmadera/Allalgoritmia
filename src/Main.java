import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().Leer();
    }

    private void Leer() {
        Scanner entrada=new Scanner(System.in);
        while (entrada.hasNext()) {
            String line = entrada.nextLine();
            System.out.println(process(line));
        }
    }
        private int process (String line){
        String [] data = line.split((""));
        int numeOne = Integer.parseInt(data[0]);
        int numeTwo = Integer.parseInt(data[1]);

         return  numeOne > numeTwo ? numeOne - numeTwo : numeOne + numeTwo;

        }

}