import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em dólares");
        double valorDolares = scanner.nextDouble();

        double cotacaoDolar = 5.0;

        double valorReais = valorDolares * cotacaoDolar;
        System.out.println("O valor em reais é R$ " + valorReais);

        scanner.close();
    }
}
