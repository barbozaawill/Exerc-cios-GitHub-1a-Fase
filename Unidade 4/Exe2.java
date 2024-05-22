import java.util.Scanner;

public class Exe2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do par de sapatos:");
        double precoSapatos = scanner.nextDouble();
    
        double desconto = 0.12 * precoSapatos;
        double precoComDesconto = precoSapatos - desconto;
    
        System.out.println("O valor do desconto é de R$ " + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + precoComDesconto);
    
        scanner.close();
    }
    
}
