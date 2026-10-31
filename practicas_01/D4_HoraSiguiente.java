import java.util.*;

/* Se suma 1 segundo; si s llega a 60 pasa a 0 y suma 1 minuto; si m llega a 60 pasa a 0 y suma 1 hora;
 * si h llega a 24 pasa a 0. Ejemplo: 23 59 59 -> 00:00:00 */
public class D4_HoraSiguiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora (hh mm ss): ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Hora fuera de rango.");
            return;
        }
        s++;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }
        System.out.printf("%02d:%02d:%02d%n", h, m, s);
    }
}
