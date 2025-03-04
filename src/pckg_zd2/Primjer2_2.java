package pckg_zd2;

import java.util.Scanner;

public class Primjer2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r;
        double volume;
        System.out.print("Please enter a radius: ");
        r = scanner.nextDouble();
        volume = (4.0/3.0)*Math.PI*Math.pow(r,3);

        System.out.println("Volume is: " + volume);



    }
}
