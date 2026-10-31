/* Evaluación a mano (prioridad: paréntesis, * / %, luego + -; int / int da entero):
 * 1) 5 + 7 / 2 * 3          = 5 + 3 * 3 = 5 + 9 = 14
 * 2) (5 + 7) / 2.0 * 3      = 12 / 2.0 * 3 = 6.0 * 3 = 18.0
 * 3) 17 % 4 + 2 * 3 - 1     = 1 + 6 - 1 = 6
 * 4) (int) 7.9 + 7 / 2      = 7 + 3 = 10
 * 5) 8 > 3 && 2 != 3        = true && true = true   (en la foto la 5 está cortada; ajusta el valor tras != ) */
public class L5_ExpresionesAMano {
    public static void main(String[] args) {
        System.out.println("1) " + (5 + 7 / 2 * 3));
        System.out.println("2) " + ((5 + 7) / 2.0 * 3));
        System.out.println("3) " + (17 % 4 + 2 * 3 - 1));
        System.out.println("4) " + ((int) 7.9 + 7 / 2));
        System.out.println("5) " + (8 > 3 && 2 != 3));
    }
}
