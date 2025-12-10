package Loop;

import java.util.Scanner;

public class CompositeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean flag = true;  // true means prime

        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false; // false means composite
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime Nor Composite");
        else if(flag == false) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}
