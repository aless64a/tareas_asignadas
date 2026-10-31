/* Población(h) = 100 * 2^h. Se duplica cada hora hasta superar 1 000 000 (resultado: 14 horas). */
public class P6_Bacterias {
    public static void main(String[] args) {
        long bacterias = 100;
        int horas = 0;
        while (bacterias <= 1000000) {
            bacterias *= 2;
            horas++;
            System.out.println("Hora " + horas + ": " + bacterias);
        }
        System.out.println("Supera 1 000 000 en " + horas + " horas.");
    }
}
