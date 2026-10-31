import java.util.*;

/* Condición: edad <= 25 Y promedio >= 8.5 ; "Y" se escribe && (ambas deben ser verdaderas). */
public class E5_Beca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();
        boolean puedePostular = edad <= 25 && promedio >= 8.5;
        System.out.println(puedePostular);
    }
}
