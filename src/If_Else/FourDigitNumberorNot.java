package If_Else;

import java.util.Scanner;

public class FourDigitNumberorNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        if(n > 999 && n < 10000) {
            System.out.println("It is a four digit Number");
        }
        else {
            System.out.println("Not a Four digit Number");
        }
    }
}
