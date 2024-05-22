import java.util.Scanner;


public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;

        System.out.println("Digite a altura:" );

        for (int i = 1; i <= 20; i++) {
            double altura = sc.nextDouble();
             soma += altura;
             
        }

        double pessoas = soma / 20;
        System.out.println("A média de altura das pessoas é igual à: " + pessoas);
        sc.close();
    }
}
