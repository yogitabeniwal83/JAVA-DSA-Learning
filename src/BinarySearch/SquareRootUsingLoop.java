package BinarySearch;

import java.util.Scanner;

public class SquareRootUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

//        int[] arr = new int[n];
        int root = 0;
        for(int i=1; i<=n; i++){
            if(i*i > n) break;
            root = i;
        }
        System.out.println("Square root = "+ root);
    }
}

// time complexity = O(root n)