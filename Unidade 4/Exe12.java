import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de horas trabalhadas mensair:");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o número de dependentes");
        int numeroDependentes = scanner.nextInt();

        double salarioHora = 10.00;
        double salarioFamilia = 60.00;
        double salarioBruto = salarioHora * horasTrabalhadas + salarioFamilia * numeroDependentes;
        double inss = 0.085 * salarioBruto;
        double impostoRenda = 0.05 * salarioBruto;
        double salarioLiquido = salarioBruto - inss - impostoRenda;

        System.out.println("Nome " + nome);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);



        scanner.close();
    }
}