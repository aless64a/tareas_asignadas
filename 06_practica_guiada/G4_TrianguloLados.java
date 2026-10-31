import java.util.*;

/* PSEUDOCÓDIGO: leer a, b, c; si algún lado <= 0 o la suma de dos lados <= el tercero -> no es triángulo;
 *   si a = b = c -> equilátero; si dos lados iguales -> isósceles; si no -> escaleno.
 * Condición (desigualdad triangular): la suma de dos lados debe ser mayor que el tercero. */
public class G4_TrianguloLados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado a: ");
        double a = sc.nextDouble();
        System.out.print("Lado b: ");
        double b = sc.nextDouble();
        System.out.print("Lado c: ");
        double c = sc.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Los lados no forman un triángulo.");
        } else if (a == b && b == c) {
            System.out.println("Triángulo equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Triángulo isósceles");
        } else {
            System.out.println("Triángulo escaleno");
        }
    }
}
