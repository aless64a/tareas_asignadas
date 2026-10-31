import java.util.*;

/* Ejemplo 472: centenas = 472 / 100 = 4 ; decenas = (472 / 10) % 10 = 7 ; unidades = 472 % 10 = 2
 * "/" entre enteros descarta los decimales y "%" da el residuo. */
public class E3_Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de 3 cifras: ");
        int n = sc.nextInt();
        int centenas = n / 100;
        int decenas = (n / 10) % 10;
        int unidades = n % 10;
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
    }
}
