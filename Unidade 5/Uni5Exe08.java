import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números inteiros: ");
        int n = sc.nextInt();

        int negativo = Integer.MAX_VALUE;
        int soma = 0;
        int quantidade = 0;
        System.out.println("Digite N números");
        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();

            if (numero < 0) {
                if (numero < negativo) {
                    negativo = numero;
                } 
            } else {
                soma += numero;
                quantidade++;
            }
        }
        double media = soma / quantidade;



        System.out.println("O menor número negativo é: " + negativo);
        System.out.println("A média dos números positivos é: " + media);

        sc.close();
    }
}
