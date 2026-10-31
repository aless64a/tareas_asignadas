import java.util.*;

/* Fórmula: n! = 1 * 2 * 3 * ... * n (0! = 1). do-while valida n >= 0; se usa long y se limita a n <= 20,
 * porque 21! ya no cabe en un long. */
public class P2_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("n (0 a 20): ");
            n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor inválido.");
            }
        } while (n < 0 || n > 20);
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}
