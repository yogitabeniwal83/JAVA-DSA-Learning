package BinarySearch;

import java.util.Scanner;

public class FloorInSortedArray {

    public static void floorInArray(int[] arr, int x){
        int left = 0, right = arr.length-1;
        int index = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] > x){
                right = mid-1;
            }
            else{ // if(arr[mid] <= x)
                index = mid;
                left = mid+1;
            }
        }

        if(index != -1){
            System.out.println("find floor element: "+ index);
        }
        else{
            System.out.println("not found");
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

        System.out.println("Enter value of x");
        int x = sc.nextInt();

        floorInArray(arr, x);
    }
}
