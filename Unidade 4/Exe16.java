import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        int valorCompra = scanner.nextInt();

        int notas100 = valorCompra/ 100;
        int resto = valorCompra % 100;
        int notas10 = resto / 10; 
        int notas1 = resto % 10;
        
        System.out.println("Número mínimo de notas: " + (notas100 + notas10 + notas1));
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas 10: " + notas10);
        System.out.println("Notas de 1: " + notas1);

        scanner.close();
    }
}