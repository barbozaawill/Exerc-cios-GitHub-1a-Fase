public class Exe5 {
    public static void main(String[] args) {
        int quantidadeFrangos = 100;
        double custoAnelChip = 4.00;
        double custoAnelAlimento = 3.50;

        double gastoTotal = quantidadeFrangos * (custoAnelChip + 2 * custoAnelAlimento);
        System.out.println("O gasto total da granja para marcar os frangos é: R$ " + gastoTotal);
    }
}