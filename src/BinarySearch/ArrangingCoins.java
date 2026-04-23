package BinarySearch;

import java.util.Scanner;

public class ArrangingCoins {
    public static void arrangeCoinsBinarySearch(int n){
    int left = 0, right = n-1;
    int result = 0;

    while(left<=right){
        int mid = left+(right-left)/2;
        long sum = (long) mid*(mid+1)/2;

        if(sum == n){
            result = mid;
            break;
        }
        else if(sum < n){
            result = mid; // mid is valid fully filled rows
            left = mid+1;
        }
        else{
            right = mid-1;
        }
    }
        System.out.println("Complete rows with " + n + "Coins: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        arrangeCoinsBinarySearch(n);
    }
}
