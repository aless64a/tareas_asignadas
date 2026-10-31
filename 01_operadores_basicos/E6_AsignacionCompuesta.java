/* Evaluación a mano:
 *   int x = 4;        -> x = 4
 *   x *= 3;           -> x = 4 * 3 = 12
 *   x %= 5;           -> x = 12 % 5 = 2
 *   x += x++;         -> x = 2 + 2 = 4
 * Última línea: x += x++ equivale a x = x + (x++). Java guarda primero el valor izquierdo (2),
 * x++ devuelve 2 (y pone x en 3), y la asignación final sobrescribe x con 2 + 2 = 4. */
public class E6_AsignacionCompuesta {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("x = 4   -> x = " + x);
        x *= 3;
        System.out.println("x *= 3  -> x = " + x);
        x %= 5;
        System.out.println("x %= 5  -> x = " + x);
        x += x++;
        System.out.println("x += x++ -> x = " + x);
    }
}
