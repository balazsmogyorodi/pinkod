package oraifeladat09_13;

import java.util.Scanner;

public class Pinkod {

    String kod;
    Scanner src = new Scanner(System.in);

    public Pinkod() {
        pinkodAdatBealitas();

    }

    public void pinkodAdatBealitas() {
        kod = "";
        while (kod.length() < 4 || kod.length() > 6) {
            System.out.print("Hozzon létre egy pin kódot (4-6 hosszúságú)!");
            kod = src.nextLine();
        }
        System.out.println("Sikeresen elmentve!");
    }

    public String getKod() {
        return kod;
    }
    
   
    

}
