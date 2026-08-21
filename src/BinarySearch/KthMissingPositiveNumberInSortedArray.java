package BinarySearch;

import java.util.Scanner;

public class KthMissingPositiveNumberInSortedArray {
    public static void KthMissing(int[] arr, int Kth){
        int n = arr.length;
    int left = 0, right = n-1;
    while(left <= right){
        int mid = left + (right-left)/2;
        int correctNumber = mid+1;
        int missing = arr[mid] - correctNumber;
        if(missing >= Kth) right = mid-1;
        else left = mid+1;
    }
        System.out.println(left+Kth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of array");
        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("Enter the Kth element");
        int Kth = sc.nextInt();

        KthMissing(arr, Kth);
    }
}
