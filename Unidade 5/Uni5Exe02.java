
public class Uni5Exe02 {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }

        System.out.println("A soma dos números pares entre 1 e 100 é: " + somaPares);
        System.out.println("A soma dos números ímpares entre 1 e 100 é: " + somaImpares);
    }
}

