import java.util.*;

/* En cada vuelta: n % 10 es la última cifra (se suma) y n /= 10 la elimina. */
public class P3_CuentaCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        long n = Math.abs(sc.nextLong());
        int cifras = 0;
        int suma = 0;
        if (n == 0) {
            cifras = 1;
        }
        while (n != 0) {
            suma += n % 10;
            cifras++;
            n /= 10;
        }
        System.out.println("Cifras: " + cifras);
        System.out.println("Suma de cifras: " + suma);
    }
}
