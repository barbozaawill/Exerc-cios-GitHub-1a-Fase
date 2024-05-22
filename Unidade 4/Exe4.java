import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
        System.out.println("A média ponderada é: " + media);

        scanner.close();

    }
}