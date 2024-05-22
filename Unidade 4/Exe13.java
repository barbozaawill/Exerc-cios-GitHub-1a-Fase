import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento da parede (em metros):");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a altura da parede (em metros):");
        double altura = scanner.nextDouble();

        double areaParede = comprimento * altura;
        int quantidadeAzulejos = (int) Math.ceil(areaParede * 9);
        double valorGasto = quantidadeAzulejos * 12.50;

        System.out.println("Valor gasto com a compra de azulejos é: R$ " + valorGasto);

        scanner.close();
    }
}