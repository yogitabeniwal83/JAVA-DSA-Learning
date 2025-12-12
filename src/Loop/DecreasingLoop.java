package Loop;

import java.util.Scanner;

public class DecreasingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for(int i=8; i>=n; i--){
            System.out.println(i);
        }
    }
}
