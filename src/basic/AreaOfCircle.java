package basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // area = pi*r*r

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.println(a);
    }
}
