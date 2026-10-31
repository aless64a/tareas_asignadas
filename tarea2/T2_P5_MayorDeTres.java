import java.util.*;

/* Se busca cuál es el mayor; luego se comparan los otros dos para ordenar de mayor a menor. */
public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        double a = sc.nextDouble();
        System.out.print("Número 2: ");
        double b = sc.nextDouble();
        System.out.print("Número 3: ");
        double c = sc.nextDouble();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " > " + b + " > " + c);
            } else {
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " > " + a + " > " + c);
            } else {
                System.out.println(b + " > " + c + " > " + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + " > " + a + " > " + b);
            } else {
                System.out.println(c + " > " + b + " > " + a);
            }
        }
    }
}
