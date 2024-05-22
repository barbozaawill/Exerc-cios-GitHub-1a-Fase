import java.util.Scanner; 

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do cateto 1:");
        double cateto1 = scanner.nextDouble();

        System.out.println("Digite o comprimento do cateto 2:");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("A hipotenusa é: " + hipotenusa);

        scanner.close();

    }
}