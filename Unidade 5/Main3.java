import java.util.Scanner;
//If contínuo com else no final
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não tem idade para votar!");
        } if (idade >= 16 && idade < 18) {
            System.out.println("Você está apto para votar, porém é opcional!");
        } if (idade > 18 && idade < 70) {
            System.out.println("Você está apto para votar, seu voto é obrigatório!");
        } else {
            System.out.println("Você está apto para votar, porém, é opcional!");
        }
        sc.close();
    }
    
}
