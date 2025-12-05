package If_Else;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        double n = sc.nextDouble();  // n = 3.14

        int x = (int)n;  // 3
        if(n-x > 0) {  // 0.14
            System.out.println("Not an integer");
        }
        else {
            System.out.println("Is an Integer");
        }

    }
}
