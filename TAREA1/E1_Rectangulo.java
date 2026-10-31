import java.util.*;

/* Fórmulas: Área del rectángulo = base * altura ; Perímetro = 2 * (base + altura)
 * Explicación: se leen base y altura, se aplican las dos fórmulas y se muestran con 2 decimales. */
public class E1_Rectangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.printf("Área = %.2f%nPerímetro = %.2f%n", area, perimetro);
    }
}
