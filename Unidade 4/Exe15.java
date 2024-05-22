import java.util.Scanner; 

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro de até 3 digitos");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        int resto = numero % 100;
        int dezenas = resto / 10;
        int unidades = resto % 10;

        System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");

        scanner.close();


    }
}