import java.util.*;

/* Fórmulas: Serie: Req = R1 + R2 ; Paralelo: Req = (R1 * R2) / (R1 + R2)
 * Explicación: se valida que sean positivas y un switch elige la fórmula según la letra S o P. */
public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Resistencia 1 (ohm): ");
        double r1 = sc.nextDouble();
        System.out.print("Resistencia 2 (ohm): ");
        double r2 = sc.nextDouble();
        if (r1 <= 0 || r2 <= 0) {
            System.out.println("Error: las resistencias deben ser positivas.");
            return;
        }
        System.out.print("Conexión (S = serie, P = paralelo): ");
        char tipo = Character.toUpperCase(sc.next().charAt(0));
        double req;
        switch (tipo) {
            case 'S':
                req = r1 + r2;
                break;
            case 'P':
                req = (r1 * r2) / (r1 + r2);
                break;
            default:
                System.out.println("Tipo de conexión inválido.");
                return;
        }
        System.out.printf("Resistencia equivalente = %.2f ohm%n", req);
    }
}
