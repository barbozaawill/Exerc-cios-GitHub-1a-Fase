import java.util.Scanner;
//Uso de while
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cc = 0;

        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota! " + cc);
            
        }
        sc.close();
        }
    }

