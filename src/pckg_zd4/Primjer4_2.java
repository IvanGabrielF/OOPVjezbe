package pckg_zd4;

import java.util.Scanner;

public class Primjer4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite n: ");

        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i<=n;i++){
            suma+=i;
        }
        System.out.println("Suma prvih " + n + " brojeva je: " + suma);
    }
}
