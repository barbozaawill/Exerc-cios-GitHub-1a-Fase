import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas = 16;
        int biscoitosQuebradosTotal = 0; 
        int biscoitosQuebradosHoraAnterior = 1;

        for (int hora = 1; hora <= horas; hora++) {
            biscoitosQuebradosTotal += biscoitosQuebradosHoraAnterior;
            biscoitosQuebradosHoraAnterior *= 3;
        }
        sc.close();
        System.out.println("Total de biscoitos quebrados em um dia: " + biscoitosQuebradosTotal);
    }
}
