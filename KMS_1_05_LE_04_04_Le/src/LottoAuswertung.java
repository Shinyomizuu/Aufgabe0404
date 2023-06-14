import java.util.Scanner;

public class LottoAuswertung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ein wie oft Sie ziehen möchten: ");
        int ziehungen = scanner.nextInt();
        int [] auswertung_array = new int[46];
        int gezogeneZahlen = 0;

        for (int i = 0; i < ziehungen; i ++) {
            System.out.println(i + 1  + ".Durchlauf");
            for (int j = 0; j < 6; j ++) {
                int random_number = (int)(Math.random() * 45 + 1);
                auswertung_array[random_number] += 1;
                System.out.print(random_number + " ");
            }
            System.out.println("");
        }
        for (int i = 1; i < auswertung_array.length; i++) {
            if (auswertung_array[i] > 0) {
                gezogeneZahlen += auswertung_array[i];
            }
        }

        for (int i = 1; i < auswertung_array.length; i++) {
            if (auswertung_array[i] > 0) {
                double prozent_auswertung = (double) auswertung_array[i] * 100 / gezogeneZahlen;
                System.out.printf("%d: %d, %.2f%%\n", i, auswertung_array[i], prozent_auswertung);
            }
        }
    }
}