import java.util.*;

/* Fórmulas: Subtotal = precio * cantidad ; IVA = subtotal * 0.15 ; Total = subtotal + IVA */
public class L4_FacturaIVA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final double IVA = 0.15;
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        double subtotal = precio * cantidad;
        double iva = subtotal * IVA;
        double total = subtotal + iva;
        System.out.printf("Subtotal: $%.2f%nIVA (15%%): $%.2f%nTotal: $%.2f%n", subtotal, iva, total);
    }
}
