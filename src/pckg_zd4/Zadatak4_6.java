package pckg_zd4;

import java.util.Scanner;

public class Zadatak4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dobroJe = "dobro";
        String boljeJe = "bolje";
        String najboljeJe = "najbolje";
        String unos;

        System.out.print("Kako se osjećate danas? ");
        unos = scanner.nextLine().toLowerCase();

        if (unos.equals("dobro") || unos.equals("bolje") || unos.equals("najbolje")){
            System.out.println("Hvala danas sam: " + unos);
        }
        else {
            System.out.println("Sigurno će biti bolje😁");
        }




    }
}
