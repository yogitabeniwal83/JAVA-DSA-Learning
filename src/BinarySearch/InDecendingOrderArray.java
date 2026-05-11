package BinarySearch;

import java.util.Scanner;

public class InDecendingOrderArray {

    public static void decendingArray(int[] arr, int target){
        int left = 0, right = arr.length-1;
        boolean found = false;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                System.out.println("Element found at index: "+ mid);
                found = true;
                break;
            }
            else if(arr[mid] < target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
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
        System.out.println("Enter target element");
        int target = sc.nextInt();

        decendingArray(arr, target);
    }
}
