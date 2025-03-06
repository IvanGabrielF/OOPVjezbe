package pckg_zd4;

import java.util.Scanner;

public class Zadatak4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;


        while (true){
            System.out.print("Unesite integer n: ");
            n = scanner.nextInt();
            if (n == 158){
                System.out.println("Unesena je tražena vrijednost!");
                break;
            }
        }
    }
}
