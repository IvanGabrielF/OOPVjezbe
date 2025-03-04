package pckg_zd2;

import java.util.Scanner;

public class Zadatak2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value;
        System.out.print("Please enter a value (double): ");
        value = scanner.nextDouble();
        double kvadrat = Math.pow(value,2);
        double kub = Math.pow(value,3);


        if (value <= 0){
            System.out.println("Invalid input!!!");
        }
        else {
            System.out.println("Kvadrat broja " + value + " je: " + kvadrat);
            System.out.println("Kub broja " + value + " je: " + kub);

        }
    }
}
