import java.util.Scanner;
//básico
public class Main2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite sua data de nascimento: ");

            int nasc = sc.nextInt();
            int idade = 2024 - nasc;


            System.out.println("Você tem " + idade + " anos");
        }
    }
    
}
