import java.util.*;

/* Fórmulas: °F = °C * 9/5 + 32 ; K = °C + 273.15
 * Se usa 9.0 para que la división sea decimal y no entera. */
public class L1_Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura en °C: ");
        double c = sc.nextDouble();
        double f = c * 9.0 / 5 + 32;
        double k = c + 273.15;
        System.out.printf("%.2f °C = %.2f °F = %.2f K%n", c, f, k);
    }
}
