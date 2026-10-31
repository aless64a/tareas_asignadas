import java.util.*;

/* PSEUDOCÓDIGO: leer a, b, c; si a = 0 -> no es cuadrática; d <- b^2 - 4ac;
 *   si d > 0 -> dos raíces; si d = 0 -> raíz doble; si d < 0 -> sin raíces reales.
 * Fórmulas: Discriminante D = b^2 - 4ac ; x = (-b ± raíz(D)) / (2a) ; raíz doble x = -b / (2a) */
public class G1_EcuacionCuadratica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("No es una ecuación cuadrática (a = 0).");
            return;
        }
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("x1 = %.4f%nx2 = %.4f%n", x1, x2);
        } else if (d == 0) {
            System.out.printf("Raíz doble: x = %.4f%n", -b / (2 * a));
        } else {
            System.out.println("Sin raíces reales");
        }
    }
}
