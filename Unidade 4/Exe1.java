import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do terreno:");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura do terreno:");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;    
        System.out.println("A area do terreno é: " + area + " metros quadrados");

        scanner.close();

    }

}