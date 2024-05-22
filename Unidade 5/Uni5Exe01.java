import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        for (int i = 0; i < 20; i++) {
            int numero = sc.nextInt();
            

                if (numero % 2 == 0) {
                    System.out.println(numero + " par");
                } else {
                    System.out.println(numero + " impar");
             }


        }
        sc.close();
    }
}