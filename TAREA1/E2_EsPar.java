import java.util.*;

/* Un número es par si el residuo de dividirlo para 2 es 0.
 * La expresión (n % 2 == 0) ya es un boolean, por eso se imprime directamente, sin if. */
public class E2_EsPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0);
    }
}
