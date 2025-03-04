package pckg_zd2;

import java.util.Scanner;

public class Zadatak2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        float c;
        System.out.print("Unesite prvi broj: ");
        a = scanner.nextInt();
        System.out.print("Unesite drugi broj: ");
        b = scanner.nextInt();

        int umnozak = (a*b);
        int kolicnik = (a/b);
        int ostatakDijeljenja = (a%b);
        int zbroj = (a+b);
        int razlika = (a-b);

        System.out.println("Umnožak vrijednosti je: " + umnozak);
        System.out.println("Količnik vrijednosti je: " + kolicnik);
        System.out.println("Ostatak dijeljenja vrijednosti je: " + ostatakDijeljenja);
        System.out.println("Zbroj vrijednosti je: " + zbroj);
        System.out.println("Razlika vrijednosti je: " + razlika);

        System.out.println("**********************************");

        System.out.print("Unesite decimalni broj c: ");
        c = scanner.nextFloat();
        float korijen = (float) Math.sqrt(c);
        float abs = Math.abs(c);

        System.out.println("Korijen broja " + c + " je: " + korijen);
        System.out.println("Apsolutna vrijednost broja " + c + " je: " + abs);















    }
}
