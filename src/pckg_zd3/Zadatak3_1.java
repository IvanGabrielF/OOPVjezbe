package pckg_zd3;

import java.util.Scanner;

public class Zadatak3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite cjelobrojnu vrijednost (int): ");

        if (scanner.hasNextInt()){
            int value = scanner.nextInt();
            System.out.println("Congrats, you entered number: " + value);

        }else {
            System.out.println("Invalid input!!");
        }



    }
}
