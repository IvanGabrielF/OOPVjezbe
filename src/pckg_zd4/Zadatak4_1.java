package pckg_zd4;

import java.util.Scanner;

public class Zadatak4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;
        double volume;


        while (radius < 10){
            System.out.print("Please enter a radius: ");
            radius = scanner.nextDouble();

            if (radius >= 10){
                System.out.println("Unesena vrijednost prelazi 10!");

            }
            volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
            System.out.println("Volumen je: " + volume);
        }
    }

}
