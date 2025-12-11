package Loop;

import java.util.Scanner;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if(n==0) n = 1;
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;

        }
        System.out.println(count );
    }
}
