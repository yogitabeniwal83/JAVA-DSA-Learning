package Loop;

import java.util.Scanner;

public class SumOfNumberAndReverseIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int r = 0;

        if(n < 0){
            n = -n;
        }

        while(n != 0){
            int digit = n % 10;
            sum += digit;
            r = r * 10 + digit;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println(r);
    }
}
