package Loop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

//        if(n < 0) n = -n;
         int sum = 0;
         while(n != 0){
             // int lastDigit = n%10     sum += lastDigit
             sum += n%10;    // n%10  gives the last digit of a number
             n /= 10;

         }
        System.out.println((sum>0) ? sum : -sum);
    }
}
