public class Uni5Exe04 {
    public static void main(String[] args) {
        double S = 0;
        int cima = 3, baixo = 2, incBaixo = 2;
        for (int i = 1; i <= 20; i++) {
          S = S + (cima / (baixo * 1.0)); 
          cima += 2;
          incBaixo += 2;
          baixo += incBaixo;
        }
        System.out.println("Soma: " + S);
    }
}
