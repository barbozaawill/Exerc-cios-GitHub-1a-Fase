import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o preço do litro da gasolina:");
        double precoLitro = scanner.nextDouble();

        System.out.println("Digite o valor do pagamento:"); 
        double valorPagamento = scanner.nextDouble();

        double litrosAbastecidos = valorPagamento / precoLitro;
        System.out.println("Foram abastecidos " + litrosAbastecidos + " litros de gasolinas");

        scanner.close();
    }
    
}