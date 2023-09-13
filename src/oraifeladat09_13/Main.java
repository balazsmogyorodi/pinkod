package oraifeladat09_13;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner src = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        teljesProgram();
    }

    private static void teljesProgram() {
        String alapKod = pinKodMegadas();
        boolean sikeres = false;
        int probalkozas = 3;
        while (sikeres == false && probalkozas > 0) {
            String kod = pinKodBekeres(probalkozas);
            sikeres = kodEllenorzes(alapKod, kod);
            probalkozas--;
        }
        uzenet(sikeres);
        randomizalo();
    }

    private static void uzenet(boolean sikeres) {
        if (sikeres == false) {
            System.out.println("Hibás pinkód!");
        } else {
            System.out.println("Sikeres belépés!");
        }
    }

    private static String pinKodMegadas() {
        String kod = "";
        while (kod.length() < 4 || kod.length() > 6) {
            System.out.print("Hozzon létre egy pin kódot (4-6 hosszúságú)!");
            kod = src.nextLine();
        }
        System.out.println("Sikeresen elmentve!");
        return kod;
    }

    private static String pinKodBekeres(int probalkozas) {
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

    private static void randomizalo() {

        HashSet<Integer> szamok = new HashSet<Integer>();
        while ( szamok.size() < 10) {
            szamok.add(rnd.nextInt(10));
        }
        int sor = 0;
        for (int szam : szamok) {
            System.out.println(szam);
        /*    if ((sor + 1) % 3 == 0) {
                System.out.println("");
                sor ++;
            }*/
        }
        
        }
}
