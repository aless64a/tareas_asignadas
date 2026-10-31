import java.util.*;

/* Promedio = suma / cantidad. El valor centinela (-999) termina la lectura y no se cuenta como dato. */
public class C2_SensorCentinela {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final double CENTINELA = -999;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double suma = 0, max = 0, min = 0;
        System.out.print("Lectura (-999 para terminar): ");
        double v = sc.nextDouble();
        while (v != CENTINELA) {
            if (n == 0) {
                max = v;
                min = v;
            } else {
                if (v > max) max = v;
                if (v < min) min = v;
            }
            suma += v;
            n++;
            System.out.print("Lectura (-999 para terminar): ");
            v = sc.nextDouble();
        }
        if (n == 0) {
            System.out.println("No se ingresaron lecturas.");
        } else {
            System.out.printf("Lecturas: %d%nMáximo: %.2f%nMínimo: %.2f%nPromedio: %.2f%n",
                    n, max, min, suma / n);
        }
    }
}
