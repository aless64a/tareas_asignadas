import java.util.*;

/* Horas = minutos / 60 (división entera) ; Minutos restantes = minutos % 60
 * Ejemplo: 135 / 60 = 2 h ; 135 % 60 = 15 min. */
public class E4_MinutosAHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos: ");
        int total = sc.nextInt();
        int horas = total / 60;
        int minutos = total % 60;
        System.out.println(total + " min = " + horas + " h " + minutos + " min");
    }
}
