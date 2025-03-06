package pckg_zd3;

import java.util.Scanner;

public class Primjer3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float realNum;
        double res;
        System.out.print("Please enter a number: ");
        realNum = scanner.nextFloat();

        if (realNum < 0){
            res = (Math.abs(realNum));
            System.out.println("Absolute value is: " + res);

        } else if (realNum > 0) {
            res = Math.cbrt(realNum);
            System.out.println("Third root is: " + res);

        }
        else {
            System.out.println("Unijeli ste nulu!!");
        }

    }
}
