import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distância percorrida");
        double distancia = scanner.nextDouble();

        System.out.println("Tempo gasto na viagem");
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double combustivelGasto = distancia / 12.0;

        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Combustível gasto: " + combustivelGasto + " litros");

        scanner.close();
    }
}