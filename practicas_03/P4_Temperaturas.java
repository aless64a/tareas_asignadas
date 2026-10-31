import java.util.*;

/* Promedio = suma / cantidad. Termina al leer -999 (centinela), que no se cuenta como dato. */
public class P4_Temperaturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double suma = 0, max = 0, min = 0;
        System.out.print("Temperatura (-999 para terminar): ");
        double t = sc.nextDouble();
        while (t != -999) {
            if (n == 0 || t > max) max = t;
            if (n == 0 || t < min) min = t;
            suma += t;
            n++;
            System.out.print("Temperatura (-999 para terminar): ");
            t = sc.nextDouble();
        }
        if (n == 0) {
            System.out.println("No se ingresaron temperaturas.");
        } else {
            System.out.printf("Mayor: %.1f%nMenor: %.1f%nPromedio: %.2f%n", max, min, suma / n);
        }
    }
}
