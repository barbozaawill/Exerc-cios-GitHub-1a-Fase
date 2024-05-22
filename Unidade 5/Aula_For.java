import java.util.Scanner;

public class Aula_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            System.out.println("informe a tabuada que deseja");
            int valor = teclado.nextInt();
            for (int i = 1; i <= 10; i++) {  
                System.out.println(valor+ " x " + i + " = " + (valor * i));
        } 
        teclado.close();
    }
}