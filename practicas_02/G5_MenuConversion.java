import java.util.*;

/* PSEUDOCÓDIGO: mostrar menú; leer opción; según opción (switch) leer el valor y aplicar la conversión.
 * Fórmulas: ft = m * 3.28084 ; lb = kg * 2.20462 ; °F = °C * 9/5 + 32 */
public class G5_MenuConversion {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("1) m -> ft");
        System.out.println("2) kg -> lb");
        System.out.println("3) °C -> °F");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Metros: ");
                double m = sc.nextDouble();
                System.out.printf("%.2f m = %.2f ft%n", m, m * 3.28084);
                break;
            case 2:
                System.out.print("Kilogramos: ");
                double kg = sc.nextDouble();
                System.out.printf("%.2f kg = %.2f lb%n", kg, kg * 2.20462);
                break;
            case 3:
                System.out.print("Grados Celsius: ");
                double c = sc.nextDouble();
                System.out.printf("%.2f °C = %.2f °F%n", c, c * 9.0 / 5 + 32);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
