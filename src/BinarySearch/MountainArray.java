package BinarySearch;

import java.util.Scanner;

public class MountainArray {

    public static void mountainArray(int[] arr){
        int left = 1, right = arr.length-2;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                System.out.println("Peak element index : "+ mid);
                return; // stop search after found
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        System.out.println("no peak element found");
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

        mountainArray(arr);

    }
}
