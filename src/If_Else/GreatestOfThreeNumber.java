package If_Else;

import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        System.out.println("Enter third number");
        int z = sc.nextInt();

        if(x > y && x > z) {
            System.out.println("x is greatest");
        }
        else if(y > x && y > z) {
            System.out.println("y is greatest");
        }
        else if(z > x && z > y) {
            System.out.println("z is greatest");
        }
        else {
            System.out.println("all are equal");
        }
    }
}
