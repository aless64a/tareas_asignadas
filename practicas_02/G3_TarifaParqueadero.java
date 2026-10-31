import java.util.*;

/* PSEUDOCÓDIGO: leer horas; si horas <= 0 -> inválido; total <- 1.00 + 0.50 * (horas - 1);
 *   si total > 6.00 -> total <- 6.00; mostrar total.
 * Fórmula: Total = primera hora + hora adicional * (horas - 1), con tope diario. */
public class G3_TarifaParqueadero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final double PRIMERA_HORA = 1.00;
        final double HORA_ADICIONAL = 0.50;
        final double TOPE = 6.00;
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas de parqueo: ");
        int horas = sc.nextInt();
        if (horas <= 0) {
            System.out.println("Las horas deben ser positivas.");
            return;
        }
        double total = PRIMERA_HORA + HORA_ADICIONAL * (horas - 1);
        if (total > TOPE) {
            total = TOPE;
        }
        System.out.printf("Total a pagar: $%.2f%n", total);
    }
}
