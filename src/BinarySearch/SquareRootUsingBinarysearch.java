package BinarySearch;

import java.util.Scanner;

public class SquareRootUsingBinarysearch {
    public static void squareRoot(int n){
        int left = 1, right = n;
        int ans = 0;
        while(left <= right){
            int mid = (left+right)/2;
            if(mid*mid == n){
                System.out.println("Square Root = " + mid);
            }
                else if(mid*mid > n){
                    right = mid-1;
            }
            else {
                ans = mid;
                left = mid+1;
            }
        }
        System.out.println("Square root = " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        squareRoot(n);
    }
}
