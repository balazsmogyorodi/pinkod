package oraifeladat09_13;

import java.util.ArrayList;
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
        int szamTomb [] = randomizalo(0, 9);
        int sor = 1;
        for (int i = 0; i < szamTomb.length; i++) {
            System.out.print(szamTomb[i]);
            if(sor % 3 == 0) {
                System.out.println("");
                sor = 1;
            } else{
                 sor ++;
            }
           
        }

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
        System.out.print("Kód megadása (probálkozási lehetőség:" + probalkozas + "): ");
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

    private static int[] randomizalo(int start, int end) {
        Random rand = new Random();
        ArrayList<Integer> szamok = new ArrayList<Integer>();
        int szamTomb[] = new int[end - start + 1];
        for (int i = 0; i < 10; i++) {
            szamok.add(i);
        }
        int szamtomb[] = new int[szamok.size()];
        int alap = start;
        for (int i = 0; i < (end - start + 1); i++) {
            int index = rand.nextInt(0, szamok.size());
            int valaszottSzam = szamok.get(index);
            szamTomb[i] = valaszottSzam;
        }
        return szamTomb;

    }
}
