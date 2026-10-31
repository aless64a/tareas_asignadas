import java.util.*;

/* do-while repite el menú hasta elegir 4 (salir); switch ejecuta la opción elegida. */
public class C5_CajeroAutomatico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcion;
        do {
            System.out.println("\n--- CAJERO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double dep = sc.nextDouble();
                    if (dep > 0) {
                        saldo += dep;
                        System.out.printf("Nuevo saldo: $%.2f%n", saldo);
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double ret = sc.nextDouble();
                    if (ret <= 0) {
                        System.out.println("Monto inválido.");
                    } else if (ret > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= ret;
                        System.out.printf("Nuevo saldo: $%.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}
