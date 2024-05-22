import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df0 = new DecimalFormat("0");
        int n = sc.nextInt();
        double nro = 8;

        if (n <= 2) {
            System.out.println("O valor de n deve ser maior que 2.");
        } else {
            System.out.println("Os " + n + " primeiros termos da série são: ");
            for (int i = 1; i <= n; i++) {
                System.out.println(df0.format(nro));
                i++;
                if (i <= n)
                    System.out.println(df0.format(nro + 2));
                nro = nro * 2;
            }
        }
        sc.close();
    }
}
