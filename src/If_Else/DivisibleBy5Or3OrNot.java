package If_Else;

import java.util.Scanner;

public class DivisibleBy5Or3OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = sc.nextInt();

        if(x % 5 == 0 || x % 3 == 0) {
            System.out.println("Dvisible by 5 or 3");
        }
        else {
            System.out.println("Not Divisible by 5 or 3");
        }

    }
}
