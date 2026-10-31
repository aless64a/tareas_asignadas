import java.util.*;

/* do-while: se pide el número al menos una vez y se repite mientras no sea el secreto (1 a 100). */
public class C3_AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = new Random().nextInt(100) + 1;
        int intentos = 0;
        int n;
        System.out.println("Adivina el número entre 1 y 100.");
        do {
            System.out.print("Tu número: ");
            n = sc.nextInt();
            intentos++;
            if (n < secreto) {
                System.out.println("Muy bajo.");
            } else if (n > secreto) {
                System.out.println("Muy alto.");
            } else {
                System.out.println("¡Correcto! Lo lograste en " + intentos + " intentos.");
            }
        } while (n != secreto);
    }
}
