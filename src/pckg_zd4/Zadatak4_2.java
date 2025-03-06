package pckg_zd4;

import java.util.Scanner;

public class Zadatak4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int suma = 0;

        System.out.print("Unesite n: ");
        n = scanner.nextInt();

        if (n>2147483647){
            System.out.println("Invalid input!!");
            return;
        }
        for (int i = 1; i<=n; i++){
            suma+=i;
        }
        System.out.println("Suma prvih " + n + " prirodnih brojeva iznosi: " + suma);

    }


}
