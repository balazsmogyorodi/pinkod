package oraifeladat09_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alapKod = pinKodMegadas();
        boolean sikeres = false;
        int probalkozas = 3;
        while (sikeres == false && probalkozas > 0) {
            String kod = pinKodBekeres(probalkozas);
            sikeres = kodEllenorzes(alapKod, kod);
            probalkozas--;
        }
        if (sikeres == false) {
            System.out.println("Hibás pinkód!");
        } else {
            System.out.println("Sikeres belépés!");
        }
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

    private static String pinKodBekeres(int probalkozas) {
        Scanner src = new Scanner(System.in);
        System.out.print("Kód megadása (probálkozási lehetőség:"+ probalkozas  +"): ");
        String kod = src.nextLine();
        System.out.println("");
        return kod;
    }

    private static boolean kodEllenorzes(String alapKod, String kod) {
        if (kod.equals(alapKod)) {
            return true;
        } else {
            return false;
        }
    }
}
