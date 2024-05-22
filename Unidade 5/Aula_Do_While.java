public class Aula_Do_While {
public static void main(String[] args) {
    int contador = 1;
    int potencia = 1;
    do {
        potencia *= contador;
        contador++;
        } while (potencia <= 100);
            System.out.println(potencia);
    }
}
