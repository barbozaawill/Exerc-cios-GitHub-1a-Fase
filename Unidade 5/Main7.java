import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s=0;
        String resp;

        do {
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            s += n; // s = s + n;
            System.out.println("Deseja continuar? [S/N] ");
            resp = sc.next();


        } while (resp.equals("S"));
        System.out.println("A soma dos números é: " + s);
        sc.close();
    }
}
