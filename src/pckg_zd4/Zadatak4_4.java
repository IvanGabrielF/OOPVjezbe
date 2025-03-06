package pckg_zd4;

import java.util.Scanner;

public class Zadatak4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unos;
        String opcija;

        while (true) {
            System.out.print("Unesite string: ");
            unos = scanner.nextLine();

            System.out.println("Vaš unos: " + unos);

            System.out.print("Želite li ponoviti unos? ('y' za da): ");
            opcija = scanner.nextLine().toLowerCase();

            if (!opcija.equals("y")) {
                System.out.println("Izlaz iz programa!");
                break;
            }
        }

    }
}
