package If_Else;

import java.util.Scanner;

public class MagnitudeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = sc.nextInt();

        if(x < 69) {
            System.out.println("the magnitude is smaller than 69");
        }
        else {
            System.out.println("the magnitude is not smaller than 69");
        }


    }
}
