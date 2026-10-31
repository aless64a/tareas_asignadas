import java.util.*;

/* Fila i de la mitad superior: (n - i) espacios y (2*i - 1) asteriscos. La mitad inferior es la misma sin repetir la fila central. */
public class C4_RomboAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño n (filas hasta el centro): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fila(n, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            fila(n, i);
        }
    }

    static void fila(int n, int i) {
        for (int e = 1; e <= n - i; e++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
