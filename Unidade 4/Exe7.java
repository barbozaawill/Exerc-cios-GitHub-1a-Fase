public class Exe7 {
    public static void main(String[] args) {
        int latas = 10;
        int garrafas600ml = 5;
        int garrafas2litros = 3;

        double litros = (latas * 0.35) + (garrafas600ml * 0.6) + (garrafas2litros* 2);  
        System.out.println("Foram comprados " + litros + " litros de refrigerante");
    }
}
