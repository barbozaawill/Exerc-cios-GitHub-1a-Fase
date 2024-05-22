import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números:");
        int n = sc.nextInt();

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número: " + (i + 1) + ":");
            double numero = sc.nextDouble();
            

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();

    }
}
