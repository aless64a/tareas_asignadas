import java.util.*;

/* Fórmulas: Subtotal = sacos * precio ; Descuento = subtotal * %desc ; Base = subtotal - descuento ;
 *           IVA = base * 0.15 ; Total = base + IVA */
public class T2_P2_DescuentoVolumen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final double PRECIO = 8.50;
        final double IVA = 0.15;
        final double DESC_MEDIO = 0.05;
        final double DESC_ALTO = 0.10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de sacos: ");
        int sacos = sc.nextInt();
        if (sacos <= 0) {
            System.out.println("La cantidad debe ser positiva.");
            return;
        }
        double porcentaje;
        if (sacos <= 20) {
            porcentaje = 0;
        } else if (sacos <= 50) {
            porcentaje = DESC_MEDIO;
        } else {
            porcentaje = DESC_ALTO;
        }
        double subtotal = sacos * PRECIO;
        double descuento = subtotal * porcentaje;
        double base = subtotal - descuento;
        double iva = base * IVA;
        double total = base + iva;
        System.out.printf("Subtotal: $%.2f%nDescuento: $%.2f%nIVA (15%%): $%.2f%nTOTAL: $%.2f%n",
                subtotal, descuento, iva, total);
    }
}
