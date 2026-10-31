/* Un número i es múltiplo de 7 si i % 7 == 0. Entre 1 y 100 hay 14. */
public class P5_MultiplosDe7 {
    public static void main(String[] args) {
        int cuenta = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                cuenta++;
            }
        }
        System.out.println("\nTotal de múltiplos: " + cuenta);
    }
}
