/* Ciclos anidados: el for externo recorre el primer factor (1-10) y el interno el segundo (1-10). */
public class C1_TablaMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
