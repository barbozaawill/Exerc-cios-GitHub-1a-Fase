import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em °C:");
        double temperaturaC = scanner.nextDouble();

        double temperaturaF = (9.0 / 5.0) * temperaturaC + 32;
        System.out.println("A temperatura em °F é: " + temperaturaF);

        scanner.close();
    }

}