import java.util.*;

/* PSEUDOCÓDIGO: leer año; si (año % 4 = 0 Y año % 100 != 0) O año % 400 = 0 -> bisiesto; si no -> no bisiesto. */
public class G2_AnioBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Año: ");
        int anio = sc.nextInt();
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
        if (bisiesto) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " no es bisiesto.");
        }
    }
}
