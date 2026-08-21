package BinarySearch;

import java.util.Scanner;

public class LastOccurance {

    public static void lastOccurance(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int index = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                index = mid;
                left = mid+1;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        if(index != -1){
            System.out.println("Last occurance at index: "+ index);
        }
        else{
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

        lastOccurance(arr, target);
    }
}
