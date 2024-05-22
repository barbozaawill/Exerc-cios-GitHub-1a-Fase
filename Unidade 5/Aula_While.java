public class Aula_While {
    public static void main(String[] args) {
        int contador = 1;
        int potencia = 1;
        while (potencia <= 100) {
            potencia *= contador;
            contador++;
        }
        System.out.println(potencia);
    }
}