import java.util.*;

/* Fórmula (suma de Gauss): S = n(n+1)/2. Se calcula con un for y se compara con la fórmula. */
public class P1_SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        long suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        long formula = (long) n * (n + 1) / 2;
        System.out.println("Suma con ciclo: " + suma);
        System.out.println("Suma con fórmula: " + formula);
        System.out.println("¿Coinciden? " + (suma == formula));
    }
}
