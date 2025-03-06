package pckg_zd4;

import java.util.Scanner;

public class Zadatak4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unos;

        System.out.print("Unesite željenu sortu masline (oblica ILI levantinka ILI lastovka): ");
        unos =scanner.nextLine().toLowerCase();

        switch (unos){
            case "oblica" -> System.out.println("Posadili ste oblicu.");
            case "levantinka" -> System.out.println("Posadili ste levantinku.");
            case "lastovka" -> System.out.println("Posadili ste lastovku.");
            default -> System.out.println("Tu sortu nemamo u ponudi!");

        }

    }
}
