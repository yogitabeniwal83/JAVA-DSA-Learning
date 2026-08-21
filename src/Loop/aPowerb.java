package Loop;

import java.util.Scanner;

public class aPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();

        int power = 1;
        for(int i=1; i<=b; i++){
            power *= a;
        }
        System.out.println(a+"raised to power" +b+" is " +power);
    }
}
