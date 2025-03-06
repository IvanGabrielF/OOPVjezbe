package pckg_zd4;

import java.util.Scanner;

public class Zadatak4_7 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String unos;
        System.out.print("Kako se osjećate danas? ");
        unos = scanner.nextLine().toLowerCase();


        switch (unos){
            case "dobro" -> System.out.println("Hvala, danas sam: " + unos);
            case "bolje" -> System.out.println("Hvala, danas sam: " + unos);
            case "najbolje" -> System.out.println("Hvala, danas sam: " + unos);
            default -> System.out.println("Sigurno će biti bolje😁");

        }


    }
}
