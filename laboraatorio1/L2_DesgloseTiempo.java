import java.util.*;

/* Horas = total / 3600 ; Minutos = (total % 3600) / 60 ; Segundos = total % 60 */
public class L2_DesgloseTiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tiempo total en segundos: ");
        int total = sc.nextInt();
        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;
        System.out.printf("%d s = %d h %d min %d s%n", total, horas, minutos, segundos);
    }
}
