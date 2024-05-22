import java.util.Scanner;
//Uso de if contínuo
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua data de nascimento: ");
        int nasc = sc.nextInt();
        int idade = 2024 - nasc;

        System.out.println("Você tem " + idade + " anos");

        if (idade < 16) {
            System.out.println("Você não está apto para votar!");
        } if (idade >= 16 && idade < 18) {
            System.out.println("Você está apto para votar, porém, não é obrigatório!");
        } if (idade > 18 && idade < 70) {
            System.out.println("Você está apto a votar, e seu voto é obrigatório!");
        } if (idade > 70) {
            System.out.println("Você está apto a votar, porém, seu voto não é obrigatório!");
        }
     sc.close();
    }
}
