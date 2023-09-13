package oraifeladat09_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alapKod = pinKodMegadas();
        String kod = pinKodBekeres();
        boolean sikeres = kodEllenorzes(alapKod, kod);

    }

    private static String pinKodMegadas() {
       
        Scanner src = new Scanner(System.in);
        String kod = "";
        while (kod.length() < 4 || kod.length() > 6) {
             System.out.print("Hozzon létre egy pin kódot (4-6 hosszúságú)!");
            kod = src.nextLine();
        }
        System.out.println("Sikeresen elmentve!");
        return kod;
    }

    private static String pinKodBekeres() {
        Scanner src = new Scanner(System.in);
        System.out.print("Kód megadása: ");
        String kod = src.nextLine();
        System.out.println("");
        return kod;
    }

    private static boolean kodEllenorzes(String alapKod, String kod) {
        if (alapKod == kod) {
            return true;
        } else {
            return false;
        }
    }

}
