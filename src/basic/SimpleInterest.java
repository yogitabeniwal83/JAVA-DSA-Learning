package basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle");
        double p = sc.nextDouble();
        System.out.println("Enter the rate");
        double r = sc.nextDouble();
        System.out.println("Enter the time");
        double t = sc.nextDouble();

        double SI = p*r*t/100;
        System.out.println(SI);
    }
}
