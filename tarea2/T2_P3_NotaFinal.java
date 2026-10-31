import java.util.*;

/* Fórmula: Promedio = (n1 + n2 + n3) / 3
 * Aprobado >= 14 ; Supletorio entre 9 y 13.99 ; Reprobado < 9. */
public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1 (sobre 20): ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2 (sobre 20): ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3 (sobre 20): ");
        double n3 = sc.nextDouble();
        if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20 || n3 < 0 || n3 > 20) {
            System.out.println("Las notas deben estar entre 0 y 20.");
            return;
        }
        double promedio = (n1 + n2 + n3) / 3;
        System.out.printf("Promedio: %.2f%n", promedio);
        if (promedio >= 14) {
            System.out.println("Aprobado");
        } else if (promedio >= 9) {
            System.out.println("Supletorio");
        } else {
            System.out.println("Reprobado");
        }
    }
}
