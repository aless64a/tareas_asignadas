import java.util.*;

/* Si el ángulo es mayor que 360 se reduce con a % 360 (si da 0 es una vuelta completa = 360).
 * Agudo: 0 < a < 90 | Recto: 90 | Obtuso: 90 < a < 180 | Llano: 180 | Cóncavo: 180 < a < 360 | Completo: 360 */
public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ángulo en grados: ");
        double a = sc.nextDouble();
        if (a < 0) {
            System.out.println("El ángulo no puede ser negativo.");
            return;
        }
        if (a > 360) {
            a = a % 360;
            if (a == 0) {
                a = 360;
            }
            System.out.println("Ángulo reducido: " + a);
        }
        if (a == 0) {
            System.out.println("Ángulo nulo");
        } else if (a < 90) {
            System.out.println("Agudo");
        } else if (a == 90) {
            System.out.println("Recto");
        } else if (a < 180) {
            System.out.println("Obtuso");
        } else if (a == 180) {
            System.out.println("Llano");
        } else if (a < 360) {
            System.out.println("Cóncavo");
        } else {
            System.out.println("Completo");
        }
    }
}
