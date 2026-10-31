import java.util.*;

/* Número de 4 cifras (ej. 4723): miles = n / 1000 ; centenas = (n / 100) % 10 ;
 * decenas = (n / 10) % 10 ; unidades = n % 10 ; suma = suma de las cuatro cifras. */
public class L3_CifrasNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de 4 cifras: ");
        int n = sc.nextInt();
        int miles = n / 1000;
        int centenas = (n / 100) % 10;
        int decenas = (n / 10) % 10;
        int unidades = n % 10;
        System.out.println("Miles: " + miles);
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        System.out.println("Suma de cifras: " + (miles + centenas + decenas + unidades));
    }
}
